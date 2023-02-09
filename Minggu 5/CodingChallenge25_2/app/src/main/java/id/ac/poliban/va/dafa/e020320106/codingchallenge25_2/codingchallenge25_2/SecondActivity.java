package id.ac.poliban.va.dafa.e020320106.codingchallenge25_2.codingchallenge25_2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import id.ac.poliban.va.dwi.e020320002.codingchallenge25_2.R;

public class SecondActivity extends BaseClass {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Initialize the views.
        ImageView redBlock = findViewById(R.id.redBlock);
        ImageView blueBlock = findViewById(R.id.blueBlock);
        ImageView yellowBlock = findViewById(R.id.yellowBlock);
        ImageView androidBlock = findViewById(R.id.androidBlock);

        // Set the methods from the base class to the appropriate ImageViews.
        explodeTransition(this, redBlock);
        fadeTransition(this, blueBlock);
        rotateView(yellowBlock);
        switchAnimation(androidBlock,blueBlock,new Intent(
                this,MainActivity.class),this);
    }
}
