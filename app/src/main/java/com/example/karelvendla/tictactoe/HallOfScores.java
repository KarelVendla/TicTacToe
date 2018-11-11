package com.example.karelvendla.tictactoe;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HallOfScores extends AppCompatActivity {

    ListView Listview;
    String FILE_NAME = "HallOfScores.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hall_of_scores);

        Listview = findViewById(R.id.Scores);

        FileInputStream fis = null;

        try {
            fis = openFileInput(FILE_NAME);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            String line;

            ArrayList<String> Scores = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                Scores.add(line);
            }

            br.close();

            ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,Scores);

            Listview.setAdapter(adapter);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

