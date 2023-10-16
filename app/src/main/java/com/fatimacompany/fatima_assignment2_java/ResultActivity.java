package com.fatimacompany.fatima_assignment2_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.fatimacompany.fatima_assignment2_java.databinding.ActivityResultActicityBinding;

public class ResultActivity extends AppCompatActivity {
    private ActivityResultActicityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResultActicityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        fillData(getIntent());

        Button next = binding.Button3;
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this, ThanksActivity.class);
                startActivity(intent);
            }
        });
    }

    private void fillData(Intent intent) {
        TextView tv1 = binding.tv1;
        TextView tv2 = binding.tv2;
        TextView tv3 = binding.tv3;
        TextView tv4 = binding.tv4;
        TextView tv5 = binding.tv5;
        TextView tv6 = binding.tv6;
        TextView tv7 = binding.tv7;

        tv1.setText("Name: " + intent.getStringExtra("name"));
        tv2.setText("Address: " + intent.getStringExtra("address"));
        tv3.setText("City: " + intent.getStringExtra("city"));
        tv6.setText("Telephone: " + intent.getStringExtra("telephone"));
        tv5.setText("Type: " + intent.getStringExtra("type"));
        tv4.setText("Credit: " + intent.getStringExtra("credit"));
        tv7.setText("CVV: " + intent.getStringExtra("cvv"));
    }
}
