package pl.billog_studio.exodus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gra_end extends AppCompatActivity {
    public void onBackPressed()
    {

        //thats it
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gra_end);
        final Button button2 = (Button)findViewById(R.id.button);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(gra_end.this, gra_nowy_dzien.class);
                startActivity(intent);
                finish();
            }

        });
    }
}
