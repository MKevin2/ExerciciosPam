package com.example.projefix;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Exercicio2Activity extends AppCompatActivity {

    //Adicionando à imagem uma função de iniciar outra activity, no presente caso, para a "Main"
    public void paraMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    //recuperando os elementos posicionados na tela, para a codificação por meio das variáveis
    private EditText editquant;
    private EditText editcod;
    private TextView saidaresult3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio2);

        //referência das variáveis criadas com os elementos da activity dentro do onCreate
        editquant = findViewById(R.id.editquant);
        editcod = findViewById(R.id.editcod);
        saidaresult3 = findViewById(R.id.saidaresult3);

    }

    /*método de presente no botão da tela "calcular",que vai ler o
    código do produto e somar os valores para chegar no preço final*/
    public void calculartot(View view){

        //criando variáveis e convertendo para as contas realizadas
        int quant = Integer.parseInt(editquant.getText().toString());
        double valor;
        double result;
        String cod = (editcod.getText().toString());

        /*estrutura condicional que, se o caso for verdadeiro
        executa conta de acordo com o pedido para somar os preços*/
        switch (cod){
            case "C":
                valor = 2;
                result = (valor * quant);
                saidaresult3.setText("O valor total ficou R$ " +result+ ".");
            break;

            case "c":
                valor = 2;
                result = (valor * quant);
                saidaresult3.setText("O valor total ficou R$ " +result+ ".");
            break;

            case "R":
                valor = 2.50;
                result = (valor * quant);
                saidaresult3.setText("O valor total ficou R$ " +result+ ".");
            break;

            case "r":
                valor = 2.50;
                result = (valor * quant);
                saidaresult3.setText("O valor total ficou R$ " +result+ ".");
            break;

            case "S":
                valor = 1.50;
                result = (valor * quant);
                saidaresult3.setText("O valor total ficou R$ " +result+ ".");
            break;

            case "s":
                valor = 1.50;
                result = (valor * quant);
                saidaresult3.setText("O valor total ficou R$ " +result+ ".");
            break;

            /*default define um "valor padrão", para os casos que
            fogem da condição do programa (letras inválidas)*/
            default:
                saidaresult3.setText("Produto não encontrado.");
        }
    }
}
