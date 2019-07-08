package com.ZiHaoHe.cameraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mButton;
    private ImageView mImageView;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton =(Button) findViewById(R.id.camera_button);
        mImageView = (ImageView) findViewById(R.id.image_view);

        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}

