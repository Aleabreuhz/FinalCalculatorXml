package com.example.calculatorxml;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        // Referencias a los componentes
        EditText numero1 = findViewById(R.id.numero1);
        EditText numero2 = findViewById(R.id.numero2);
        Button sumNumbers = findViewById(R.id.sumNumbers);
        TextView textView = findViewById(R.id.textView);

        // Configurar el botón para sumar
        sumNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    // Convertir texto a números
                    int num1 = Integer.parseInt(numero1.getText().toString());
                    int num2 = Integer.parseInt(numero2.getText().toString());

                    // Realizar la suma
                    int suma = num1 + num2;

                    // Mostrar el resultado en el TextView
                    textView.setText("Resultado: " + suma);

                } catch (NumberFormatException e) {
                    // Manejar errores si no se ingresan números válidos
                    textView.setText("Por favor ingresa números válidos");
                }
            }
        });
    }



}