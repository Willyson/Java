package com.example.suzan.market.telas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.suzan.market.R;
import com.example.suzan.market.dbs.ProdutosBd;
import com.example.suzan.market.modelo.Produtos;

public class FormularioProduto extends AppCompatActivity {
    EditText edtNomeProduto, edtValor;
    Button btn_Poliform;
    Produtos editarProduto, produto;
    ProdutosBd bdHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_produto);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Menu");

        produto = new Produtos();
        bdHelper = new ProdutosBd(FormularioProduto.this);

        Intent intent = getIntent();
        editarProduto = (Produtos) intent.getSerializableExtra("produto-escolhido");

        edtNomeProduto = (EditText) findViewById(R.id.edtNomeProduto);
        edtValor = (EditText) findViewById(R.id.edtValor);

        btn_Poliform = (Button) findViewById(R.id.btn_Poliform);

        if (editarProduto != null){
            btn_Poliform.setText("Modificar Produto");

            edtNomeProduto.setText(editarProduto.getNomeProduto());
            edtValor.setText(editarProduto.getValorProduto());

            produto.setId(editarProduto.getId());

        } else {
            btn_Poliform.setText("Cadastrar Novo Produto");
        }

        btn_Poliform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                produto.setNomeProduto(edtNomeProduto.getText().toString());
                produto.setValorProduto(edtValor.getText().toString());

                if (btn_Poliform.getText().toString().equals("Cadastrar Novo Produto")){
                    bdHelper.SalvarProduto(produto);
                    Toast.makeText(getApplicationContext(), "Produto Cadastrado",Toast.LENGTH_SHORT).show();
                    Intent cadastro = new Intent(FormularioProduto.this, AddProduto.class);
                    startActivity(cadastro);
                }else{
                    bdHelper.alterarProduto(produto);
                    bdHelper.banco.close();
                    Toast.makeText(getApplicationContext(), "Produto Alterado",Toast.LENGTH_SHORT).show();
                    Intent back = new Intent(FormularioProduto.this, AddProduto.class);
                    startActivity(back);
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                startActivity(new Intent(this, AddProduto.class));
                finishAffinity();
                break;
            default:break;
        }
        return true;
    }
}
