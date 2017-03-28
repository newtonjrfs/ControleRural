package controlerural.newton.com.controlerural;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import controlerural.newton.com.controlerural.telaCadastroUsuario.ActivityCadastroUsuario;

public class MainActivity extends AppCompatActivity {

    private Button botaoCadastrar;
    private Button botaoLogin;
    private EditText campoLogin;
    private EditText campoSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        camposDaTela();

        botaoCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ActivityCadastroUsuario.class));
            }
        });



        botaoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String login = campoLogin.getText().toString();
                String senha = campoSenha.getText().toString();

                if (login.equals("newton") && senha.equals("junior")){

                    campoLogin.setText("");
                    campoSenha.setText("");

                    startActivity(new Intent(MainActivity.this,ActivityTelaPrincipal.class));


                }else{
                    Toast.makeText(MainActivity.this,"<- LOGIN OU SENHA INCORRETO !->",Toast.LENGTH_SHORT).show();

                }


            }
        });

    }

    private void camposDaTela() {
        botaoCadastrar = (Button)  findViewById(R.id.botaoCadastrarUsuario);
        botaoLogin = (Button) findViewById(R.id.botaoLogin);
        campoLogin = (EditText) findViewById(R.id.tlLgLogin);
        campoSenha = (EditText) findViewById(R.id.tlLgSenha);
    }
}
