package larissa.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity { //classe q representa a tela principal

    @Override
    protected void onCreate(Bundle savedInstanceState) { //metodo on create e chamado pelo SO (android) automaticam. quando uma tela esta sendo criada
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //constrói a interface da tela baseado no arquivo de instruções xml que criamos

        Button btnEnviar = findViewById(R.id.btn_enviar); //obtem o botão enviar. cada elem de interface criado no arq xml possui seu id, para conseguirmos obte-los dps
        btnEnviar.setOnClickListener(new View.OnClickListener() { // configurando o botão, setando nele um "ouvidor de clicks"
            @Override
            public void onClick(View v) { //metodo onclick, que so é executado quando o botão é apertado / 'view v' recebe o proprio elemento de interface, nesse caso o botao
                EditText etDigiteAqui = findViewById(R.id.et_digiteaqui); // obtem a caixa de texto, atraves do id, assim como fizemos com o botao
                String textoDigitado = etDigiteAqui.getText().toString(); // obtem o texto dentro da caixa de texto atraves do metodo gettext, convertendo em string.

                Intent i = new Intent(MainActivity.this,NextActivity.class); //criando uma nova intenção (classe Intent) com o objetivo de navegar da tela principal (MainActivity) para a proxima (NextActivity)

                i.putExtra("texto", textoDigitado); // pega a string q contem o texto e acrescenta ele (textoDigitado) dentro do intent que criamos, mas ele precisa ser associado a uma chave ("texto"), para podermos acessa-lo depois

                startActivity(i); // executa a Intent que criamos (i)
            }
        });
    }
}
// função onpause, quando uma tela entra na frente de outra, tem q ser pausada a anterior (existe onstart, etc)
// operação de casting, transformar o obj de um tipo p outro (ex: Button b = (Button) v;) ( ex2: float a = 1.5f; int b = (int) a;)
// startActivityforResult = executa e aguarda o resultado da intent (ex: tirar uma foto)

//...