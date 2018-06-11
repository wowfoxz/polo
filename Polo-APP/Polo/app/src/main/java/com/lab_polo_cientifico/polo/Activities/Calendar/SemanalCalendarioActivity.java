package com.lab_polo_cientifico.polo.Activities.Calendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.lab_polo_cientifico.polo.R;

public class SemanalCalendarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semanal_calendario);

        // Forzar y cargar icono en el Action Bar
        getSupportActionBar().setTitle(R.string.SemanalCalendarioActivity);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcherpolo);

    }
}
