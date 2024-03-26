package larissa.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent i = getIntent(); // Obtém o intent que criou a tela (em MainACtivity criamos a intent i e guardamos um texto nela. A nova tela é criada e recebe esse texto.)
        String textoDigitado = i.getStringExtra("texto"); // Pega o texto mandado pela primeira tela (denro  através da chave "texto"
        TextView tvTexto = findViewById(R.id.tv_texto); // pega o TextView (que exibe o texto)
        tvTexto.setText(textoDigitado); // seta o texto dentro do tv_texto
    }
}