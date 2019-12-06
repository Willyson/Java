package com.example.suzan.market.telas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.suzan.market.R;
import com.example.suzan.market.dbs.ClientesBd;
import com.example.suzan.market.dbs.UsuarioBd;
import com.example.suzan.market.modelo.Cliente;
import com.example.suzan.market.modelo.Usuario;


public class Login extends AppCompatActivity {

    Usuario usuEnt;
    Usuario usuSai;
    EditText Login;
    EditText Senha;
    Button Confirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        TextView cadastrar = (TextView) findViewById(R.id.txt_cadastro);
        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Login.this, FormularioCliente.class);
                startActivity(it);
            }
        });
        Confirmar = (Button) findViewById(R.id.btnConfirma);
        Confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UsuarioBd bdHelper = new UsuarioBd(getBaseContext());
                Login = (EditText) findViewById(R.id.edtLogin);
                Senha = (EditText) findViewById(R.id.edtSenha);
                usuEnt = new Usuario();
                usuEnt.setLoginUsu(Login.getText().toString().trim());
                usuEnt.setSenhaUsu(Senha.getText().toString().trim());
                usuEnt.setId(Long.valueOf(0));

                usuSai = bdHelper.validaUsuario(usuEnt);

                if (usuSai.getId() != Long.valueOf(0)){
                    Intent it = new Intent(Login.this, Menu.class);
                    it.putExtra("UsuarioLogado", usuSai);
                    startActivity(it);
                }else{
                    Toast.makeText(getApplicationContext(), "Usuário e/ou senha inválida(s)", Toast.LENGTH_SHORT).show();
                    Login.setText("");
                    Senha.setText("");
                }
            }
        });
    }
}
