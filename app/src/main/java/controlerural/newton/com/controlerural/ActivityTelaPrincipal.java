package controlerural.newton.com.controlerural;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import controlerural.newton.com.controlerural.telaPrincipal.ActivityCadastroCompra;

public class ActivityTelaPrincipal extends AppCompatActivity {

    private Button btcadastroCompra,btListagenCompra,btOfertaCompra,btConsumo,btAnotacoes,btInformacoes,btAjuda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        tratamentoDaTela();

        btcadastroCompra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity( new Intent(ActivityTelaPrincipal.this,ActivityCadastroCompra.class));

            }
        });

    }

    private void tratamentoDaTela() {
        btcadastroCompra = (Button) findViewById(R.id.tlPrinCadCompra);
        btListagenCompra = (Button) findViewById(R.id.tlPrinListCompra);
        btOfertaCompra = (Button) findViewById(R.id.tlPrinOfertas);
        btConsumo = (Button) findViewById(R.id.tlPrinConsumo);
        btAnotacoes = (Button) findViewById(R.id.tlPrinAnotacoes);
        btInformacoes = (Button) findViewById(R.id.tlPrinInformacao);
        btAjuda = (Button) findViewById(R.id.tlPrinAjuda);
    }
}
