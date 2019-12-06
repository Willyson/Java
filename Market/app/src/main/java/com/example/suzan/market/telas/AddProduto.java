package com.example.suzan.market.telas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.suzan.market.R;
import com.example.suzan.market.dbs.ProdutosBd;
import com.example.suzan.market.modelo.Produtos;

import java.util.ArrayList;

public class AddProduto extends AppCompatActivity {

    ListView lista;
    ProdutosBd bdHelper;
    ArrayList<Produtos> listview_Produtos;
    Produtos produto;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_produto);

        //botao voltar ao menu
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Menu");

        Button btnCadastrar = (Button) findViewById(R.id.btn_Cadastrar);
        btnCadastrar.setOnClickListener(new android.view.View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(AddProduto.this, FormularioProduto.class);
                startActivity(intent);
            }
        });


        lista = (ListView) findViewById(R.id.listView_Produtos);
        registerForContextMenu(lista);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {
                Produtos produtoEscolhido = (Produtos) adapter.getItemAtPosition(position);

                Intent i = new Intent(AddProduto.this, FormularioProduto.class);
                i.putExtra("produto-escolhido", produtoEscolhido);
                startActivity(i);
            }
        });

        lista.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(){
            @Override
            public boolean onItemLongClick(AdapterView<?> adapter, View view, int position, long id) {
                produto = (Produtos)adapter.getItemAtPosition(position);
                return false;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                startActivity(new Intent(this, Menu.class));
                finishAffinity();
                break;
            default:break;
        }
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuItem menuDelete = menu.add("Deletar Este Produto");
        menuDelete.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                bdHelper = new ProdutosBd(AddProduto.this);
                bdHelper.deletarProduto(produto);
                carregarProduto ();
                Toast.makeText(getApplicationContext(), "Produto Excluido",Toast.LENGTH_SHORT).show();
                bdHelper.banco.close();
                return true;
            }
        });
    }

    protected  void onResume(){
        super.onResume();
        carregarProduto();
    }

    public void carregarProduto (){
        bdHelper = new ProdutosBd(AddProduto.this);
        listview_Produtos = bdHelper.getLista();
        bdHelper.banco.close();

        if (listview_Produtos != null) {
            adapter = new ArrayAdapter<Produtos>(AddProduto.this, android.R.layout.simple_list_item_1, listview_Produtos);
            lista.setAdapter(adapter);
        }

    }
}
