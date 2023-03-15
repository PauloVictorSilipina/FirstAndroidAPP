package rodrigues.alves.victor.firstapplicationofmylife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        //Recebe a intent da página anterior
        Intent i = getIntent();

        //Texto
        String texto = i.getStringExtra("texto");

        //Pega o id do campo para exibir o texto
        TextView tvExibir = findViewById(R.id.tvExibir);

        //Seta o texto para ser exibido
        tvExibir.setText(texto);
    }
}