package controlerural.newton.com.controlerural;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import controlerural.newton.com.controlerural.telaPrincipal.ActivityCadastroCompra;

public class ActivityTelaPrincipal extends Activity {

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
