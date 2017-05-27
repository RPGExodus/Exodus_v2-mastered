package pl.billog_studio.exodus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import Gra.*;
public class pest_goloszenia extends AppCompatActivity {
    public void onBackPressed()
    {

        //thats it
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pest_goloszenia);
        final Button button1 = (Button)findViewById(R.id.button_to_pest_mission_straz_miejska);
        button1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(pest_goloszenia.this ,pest_mission_straz_miejska.class);
                startActivity(intent);
                finish();
            }});
        final Button button2 = (Button)findViewById(R.id.button_to_pest_mission_gildia_kupiecka);
        button2.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(pest_goloszenia.this ,pest_mission_gildia_kupiecka.class);
                startActivity(intent);
                finish();
            }});
        final Button button3 = (Button)findViewById(R.id.button_to_pest_mission_zaginiony_kowal);
        button3.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(pest_goloszenia.this ,pest_mission_zaginiony_kowal.class);
                startActivity(intent);
                finish();
            }});
        final Button button4 = (Button)findViewById(R.id.button_to_pest_karczma);
        button4.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(pest_goloszenia.this ,pest_karczma.class);
                startActivity(intent);
                finish();
            }});
        final Button button5 = (Button)findViewById(R.id.button_to_pest_miejski_rynek);
        button5.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(pest_goloszenia.this ,pest_miejski_rynek.class);
                startActivity(intent);
                finish();
            }});
        final Button button6 = (Button)findViewById(R.id.button_to_krolewskie_wiesci_02);
        button6.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(pest_goloszenia.this ,krolewskie_wiesci.class);
                startActivity(intent);
                finish();
            }});
        final Button button7 = (Button)findViewById(R.id.button_to_pest_gildia_najemnikow);
        button7.setVisibility(View.INVISIBLE);
        button7.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {


                Intent intent = new Intent(pest_goloszenia.this ,pest_gildia_najemnikow.class);
                startActivity(intent);
                finish();
            }});
    }
}
