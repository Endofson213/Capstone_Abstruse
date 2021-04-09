package mcm.edu.ph.capstone_abstruse;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuMelon extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_melon);

        Button extBtn = findViewById(R.id.exterminationMenu);
        Button prvtBtn = findViewById(R.id.preventionMenu);
        Button termsBtn = findViewById(R.id.termsMenu);

        extBtn.setOnClickListener(this);
        prvtBtn.setOnClickListener(this);
        termsBtn.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.exterminationMenu:
                Intent Extermination = new Intent(MenuMelon.this, ExterminationMenu.class);
                startActivity(Extermination);
                break;
            case R.id.preventionMenu:
                Intent Prevention = new Intent(MenuMelon.this, ExterminationMenu.class);
                startActivity(Prevention);
                break;
            case R.id.termsMenu:
                Intent Terms = new Intent(MenuMelon.this, ExterminationMenu.class);
                startActivity(Terms);
                break;
        }


    }
}
