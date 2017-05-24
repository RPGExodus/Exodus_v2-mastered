package pl.billog_studio.exodus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class wczytaj_gre extends Activity {
    public void onBackPressed()
    {

        //thats it
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wczytaj_gre);
        try {
            Intent next=new Intent(wczytaj_gre.this,Class.forName("Gra_1").getClass());
            startActivity(next);
            finish();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        };
    }
}
