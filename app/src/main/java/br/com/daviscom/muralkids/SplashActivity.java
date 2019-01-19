package br.com.daviscom.muralkids;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

/***
 * @author LuizCarlos
 *
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Esconder a Action Bar - OBS.: Não tem a Action Bar, por isso ocorre erro se implementar este código comentado
        //getSupportActionBar().hide();

        //Exibir em fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Para criar a Splash Screen apartir da activity, usa a Classe Handler para executar o código na thread principal
        //Método postDelayed para passar um determinado período de tempo
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getBaseContext(), Login.class));
                finish(); //Para que a Activity Splash Screen seja destruída
            }
        }, 5000); //Equivale à 5 segundos


    }
}

