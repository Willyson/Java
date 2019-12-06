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
import com.example.suzan.market.dbs.ClientesBd;
import com.example.suzan.market.dbs.UsuarioBd;
import com.example.suzan.market.modelo.Cliente;
import com.example.suzan.market.modelo.Usuario;

public class FormularioCliente extends AppCompatActivity {
    EditText edtNome, edtCpf, edtEndereco;
    Button btn_Poliform;
    Cliente editarCliente, cliente;
    ClientesBd bdHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_cliente);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Menu");

        cliente = new Cliente();
        bdHelper = new ClientesBd(FormularioCliente.this);


        Intent intent = getIntent();
        editarCliente = (Cliente) intent.getSerializableExtra("cliente-escolhido");


        edtNome = (EditText) findViewById(R.id.edtNome);
        edtCpf = (EditText) findViewById(R.id.edtCpf);
        edtEndereco = (EditText) findViewById(R.id.edtEndereco);

        btn_Poliform = (Button) findViewById(R.id.btn_Poliform);

        if (editarCliente != null) {
            btn_Poliform.setText("Modificar Cliente");

            edtNome.setText(editarCliente.getNomeCliente());
            edtCpf.setText(editarCliente.getCpfCliente());
            edtEndereco.setText(editarCliente.getEnderecoCliente());


            cliente.setId(editarCliente.getId());

        } else {
            btn_Poliform.setText("Cadastrar Novo Cliente");
        }

        btn_Poliform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cliente.setNomeCliente(edtNome.getText().toString());
                cliente.setCpfCliente(edtCpf.getText().toString());
                cliente.setEnderecoCliente(edtEndereco.getText().toString());


                if (btn_Poliform.getText().toString().equals("Cadastrar Novo Cliente")) {
                    bdHelper.SalvarCliente(cliente);
                    Toast.makeText(getApplicationContext(), "Cliente Cadastrado",Toast.LENGTH_SHORT).show();
                    Intent cadastro = new Intent(FormularioCliente.this, AddCliente.class);
                    startActivity(cadastro);
                } else {
                    bdHelper.alterarCliente(cliente);
                    bdHelper.banco.close();
                    Toast.makeText(getApplicationContext(), "Cliente Alterado",Toast.LENGTH_SHORT).show();
                    Intent back = new Intent(FormularioCliente.this, AddCliente.class);
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
