package com.example.romymae.userinputtwee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

public void fout (View view){
    String FoutAntwoord ="Dit is het foute antwoord.";
    displayFout (FoutAntwoord);
}
    public void goed (View view){
        String GoedAntwoord ="Dit is het goede antwoord";
        displayGoed (GoedAntwoord);
    }
    public void fout2 (View view){
        String FoutAntwoord ="Dit is het foute antwoord.";
        displayFout2 (FoutAntwoord);
    }
    public void goed2 (View view){
        String GoedAntwoord ="Dit is het goede antwoord";
        displayGoed2 (GoedAntwoord);
    }





    private void displayFout(String message) {
        TextView TextView = (TextView) findViewById(R.id.tekst1);
       TextView.setText(message);
    }

    private void displayGoed(String message) {
        TextView TextView = (TextView) findViewById(R.id.tekst1);
        TextView.setText(message);
    }
    private void displayFout2(String message) {
        TextView TextView = (TextView) findViewById(R.id.tekst2);
        TextView.setText(message);
    }

    private void displayGoed2(String message) {
        TextView TextView = (TextView) findViewById(R.id.tekst2);
        TextView.setText(message);
    }

















}
