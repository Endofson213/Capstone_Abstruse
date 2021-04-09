package mcm.edu.ph.capstone_abstruse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ExterminationMenu extends AppCompatActivity implements View.OnClickListener {

    TextView melon1Text,melon2Text,melon3Text,melon4Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button melonImgButton1 = findViewById(R.id.melonBtn1);
        Button melonImgButton2 = findViewById(R.id.melonBtn2);
        Button melonImgButton3 = findViewById(R.id.melonBtn3);
        Button melonImgButton4 = findViewById(R.id.melonBtn4);
        melon1Text = findViewById(R.id.melon1Text);
        melon2Text = findViewById(R.id.melon2Text);
        melon3Text = findViewById(R.id.melon3Text);
        melon4Text = findViewById(R.id.melon4Text);

        melonImgButton1.setOnClickListener(this);
        melonImgButton2.setOnClickListener(this);
        melonImgButton3.setOnClickListener(this);
        melonImgButton4.setOnClickListener(this);

        melon1Text.setText("Info of Melon1 Here");
        melon2Text.setText("Info of Melon2 Here");
        melon3Text.setText("Info of Melon3 Here");
        melon4Text.setText("Info of Melon4 Here");
    }
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.melonBtn1:
                        Intent Melon1 = new Intent(ExterminationMenu.this, Pesticides.class);
                        startActivity(Melon1);
                        break;
                    case R.id.melonBtn2:
                        Intent Melon2 = new Intent (ExterminationMenu.this, Pesticides.class);
                        startActivity(Melon2);
                        break;
                    case R.id.melonBtn3:
                        Intent Melon3 = new Intent(ExterminationMenu.this, Pesticides.class);
                        startActivity(Melon3);
                        break;
                    case R.id.melonBtn4:
                        Intent Melon4 = new Intent(ExterminationMenu.this, Pesticides.class);
                        startActivity(Melon4);
                        break;
            }
        }
    }