package com.example.gamil;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnNextActivity;
    private Integer age = 18;
    public static final String USERNAME_KEY = "gmail";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNextActivity = findViewById(R.id.btn_next_activity);

        btnNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createIntent();

            }
        });

    }
    private void createIntent(){
//        Intent intent = new Intent();
//        intent.setType("gmail/*");
//        intent.setAction(Intent.ACTION_GET_CONTENT);
//        startActivity(intent);


        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto", "rsk.mva@gmail.com", null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "This is my subject text");
        startActivity(Intent.createChooser(emailIntent, null));
    }
}















