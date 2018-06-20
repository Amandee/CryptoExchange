package com.example.almandee.cryptoexchange;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        Button clickButton = findViewById(R.id.btnlogin);
        clickButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startMain =new Intent(getApplicationContext(), MainMenu.class);
                startActivity(startMain);

            }
        });

    }

}
