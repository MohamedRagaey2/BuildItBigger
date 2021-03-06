package m.ragaey.mohamed.androidlib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        TextView jokeText = findViewById(R.id.joke_text_view);

        Intent intent = getIntent();

        if (intent != null && intent.hasExtra(AppConstants.JOKE_KEY)) {
            String joke = intent.getStringExtra(AppConstants.JOKE_KEY);

            if (joke != null && !joke.isEmpty()) {
                jokeText.setText(joke);
            } else {
                jokeText.setText("No Jokes Found!");
            }
        } else {
            jokeText.setText("No Jokes Passed!");
        }
    }
}
