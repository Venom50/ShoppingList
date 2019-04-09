package com.example.shoppinglist;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> tablicaZakopow;
    EditText produktEditText;
    ListView listaZakopow;
    ArrayAdapter<String> arrayAdapter;

    public void dodajProduktDoListy(View view) {
        tablicaZakopow.add(produktEditText.getText().toString());

        Toast.makeText(getApplicationContext(), "Dodano " + produktEditText.getText().toString(), Toast.LENGTH_LONG).show();

        produktEditText.getText().clear();

        arrayAdapter.notifyDataSetChanged();
    }

    public void wyczyscListe(View view) {
        tablicaZakopow.clear();

        Toast.makeText(getApplicationContext(), "Wyczyszczono listę", Toast.LENGTH_LONG).show();

        arrayAdapter.notifyDataSetChanged();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tablicaZakopow = new ArrayList<>();
        listaZakopow = findViewById(R.id.listaZakopow);
        produktEditText = findViewById(R.id.produktEditText);

        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tablicaZakopow);
        listaZakopow.setAdapter(arrayAdapter);
    }


}
