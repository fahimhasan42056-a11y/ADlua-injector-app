package com.example.adluainjector;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // আমাদের বোতাম খুঁজে আনা
        Button injectButton = findViewById(R.id.injectButton);

        // বোতামে ক্লিক করলে কী হবে সেটা লেখা
        injectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // এখানে তুমি আসল কাজ বসাতে পারো
                Toast.makeText(MainActivity.this,
                        "🚀 Injection Started!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
