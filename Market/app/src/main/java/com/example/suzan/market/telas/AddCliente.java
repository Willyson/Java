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
import com.example.suzan.market.dbs.ClientesBd;
import com.example.suzan.market.modelo.Cliente;

import java.util.ArrayList;

public class AddCliente extends AppCompatActivity {

    ListView lista;
    ClientesBd bdHelper;
    ArrayList<Cliente> listview_Clientes;
    Cliente cliente;
    ArrayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_cliente);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Menu");

        Button btnCadastrar = (Button) findViewById(R.id.btn_Cadastrar);
        btnCadastrar.setOnClickListener(new android.view.View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(AddCliente.this, FormularioCliente.class);
                startActivity(intent);
            }

        });

        lista = (ListView) findViewById(R.id.listview_Clientes);
        registerForContextMenu(lista);



        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {
                Cliente clienteEscolhido = (Cliente) adapter.getItemAtPosition(position);

                Intent i = new Intent(AddCliente.this, FormularioCliente.class);
                i.putExtra("cliente-escolhido",clienteEscolhido);
                startActivity(i);
            }
        });

        lista.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapter, View view, int position, long id) {
                cliente = (Cliente)adapter.getItemAtPosition(position);
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
        MenuItem menuDelete = menu.add("Deletar Cliente");
        menuDelete.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                bdHelper = new ClientesBd(AddCliente.this);
                bdHelper.deletarCliente(cliente);
                carregarCliente();
                Toast.makeText(getApplicationContext(), "Cliente Excluido",Toast.LENGTH_SHORT).show();
                bdHelper.banco.close();
                return true;
            }
        });
    }

    protected  void onResume(){
        super.onResume();
        carregarCliente();
    }

    public void carregarCliente(){
        bdHelper = new ClientesBd(AddCliente.this);
        listview_Clientes = bdHelper.getLista();
        bdHelper.banco.close();;

        if (listview_Clientes != null){
            adapter = new ArrayAdapter<Cliente>(AddCliente.this, android.R.layout.simple_list_item_1, listview_Clientes);
            lista.setAdapter(adapter);

        }

    }

}
