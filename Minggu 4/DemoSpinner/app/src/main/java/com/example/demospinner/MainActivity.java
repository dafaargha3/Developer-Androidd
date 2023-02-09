package com.example.demospinner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import org.jetbrains.annotations.NonNls;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner_anggota);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.anggota,
                android.R.layout.simple_spinner_dropdown_item);

        if (spinner != null)
            spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String msg = adapterView.getAdapter().getItem(i).toString();
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()){
            case R.id.mi_meeting:
            displayToast("I am in meeting");
            break;

            case R.id.mi_breakfast:
                displayToast("I am in breakfast");
                break;

            case R.id.mi_lunch:
                displayToast("I am in lunch");
                break;

            case R.id.dinner:
                displayToast("I am in dinner");
                break;
        }
    return  super.onOptionsItemSelected(item);
    }
    private void displayToast(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show());
    }
}