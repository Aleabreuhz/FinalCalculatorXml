# Calculadora en Android con XML y Java

Este proyecto es una sencilla aplicación de calculadora desarrollada en Java utilizando XML para la interfaz de usuario en Android. La aplicación permite ingresar dos números y realizar una operación de suma entre ellos.

## Descripción

La aplicación tiene una interfaz básica donde los usuarios pueden ingresar dos números a través de campos de texto. Al presionar un botón con el signo "+" se realiza la suma de los dos números ingresados y muestra el resultado. La interfaz es simple pero funcional y valida que los valores ingresados sean numéricos.

## Características

Interfaz de usuario creada mediante XML.

Entrada de números a través de campos de texto con validación de entradas.

Suma de dos números y visualización del resultado.

Validación de los valores para evitar entradas no numéricas.

## Tecnologías utilizadas

Java: Lenguaje principal para el desarrollo de la aplicación.

XML: Para diseñar la interfaz de usuario.

Android SDK: Plataforma base para desarrollar aplicaciones Android.

Estructura del proyecto

El proyecto contiene una sola actividad (MainActivity) que es la pantalla principal donde se encuentran los componentes de la calculadora.

MainActivity.java: Clase principal que define la lógica de la aplicación.

activity_main.xml: Archivo de diseño que define la interfaz de usuario.

## Funcionamiento

El usuario ingresa un número en el primer campo de texto.

El usuario ingresa un número en el segundo campo de texto.

Al presionar el botón con el símbolo "+", los dos números ingresados se suman.

El resultado de la suma se muestra debajo de los campos de texto.

## Código
```xml
MainActivity.java

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
```

## activity_main.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <Button
        android:id="@+id/sumNumbers"
        android:layout_width="64dp"
        android:layout_height="47dp"
        android:layout_marginStart="172dp"
        android:layout_marginTop="100dp"
        android:text="+"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        tools:ignore="MissingConstraints" />

    <EditText
        android:id="@+id/numero1"
        android:layout_width="89dp"
        android:layout_height="47dp"
        android:layout_marginStart="52dp"
        android:layout_marginTop="100dp"
        android:ems="10"
        android:inputType="number"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/numero2"
        android:layout_width="89dp"
        android:layout_height="47dp"
        android:layout_marginStart="264dp"
        android:layout_marginTop="100dp"
        android:ems="10"
        android:inputType="number"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="164dp"
        android:layout_marginTop="176dp"
        android:text="Resultado"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
```
## Cómo ejecutar el proyecto

Clona este repositorio en tu máquina local.

Abre el proyecto en Android Studio.

Conecta un dispositivo Android o utiliza un emulador para ejecutar la aplicación.

Ejecuta la aplicación y usa la calculadora.

