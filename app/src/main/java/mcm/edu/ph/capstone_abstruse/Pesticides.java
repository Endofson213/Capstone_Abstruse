package mcm.edu.ph.capstone_abstruse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Pesticides extends AppCompatActivity implements View.OnClickListener {

    TextView pest1Txt,pest2Txt,pest3Txt,pest4Txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesticides);


        Button pestImgButton1 = findViewById(R.id.pestBtn1);
        Button pestImgButton2 = findViewById(R.id.pestBtn2);
        Button pestImgButton3 = findViewById(R.id.pestBtn3);
        Button pestImgButton4 = findViewById(R.id.pestBtn4);
        pest1Txt = findViewById(R.id.pest1Text);
        pest2Txt = findViewById(R.id.pest2Text);
        pest3Txt = findViewById(R.id.pest3Text);
        pest4Txt = findViewById(R.id.pest4Text);

        pestImgButton1.setOnClickListener(this);
        pestImgButton2.setOnClickListener(this);
        pestImgButton3.setOnClickListener(this);
        pestImgButton4.setOnClickListener(this);

        pest1Txt.setText("Info of Pest1 Here");
        pest2Txt.setText("Info of Pest2 Here");
        pest3Txt.setText("Info of Pest3 Here");
        pest4Txt.setText("Info of Pest4 Here");
    }
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.pestBtn1:
                Intent Melon1 = new Intent(Pesticides.this, Recommendation.class);
                startActivity(Melon1);
                break;
            case R.id.pestBtn2:
                Intent Melon2 = new Intent (Pesticides.this, Recommendation.class);
                startActivity(Melon2);
                break;
            case R.id.pestBtn3:
                Intent Melon3 = new Intent(Pesticides.this, Recommendation.class);
                startActivity(Melon3);
                break;
            case R.id.pestBtn4:
                Intent Melon4 = new Intent(Pesticides.this, Recommendation.class);
                startActivity(Melon4);
                break;
        }
    }
}