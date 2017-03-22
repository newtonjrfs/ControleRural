package controlerural.newton.com.controlerural;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityCadastroUsuario extends AppCompatActivity {

    private EditText campoLogin,campoSenha,campoNome,campoEmail,campoTelefone;
    private Button botaoCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);

        botaoCadastro = (Button) findViewById(R.id.tlCadBotaoCadastro);
        campoLogin = (EditText) findViewById(R.id.tlCadLogin);
        campoSenha = (EditText) findViewById(R.id.tlCadSenha);
        campoNome = (EditText) findViewById(R.id.tlCadNome);
        campoEmail = (EditText) findViewById(R.id.tlCadEmail);
        campoTelefone = (EditText) findViewById(R.id.tlCadTelefone);


        botaoCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String login,senha,nome,email,telefone;

                login = campoLogin.getText().toString();
                senha = campoSenha.getText().toString();
                nome = campoNome.getText().toString();
                email = campoEmail.getText().toString();
                telefone = campoTelefone.getText().toString();

                if (login.equals("") || senha.equals("") || nome.equals("") || email.equals("") || telefone.equals("")){
                    Toast.makeText(ActivityCadastroUsuario.this,"Preencha todas as informações", Toast.LENGTH_SHORT).show();


                }else{

                    Toast.makeText(ActivityCadastroUsuario.this,login, Toast.LENGTH_SHORT).show();
                    Toast.makeText(ActivityCadastroUsuario.this,senha, Toast.LENGTH_SHORT).show();
                    Toast.makeText(ActivityCadastroUsuario.this,nome, Toast.LENGTH_SHORT).show();
                    Toast.makeText(ActivityCadastroUsuario.this,email, Toast.LENGTH_SHORT).show();
                    Toast.makeText(ActivityCadastroUsuario.this,telefone, Toast.LENGTH_SHORT).show();
                    Toast.makeText(ActivityCadastroUsuario.this,"Cadastro realizado com sucesso", Toast.LENGTH_SHORT).show();

                    campoLogin.setText("");
                    campoSenha.setText("");
                    campoNome.setText("");
                    campoEmail.setText("");
                    campoTelefone.setText("");
                }

            }
        });

    }


}

