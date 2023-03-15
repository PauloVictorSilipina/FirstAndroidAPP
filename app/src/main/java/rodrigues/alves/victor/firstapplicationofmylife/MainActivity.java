package rodrigues.alves.victor.firstapplicationofmylife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            //Método de selecionar o texto no clique
            public void onClick(View view) {

                //Adiciona o texto digitado selecionando pelo ID do campo de texto
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);

                //Retira o texto da variável 'etDigiteAqui' e converte para o tipo string
                String texto = etDigiteAqui.getText().toString();

                //Cria o intent para carregar a nova tela
                Intent intent = new Intent(MainActivity.this, NextActivity.class);
                intent.putExtra("texto", texto);

                //Roda a intent e troca a tela
                startActivity(intent);
            }
        });
    }
}