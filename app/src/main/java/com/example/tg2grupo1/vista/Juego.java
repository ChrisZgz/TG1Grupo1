package com.example.tg2grupo1.vista;

import static com.example.tg2grupo1.controlers.Utilidades.alerta;
import static com.example.tg2grupo1.controlers.Utilidades.comprobarIgualesEditText;
import static com.example.tg2grupo1.controlers.Utilidades.comprobarVacioEditText;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.tg2grupo1.R;
import com.example.tg2grupo1.controlers.LecturaEscrituraDatos;
import com.example.tg2grupo1.controlers.Logica;
import com.example.tg2grupo1.modelo.Fichas;
import com.example.tg2grupo1.modelo.Serie;

import java.util.ArrayList;
import java.util.List;

public class Juego extends AppCompatActivity {
    EditText txtJugadorUno;
    EditText txtJugadorDos;
    Button btnIniciar;
    ImageButton bt1;
    ImageButton bt2;
    ImageButton bt3;
    ImageButton bt4;
    ImageButton bt5;
    ImageButton bt6;
    ImageButton bt7;
    ImageButton bt8;
    ImageButton bt9;
    Logica logica = new Logica();
    Fichas ficha1;
    Fichas ficha2;
    Fichas fichaEnUso;
    int contadorDeFichas;
    List<ImageButton> botones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_juego);

        txtJugadorUno = findViewById(R.id.txtJugadorUno);
        txtJugadorDos = findViewById(R.id.txtJugadorDos);
        btnIniciar = findViewById(R.id.btnIniciar);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);
        bt7 = findViewById(R.id.bt7);
        bt8 = findViewById(R.id.bt8);
        bt9 = findViewById(R.id.bt9);

        contadorDeFichas = 0;
        botones = meterBotones();
        Logica.getInstance(botones, this);

        deshabilitarBotonesDeJuego();

        btnIniciar.setOnClickListener(v -> {
            if (comprobarVacioEditText(this, txtJugadorUno)) {
            } else if (comprobarVacioEditText(this, txtJugadorDos)) {
            } else if (comprobarIgualesEditText(this, txtJugadorUno, txtJugadorDos)) {
            } else {
                ficha1 = new Fichas(txtJugadorUno.getText().toString(), R.drawable.fichao);
                ficha2 = new Fichas(txtJugadorDos.getText().toString(), R.drawable.fichax);
                fichaEnUso = ficha1;
                txtJugadorUno.setEnabled(false);
                txtJugadorDos.setEnabled(false);
                habilitarBotonesDeJuego();
                btnIniciar.setClickable(false);
                btnIniciar.setTextColor(Color.parseColor("#9B9B9B"));
                Drawable drawable = ContextCompat.getDrawable(getApplicationContext(), R.drawable.fondocampotextoverde);
                txtJugadorUno.setBackground(drawable);
                txtJugadorUno.setTextColor(Color.parseColor("#000000"));
            }
        });

        bt1.setOnClickListener(v -> {
            if (logica.comprobarVacio(bt1, fichaEnUso)) {
                contadorDeFichas++;
                Drawable myDrawable = ContextCompat.getDrawable(getApplicationContext(),
                        fichaEnUso.getTipo());
                bt1.setForeground(myDrawable);
                if (contadorDeFichas > 4) {
                    comprobacionFinal();
                }
                cambioDeFicha();
            } else{
                alerta(this, "ERROR", "LA CASILLA YA ESTÁ OCUPADA");
            }
        });
        bt2.setOnClickListener(v -> {
            if (logica.comprobarVacio(bt2, fichaEnUso)) {
                contadorDeFichas++;
                Drawable myDrawable = ContextCompat.getDrawable(getApplicationContext(),
                        fichaEnUso.getTipo());
                bt2.setForeground(myDrawable);
                if (contadorDeFichas > 4) {
                    comprobacionFinal();
                }
                cambioDeFicha();
            } else{
                alerta(this, "ERROR", "LA CASILLA YA ESTÁ OCUPADA");
            }
        });
        bt3.setOnClickListener(v -> {
            if (logica.comprobarVacio(bt3, fichaEnUso)) {
                contadorDeFichas++;
                Drawable myDrawable = ContextCompat.getDrawable(getApplicationContext(),
                        fichaEnUso.getTipo());
                bt3.setForeground(myDrawable);
                if (contadorDeFichas > 4) {
                    comprobacionFinal();
                }
                cambioDeFicha();
            } else{
                alerta(this, "ERROR", "LA CASILLA YA ESTÁ OCUPADA");
            }
        });
        bt4.setOnClickListener(v -> {
            if (logica.comprobarVacio(bt4, fichaEnUso)) {
                contadorDeFichas++;
                Drawable myDrawable = ContextCompat.getDrawable(getApplicationContext(),
                        fichaEnUso.getTipo());
                bt4.setForeground(myDrawable);
                if (contadorDeFichas > 4) {
                    comprobacionFinal();
                }
                cambioDeFicha();
            } else{
                alerta(this, "ERROR", "LA CASILLA YA ESTÁ OCUPADA");
            }
        });
        bt5.setOnClickListener(v -> {
            if (logica.comprobarVacio(bt5, fichaEnUso)) {
                contadorDeFichas++;
                Drawable myDrawable = ContextCompat.getDrawable(getApplicationContext(),
                        fichaEnUso.getTipo());
                bt5.setForeground(myDrawable);
                if (contadorDeFichas > 4) {
                    comprobacionFinal();
                }
                cambioDeFicha();
            } else{
                alerta(this, "ERROR", "LA CASILLA YA ESTÁ OCUPADA");
            }
        });
        bt6.setOnClickListener(v -> {
            if (logica.comprobarVacio(bt6, fichaEnUso)) {
                contadorDeFichas++;
                Drawable myDrawable = ContextCompat.getDrawable(getApplicationContext(),
                        fichaEnUso.getTipo());
                bt6.setForeground(myDrawable);
                if (contadorDeFichas > 4) {
                    comprobacionFinal();
                }
                cambioDeFicha();
            } else{
                alerta(this, "ERROR", "LA CASILLA YA ESTÁ OCUPADA");
            }
        });
        bt7.setOnClickListener(v -> {
            if (logica.comprobarVacio(bt7, fichaEnUso)) {
                contadorDeFichas++;
                Drawable myDrawable = ContextCompat.getDrawable(getApplicationContext(),
                        fichaEnUso.getTipo());
                bt7.setForeground(myDrawable);
                if (contadorDeFichas > 4) {
                    comprobacionFinal();
                }
                cambioDeFicha();
            } else{
                alerta(this, "ERROR", "LA CASILLA YA ESTÁ OCUPADA");
            }
        });
        bt8.setOnClickListener(v -> {
            if (logica.comprobarVacio(bt8, fichaEnUso)) {
                contadorDeFichas++;
                Drawable myDrawable = ContextCompat.getDrawable(getApplicationContext(),
                        fichaEnUso.getTipo());
                bt8.setForeground(myDrawable);
                if (contadorDeFichas > 4) {
                    comprobacionFinal();
                }
                cambioDeFicha();
            } else{
                alerta(this, "ERROR", "LA CASILLA YA ESTÁ OCUPADA");
            }
        });
        bt9.setOnClickListener(v -> {
            if (logica.comprobarVacio(bt9, fichaEnUso)) {
                contadorDeFichas++;
                Drawable myDrawable = ContextCompat.getDrawable(getApplicationContext(),
                        fichaEnUso.getTipo());
                bt9.setForeground(myDrawable);
                if (contadorDeFichas > 4) {
                    comprobacionFinal();
                }
                cambioDeFicha();
            } else{
                alerta(this, "ERROR", "LA CASILLA YA ESTÁ OCUPADA");
            }
        });
    }

    private void cambioDeFicha() {
        Drawable drawableverde = ContextCompat.getDrawable(getApplicationContext(), R.drawable.fondocampotextoverde);
        Drawable drawable = ContextCompat.getDrawable(getApplicationContext(), R.drawable.fondocampotexto);
        if (fichaEnUso == ficha1) {
            fichaEnUso = ficha2;
            txtJugadorUno.setBackground(drawable);
            txtJugadorUno.setTextColor(Color.parseColor("#FFED00"));
            txtJugadorDos.setBackground(drawableverde);
            txtJugadorDos.setTextColor(Color.parseColor("#000000"));
        } else {
            fichaEnUso = ficha1;
            txtJugadorUno.setBackground(drawableverde);
            txtJugadorUno.setTextColor(Color.parseColor("#000000"));
            txtJugadorDos.setBackground(drawable);
            txtJugadorDos.setTextColor(Color.parseColor("#FFED00"));
        }
        if (!bt1.isEnabled()) {
            txtJugadorUno.setBackground(drawable);
            txtJugadorDos.setBackground(drawable);
            txtJugadorUno.setTextColor(Color.parseColor("#FFED00"));
            txtJugadorDos.setTextColor(Color.parseColor("#FFED00"));
            btnIniciar.setTextColor(Color.parseColor("#FFFFFF"));
        }
    }

    private void comprobacionFinal() {
        String nombres = "";
        String resultado = "";
        if (logica.tresEnRaya(fichaEnUso)) {
            deshabilitarBotonesDeJuego();
            //sonido de victoria
            alerta(this, "FELICIDADES", "EL JUGADOR: " + fichaEnUso.getNombre() + " ES EL GANADOR");
            nombres = fichaEnUso.getNombre();
            resultado = "GANADOR";
            Serie serie = new Serie(nombres, resultado);
            LecturaEscrituraDatos.guardar(this, serie.toString());
        } else if (contadorDeFichas == 9) {
            deshabilitarBotonesDeJuego();
            //sonidos de empate
            alerta(this, "EMPATE", "LOS JUGADORES " + txtJugadorUno.getText().toString() +
                    " Y " + txtJugadorDos.getText().toString() + " HAN EMPATADO");
            nombres = ficha1.getNombre() + " " + ficha2.getNombre();
            resultado = "EMPATE";
            Serie serie = new Serie(nombres, resultado);
            LecturaEscrituraDatos.guardar(this, serie.toString());
        }
    }

    private ArrayList<ImageButton> meterBotones() {
        ArrayList<ImageButton> botones = new ArrayList<>();
        botones.add(bt1);
        botones.add(bt2);
        botones.add(bt3);
        botones.add(bt4);
        botones.add(bt5);
        botones.add(bt6);
        botones.add(bt7);
        botones.add(bt8);
        botones.add(bt9);
        return botones;
    }

    private void habilitarBotonesDeJuego() {
        for (int i = 0; i < 9; i++) {
            botones.get(i).setEnabled(true);
        }
    }

    private void deshabilitarBotonesDeJuego() {
        for (int i = 0; i < 9; i++) {
            botones.get(i).setEnabled(false);
        }
    }

    private void reiniciarJuego() {
        for (int i = 0; i < 9; i++) {
            botones.get(i).setForeground(null);
        }
        contadorDeFichas = 0;
    }

    private void reiniciarJuegoOtrosJugadores() {
        for (int i = 0; i < 9; i++) {
            botones.get(i).setForeground(null);
        }
        txtJugadorUno.setText("");
        txtJugadorDos.setText("");
        txtJugadorUno.setEnabled(true);
        txtJugadorDos.setEnabled(true);
        btnIniciar.setEnabled(true);
        ficha1 = null;
        ficha2 = null;
        fichaEnUso = null;
        contadorDeFichas = 0;
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logica.unset();
    }
}