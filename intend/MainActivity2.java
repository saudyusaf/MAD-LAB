package com.example.intent1;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String imgIndex = bundle.getString("ImageIndex");
            setImage(imgIndex);
        }
    }

    private void setImage(String index) {
        ImageView imageView = (ImageView) findViewById(R.id.images);

        switch (index) {
            case "1":
                imageView.setImageResource(R.drawable.image1);
                break;
            case "2":
                imageView.setImageResource(R.drawable.image2);
                break;
            case "3":
                imageView.setImageResource(R.drawable.image3);
                break;
            case "4":
                imageView.setImageResource(R.drawable.image4);
                break;
            default:
                Toast.makeText(this, "Index is not available", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
