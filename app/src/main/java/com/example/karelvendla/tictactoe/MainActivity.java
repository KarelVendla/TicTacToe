package com.example.karelvendla.tictactoe;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity implements Serializable {

    EditText player1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void cont(View view) {
        Intent intent = new Intent(MainActivity.this, tictac.class);
        EditText editText = findViewById(R.id.player1);
        intent.putExtra("name",editText.getText().toString());
        startActivity(intent);

    }
}
