package com.fatimacompany.fatima_assignment2_java;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;
import com.fatimacompany.fatima_assignment2_java.databinding.ActivityThanksBinding;

public class ThanksActivity extends AppCompatActivity {
    private ActivityThanksBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityThanksBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        TextView txv = binding.tvThanks;
        ImageView btn = binding.imSticker;
    }
}
