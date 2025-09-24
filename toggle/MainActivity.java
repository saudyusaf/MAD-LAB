package com.example.toggle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView image1, image2;
    Button toggleBtn;
    boolean showFirst = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bind with IDs from XML
        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        toggleBtn = findViewById(R.id.toggleBtn);

        toggleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (showFirst) {
                    image1.setVisibility(View.GONE);
                    image2.setVisibility(View.VISIBLE);
                } else {
                    image1.setVisibility(View.VISIBLE);
                    image2.setVisibility(View.GONE);
                }
                showFirst = !showFirst;
            }
        });
    }
}
