package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnIntroduction = findViewById(R.id.btnIntroduction);
        btnIntroduction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                FragmentManager fragmentManager = getSupportFragmentManager();

                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainerView, IntoductionFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("Introduction")
                        .commit();
            }
        });

        Button btnCh1 = findViewById(R.id.btnChOne);
        btnCh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                FragmentManager fragmentManager = getSupportFragmentManager();

                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainerView, ChOneFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("Ch1")
                        .commit();
            }
        });

        Button btnCh2 = findViewById(R.id.btnChTwo);
        btnCh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                FragmentManager fragmentManager = getSupportFragmentManager();

                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainerView, ChTwoFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("Ch2")
                        .commit();
            }
        });

        Button btnCh3 = findViewById(R.id.btnChThree);
        btnCh3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                FragmentManager fragmentManager = getSupportFragmentManager();

                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainerView, ChThreeFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("Ch3")
                        .commit();
            }
        });

        Button btnCh4 = findViewById(R.id.btnChFour);
        btnCh4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                FragmentManager fragmentManager = getSupportFragmentManager();

                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainerView, ChFourFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("Ch4")
                        .commit();
            }
        });

    }

}