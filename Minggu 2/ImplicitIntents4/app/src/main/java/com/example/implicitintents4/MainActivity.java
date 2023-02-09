package com.example.implicitintents4;

import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity<imageView> extends AppCompatActivity {
    imageView = (ImageView) this.findViewById(R.id.image);

    Button photoButton = (Button) this.findViewById(R.id.button_picture);

        photoButton.setOnClickListener(new View.OnClickListener() {

        @Override

        public void onClick(View v) {

            Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);

            startActivityForResult(cameraIntent, CAMERA_REQUEST);

        }