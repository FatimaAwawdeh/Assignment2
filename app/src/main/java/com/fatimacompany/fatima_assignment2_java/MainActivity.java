package com.fatimacompany.fatima_assignment2_java;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.fatimacompany.fatima_assignment2_java.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        addCallback();
        initListener();
    }

    private void showDialog4() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Google Pixel Mobile phone")
                .setMessage("Google Pixel is a brand of portable consumer electronic devices developed by Google that run either ChromeOS or the Android operating system. The main line of Pixel products consist of Android-powered smartphones, which have been produced since October 2016 as the replacement of the older Nexus, and of which the Pixel 7 is the current model. The Pixel brand also includes laptop and tablet computers, as well as several accessories, and was originally introduced in February 2013 with the Chromebook Pixel.")
                .setPositiveButton("OK", (dialog, which) -> dialog.dismiss());
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void showdialodg3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Oppo Mobile phone")
                .setMessage("OPPO Company was founded in 2004 and launched its DVD products in Europe and the United States in the same year. In 2008, OPPO launched its first mobile phone -- OPPO A103 \"Smiley Face\" and officially entered the mobile phone industry. OPPO continues to show goodwill in science and technology and the attitude \"Inspiration Ahead\" with all users.")
                .setPositiveButton("OK", (dialog, which) -> dialog.dismiss());
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void showdialodg2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Samsung Mobile phone")
                .setMessage("Samsung specializes in the production of a wide variety of consumer and industry electronics, including appliances, digital media devices, semiconductors, memory chips, and integrated systems. It has become one of the most-recognizable names in technology and produces about a fifth of South Korea’s total exports.")
                .setPositiveButton("OK", (dialog, which) -> dialog.dismiss());
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void showdialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Apple Mobile phone")
                .setMessage("Apple Inc. is an American multinational technology company headquartered in Cupertino, California. Apple is the world's largest technology company by revenue, with US$394.3 billion in 2022 revenue. As of March 2023, Apple is the world's biggest company by market capitalization.")
                .setPositiveButton("OK", (dialog, which) -> dialog.dismiss());
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void addCallback() {
        binding.imageButton1.setOnClickListener(v -> showdialog());
        binding.imageButton2.setOnClickListener(v -> showdialodg2());
        binding.imageButton3.setOnClickListener(v -> showdialodg3());
        binding.imageButton4.setOnClickListener(v -> showDialog4());
    }
    private void initListener() {
        binding.tbMain.setOnMenuItemClickListener(item -> {
            switch (item.getItemId()) {
                case R.id.test:
                case R.id.SAMSUNG:
                case R.id.GOOGLE:
                case R.id.OPPO:
                    Intent intent = new Intent(this, ListActivity.class);
                    startActivity(intent);
                    return true;
                default:
                    return false;
            }
        });
    }
}
