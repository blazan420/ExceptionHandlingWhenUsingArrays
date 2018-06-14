package com.example.kevin.exceptionhandlingwhenusingarrays;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtRates = (TextView)findViewById(R.id.txtRates);
        TextView txtNumberOfStarts = (TextView)findViewById(R.id.txtNumberOfStars);
        String oldTxtRatesValue;
        String oldTxtNumberOfStarsValue;

        int[] peopleRates = {1, 4, 3, 5, 2, 5, 1, 3, 4, 5, 2, 4, 5, 6};
        int[] occurance = new int[6];

        for (int respond = 0; respond < peopleRates.length; respond++) {

            //++occurance[peopleRates[respond]];
                            // 1

            try {
                ++occurance[peopleRates[respond]];

            } catch (Exception e) {

                Log.i("LOG", e.toString());

            }

        }

        for (int amount = 1; amount < occurance.length; amount++) {

            oldTxtRatesValue = txtRates.getText().toString();
            oldTxtNumberOfStarsValue = txtNumberOfStarts.getText().toString();

            txtRates.setText(oldTxtRatesValue + amount + "\n");
            txtNumberOfStarts.setText(oldTxtNumberOfStarsValue + occurance[amount] + "\n");
        }






    }
}
