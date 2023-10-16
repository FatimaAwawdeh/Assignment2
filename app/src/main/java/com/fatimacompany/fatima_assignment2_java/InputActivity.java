package com.fatimacompany.fatima_assignment2_java;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.fatimacompany.fatima_assignment2_java.databinding.ActivityInputBinding;

public class InputActivity extends AppCompatActivity {
    private ActivityInputBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInputBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initListener();
    }

    private void initListener() {
        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InputActivity.this, ResultActivity.class);
                intent.putExtra("name", binding.edName.getText().toString());
                intent.putExtra("address", binding.edAddress.getText().toString());
                intent.putExtra("city", binding.edCity.getText().toString());
                intent.putExtra("telephone", binding.edTelephone.getText().toString());
                intent.putExtra("type", binding.edType.getText().toString());
                intent.putExtra("credit", binding.edCredit.getText().toString());
                intent.putExtra("cvv", binding.edCvv.getText().toString());
                startActivity(intent);
            }
        });
    }
}
