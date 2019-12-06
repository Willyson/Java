package com.example.suzan.market.telas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.suzan.market.R;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btnProdutos = (Button) findViewById(R.id.btn_produtos);
        btnProdutos.setOnClickListener(new android.view.View.OnClickListener(){
            public  void  onClick(View v){
                Intent intent = new Intent(Menu.this, AddProduto.class);
                startActivity(intent);
            }
        });

        Button btnClientes = (Button) findViewById(R.id.btn_clientes);
        btnClientes.setOnClickListener(new android.view.View.OnClickListener(){
            public  void  onClick(View v){
                Intent intent = new Intent(Menu.this, AddCliente.class);
                startActivity(intent);
            }
        });
    }
}



