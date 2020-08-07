package com.rhythamnegi.foodrating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 TextView comment;
 Button submit;
 ImageView imageView;
 RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBar = findViewById(R.id.ratingBar);
        comment = findViewById(R.id.comment);
        submit= findViewById(R.id.button);
        imageView = findViewById(R.id.imageView);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean b) {
                if(rating<=2)
                {
                    imageView.setImageResource(R.drawable.bad);

                    comment.setText(R.string.low_rating);
                }

                else if(rating >2  && rating<4)
                {

                    imageView.setImageResource(R.drawable.satisfied);
                    comment.setText(R.string.medium_rating);
                }
                else
                {
                    imageView.setImageResource(R.drawable.love);
                    comment.setText(R.string.high_rating);
                }
            }
        });

       submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float rating = ratingBar.getRating();

                if(rating<=2)
                {
                    imageView.setImageResource(R.drawable.bad);

                    comment.setText(R.string.low_rating);
                }

                else if(rating >2  && rating<4)
                {

                    imageView.setImageResource(R.drawable.satisfied);
                    comment.setText(R.string.medium_rating);
                }
                else
                {
                    imageView.setImageResource(R.drawable.love);
                    comment.setText(R.string.high_rating);
                }
            }
        });
    }
}