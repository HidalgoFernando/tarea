package com.example.tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {

    private EditText Nombre;
    private EditText contrasena;
    private TextView login;

    private Button btn ;

    private Button btn2 ;



    String verifContra = "carlitos123";
    String verifUsu = "carlitos123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btn = (Button) findViewById(R.id.btn1);
        Nombre = (EditText) findViewById(R.id.Name);
        contrasena = (EditText) findViewById(R.id.Password);
        login = (TextView) findViewById(R.id.textView);
        btn2 = (Button) findViewById(R.id.blanco);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IR = new Intent(Intent.ACTION_VIEW);
                IR.setData(Uri.parse("https://www.javierblanco.com.ar"));
                startActivity(IR);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombreUsuario = Nombre.getText().toString();
                String contraseña = contrasena.getText().toString();

                if (nombreUsuario.equals(verifUsu) && contraseña.equals(verifContra)) {

                    Intent popo = new Intent(getApplicationContext(), MainActivity2.class);
                    startActivity(popo);
                } else {
                    Toast.makeText(MainActivity.this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
