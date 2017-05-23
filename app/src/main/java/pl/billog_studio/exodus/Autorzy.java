package pl.billog_studio.exodus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Autorzy extends Activity {
    public void onBackPressed()
    {

        //thats it
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autorzy);
        final Button powrot = (Button)findViewById(R.id.button_powrot);
        powrot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Autorzy.this, Main_Menu.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
