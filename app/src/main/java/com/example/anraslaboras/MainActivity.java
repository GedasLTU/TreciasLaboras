package com.example.anraslaboras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText tekstolaukas;
    TextView rezultatas;
    Spinner spinner;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.Pasirinkimas,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        this.tekstolaukas = findViewById(R. id. tekstolaukas);
        this.rezultatas = findViewById(R.id.rezultatas);

    }

    public void mygtukoskaiciavimas(View view) {
        String phrase = tekstolaukas.getText().toString(); //gets you the contents of edit text
        if (TextUtils.isEmpty(phrase)){
            Toast.makeText(this, "Teksto laukas tuscias", Toast.LENGTH_SHORT).show();
            return;
        }

        String selectedOption = this.spinner.getSelectedItem().toString();
        if(selectedOption.equalsIgnoreCase("simboliai")){
            int charsCount = Skaiciavimokodas.getCharsCount(phrase);
            this.rezultatas.setText(String.valueOf(charsCount));
        }
        else {
            Skaiciavimokodas tc = new Skaiciavimokodas();
            int charsCount = tc.getWordsCount(phrase);
            this.rezultatas.setText(String.valueOf(charsCount));

        }


    }
}