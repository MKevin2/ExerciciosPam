package com.example.projefix;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Adicionando à imagem uma função de ir para outra activity, no caso, a "Exercicio2"
    public void paraExercicio2(View view) {
        Intent intent = new Intent(this, Exercicio2Activity.class);
        startActivity(intent);
    }

    //recuperando os elementos posicionados na tela, para a codificação por meio das variáveis
    private EditText editA;
    private EditText editB;
    private TextView textresult;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referência entre as variáveis criadas e os elementos da activity
        editA = findViewById(R.id.editA);
        editB = findViewById(R.id.editB);
        textresult = findViewById(R.id.textresult);
    }

    //função adicionada ao botão "confirmar" pelo atributo "onclick" para a execução da verificação para saber se é múltiplo ou não
    public void calcularMultiplo(View view){

        //convertendo o texto resgatado e preenchido nas "EditText", para double
        double A = Double.parseDouble(editA.getText().toString());
        double B = Double.parseDouble(editB.getText().toString());

            /*Estrutura de condicional utilizando o "Modulo de divisão" para saber se é múltiplo ou não,
            se sim (if), uma mensagem é revelada ao usuário que sim, caso não (else),
            uma mensagem dizendo que não é aparece*/

            if (A % B == 0 || B % A == 0){
                textresult.setText("São Múltiplos");
            }
            else{
                textresult.setText("Não são Múltiplos");
            }
        }
    }
