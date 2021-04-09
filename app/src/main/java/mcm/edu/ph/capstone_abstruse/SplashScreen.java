package mcm.edu.ph.capstone_abstruse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    ImageView logoImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Listener();
    }
        public void Listener() {
        logoImg = findViewById(R.id.logoImg);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                Intent i = new Intent(SplashScreen.this, MenuMelon.class);
                startActivity(i);
            }
        },3000);
    }
}

