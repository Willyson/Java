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
import com.example.suzan.market.dbs.UsuarioBd;
import com.example.suzan.market.modelo.Usuario;

public class FormularioUsuario extends AppCompatActivity {

        EditText edtLogin, edtSenha;
        Button btn_Poliform;
        Usuario editarUsuario, usuario;
        UsuarioBd bdHelper;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_usuario);

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setTitle("Menu");

            usuario = new Usuario();
            bdHelper = new UsuarioBd(FormularioUsuario.this);


            Intent intent = getIntent();
            editarUsuario = (Usuario) intent.getSerializableExtra("usuario-escolhido");

            edtLogin = (EditText) findViewById(R.id.edtLogin);
            edtSenha = (EditText) findViewById(R.id.edtSenha);

            btn_Poliform = (Button) findViewById(R.id.btn_Poliform);

            if (editarUsuario != null) {
                btn_Poliform.setText("Modificar Usuario");

                edtLogin.setText(editarUsuario.getLoginUsu());
                edtSenha.setText(editarUsuario.getSenhaUsu());


                usuario.setId(editarUsuario.getId());

            } else {
                btn_Poliform.setText("Cadastrar Novo Usuario");
            }

            btn_Poliform.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    usuario.setLoginUsu(edtLogin.getText().toString());
                    usuario.setSenhaUsu(edtSenha.getText().toString());

                    if (btn_Poliform.getText().toString().equals("Cadastrar Novo Usuario")) {
                        bdHelper.SalvarUsuario(usuario);
                        Toast.makeText(getApplicationContext(), "Usuario Cadastrado",Toast.LENGTH_SHORT).show();
                        Intent cadastro = new Intent(FormularioUsuario.this, AddUsuario.class);
                        startActivity(cadastro);
                    } else {
                        bdHelper.alterarUsuario(usuario);
                        bdHelper.banco.close();
                        Toast.makeText(getApplicationContext(), "Usuario Alterado",Toast.LENGTH_SHORT).show();
                        Intent back = new Intent(FormularioUsuario.this, AddCliente.class);
                        startActivity(back);
                    }
                }
            });
        }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                startActivity(new Intent(this, AddUsuario.class));
                finishAffinity();
                break;
            default:break;
        }
        return true;
    }
}

