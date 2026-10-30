package com.example.appvacaciones;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView btmMenu;
    private String usuarioLogueado = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getIntent() != null && getIntent().hasExtra("usuario")) {
            usuarioLogueado = getIntent().getStringExtra("usuario");
        }

        btmMenu = findViewById(R.id.btm_menu);

        if (savedInstanceState == null) {
            cargarFragment(new HomeFragment());
        }

        btmMenu.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.nav_home) {
                cargarFragment(new HomeFragment());
                return true;
            } else if (id == R.id.nav_profile) {
                cargarFragment(ProfileFragment.newInstance(usuarioLogueado));
                return true;
            }
            return false;
        });
    }

    private void cargarFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_container, fragment)
                .commit();
    }
}