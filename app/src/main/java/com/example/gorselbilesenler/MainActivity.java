package com.example.gorselbilesenler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    TextView textName;
    TextView textFirmName;
    Button buttonStart;
    EditText editUserName;
    ImageView imageFirm;
    Button buttonGizle;
    Button buttonGoster;

    LinearLayout linearNames;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textName = findViewById(R.id.textName);
        textFirmName = findViewById(R.id.textFirmName);
        buttonStart = findViewById(R.id.buttonStart);
        editUserName = findViewById(R.id.editUserName);
        imageFirm = findViewById(R.id.imageFirm);
        linearNames = findViewById(R.id.linearNames);
        buttonGizle = findViewById(R.id.buttonGizle);
        buttonGoster = findViewById(R.id.buttonGoster);

        // TextView'in içindeki metni değiştirme
        textName.setText("Benim Adım : Esra");
        textFirmName.setText("Firm Name : Keşif Plus");

        // Toast Mesaj
        Toast.makeText(MainActivity.this, "Toast mesaj denemesi", Toast.LENGTH_LONG).show();

        textName.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this, "TextName alanına tıklandı!!!", Toast.LENGTH_LONG).show();
            }
        });

        buttonStart.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (editUserName.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this, "User name kısmı boş olamaz!!!", Toast.LENGTH_LONG).show();
                }
                linearNames.setVisibility(View.GONE);

            }
        });

        imageFirm.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                textFirmName.setVisibility(View.INVISIBLE);
            }
        });

        buttonGizle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearNames.setVisibility(View.GONE);
            }
        });

        buttonGoster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearNames.setVisibility(View.VISIBLE);
            }
        });


    }
}