package pl.billog_studio.exodus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gra_atak_1_a extends AppCompatActivity {
    public void onBackPressed()
    {

        //thats it
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gra_atak_1_a);
        final Button button = (Button)findViewById(R.id.gra_atak_1_dalej);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(gra_atak_1_a.this, gra_atak_najemnik.class);
                startActivity(intent);
            }
        });
    }
}
