package controlerural.newton.com.controlerural.telaPrincipal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import controlerural.newton.com.controlerural.R;

public class ActivityCadastroCompra extends AppCompatActivity {

    private RadioGroup tipoCompra, tipoPagamento;
    private EditText dataCompra,quantidadeCompra,valorCompra,dataPagamento,descricaoCompra;
    private RadioButton tipoPecuaria,formaPagamento;
    private Button botaoCadastrar;

    private String diaCompra,diaPagamento, descricaoDaCompra;
    private double valorPagoProdutos;
    private int quantidadeComprada;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_compra);

        tratamentoDeTela();

        botaoCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int IdOpcaoEscolhida ;

                tipoPecuariaEscolhido();

                tipoPagamentoEscolhido();

                iniciarVariaveis();

                printandoVariaveis();

            }
        });
    }

    private void printandoVariaveis() {

        Toast.makeText(ActivityCadastroCompra.this,diaCompra,Toast.LENGTH_SHORT).show();

        Toast.makeText(this,String.valueOf(quantidadeComprada),Toast.LENGTH_SHORT).show();

        //Toast.makeText(this,String.format("%.2f",valorPagoProdutos),Toast.LENGTH_SHORT).show();

        Toast.makeText(this,descricaoDaCompra,Toast.LENGTH_SHORT).show();


    }

    private void iniciarVariaveis() {

         diaCompra = dataCompra.getText().toString();
         diaPagamento = dataPagamento.getText().toString();

         descricaoDaCompra = descricaoCompra.getText().toString();

         quantidadeComprada = Integer.parseInt(quantidadeCompra.getText().toString());

         valorPagoProdutos = Double.valueOf(valorCompra.getText().toString());




        //Toast.makeText(this,String.format("%.2f",quantidadeComprada),Toast.LENGTH_SHORT).show();
        //Toast.makeText(this,valorPagoProdutos.byteValue(),Toast.LENGTH_SHORT).show();

    }

    private void tipoPecuariaEscolhido() {
        int IdOpcaoEscolhida;
        IdOpcaoEscolhida= tipoCompra.getCheckedRadioButtonId();
        if(IdOpcaoEscolhida>0) {
            tipoPecuaria = (RadioButton) findViewById(IdOpcaoEscolhida);

            String tipoComprado = tipoPecuaria.getText().toString();

            Toast.makeText(ActivityCadastroCompra.this,tipoComprado,Toast.LENGTH_SHORT).show();
            }
    }

    private void tipoPagamentoEscolhido() {
        int IdOpcaoEscolhida;
        IdOpcaoEscolhida = tipoPagamento.getCheckedRadioButtonId();
        if (IdOpcaoEscolhida>0){
            formaPagamento= (RadioButton) findViewById(IdOpcaoEscolhida);
            String pagamentoEscolhido = formaPagamento.getText().toString();
            Toast.makeText(ActivityCadastroCompra.this,pagamentoEscolhido,Toast.LENGTH_SHORT).show();
        }
    }

    private void tratamentoDeTela() {

        tipoCompra = (RadioGroup) findViewById(R.id.tlCadCompraRadioTipoCompra);
        tipoPagamento= (RadioGroup) findViewById(R.id.tlCadCompraCondPagamento);

        dataCompra = (EditText )findViewById(R.id.tlCadCompraData);
        quantidadeCompra = (EditText) findViewById(R.id.tlCadCompraQuantidade);
        valorCompra = (EditText) findViewById(R.id.tlCadCompraValor);
        dataPagamento = (EditText) findViewById(R.id.tlCadCompraDataPagamento);
        descricaoCompra = (EditText) findViewById(R.id.tlCadCompraDescricao);

        botaoCadastrar =(Button) findViewById(R.id.tlCadCompraBotaoCadastrar);

    }
}
