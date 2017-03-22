package controlerural.newton.com.controlerural;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTelaPrincipal extends AppCompatActivity {

    private Button cadastroCompra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        cadastroCompra = (Button) findViewById(R.id.tlPrinCadCompra);

        cadastroCompra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity( new Intent(ActivityTelaPrincipal.this,ActivityCadastroCompra.class));

            }
        });

    }
}
