package mcm.edu.ph.capstone_abstruse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Recommendation extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommendation);

        Button home = findViewById(R.id.homeBtn);

        home.setOnClickListener(this);

        }
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.homeBtn:
                Intent home = new Intent(this,MenuMelon.class);
                startActivity(home);
                break;
        }
    }
}
