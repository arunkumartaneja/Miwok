package com.abnd.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set OnClick Listeners for each activity
        setCustomOnClickListener(R.id.numbers, NumbersActivity.class);
        setCustomOnClickListener(R.id.family, FamilyActivity.class);
        setCustomOnClickListener(R.id.colors, ColorsActivity.class);
        setCustomOnClickListener(R.id.phrases, PhrasesActivity.class);
    }

    public void setCustomOnClickListener(int resourceID, final Class className) {
        View view = findViewById(resourceID);
        view.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), className);
                        startActivity(intent);
                    }
                }
        ); //close parenthesis
    }


}
