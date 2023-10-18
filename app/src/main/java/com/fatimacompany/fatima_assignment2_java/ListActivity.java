package com.fatimacompany.fatima_assignment2_java;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import com.fatimacompany.fatima_assignment2_java.databinding.ActivityListBinding;

public class ListActivity extends AppCompatActivity {

    private ActivityListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Spinner spinner1 = binding.iphoneSpinner;
        Spinner spinner2 = binding.samsungSpinner;
        Spinner spinner3 = binding.oppoSpinner;
        Spinner spinner4 = binding.googleSpinner;
        Spinner spinner = binding.spinner;
        Button  button = binding.gobtn;
        RadioGroup radioGroup = binding.group;

        button.setOnClickListener(v -> {
                Intent intent = new Intent(ListActivity.this, InputActivity.class);

            startActivity(intent);
                }
        );





        String[] colors = new String[]{"Colors", "Blue", "Black", "Silver", "Gold"};
        ArrayAdapter<String> adapterSpinner = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, colors);
        adapterSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapterSpinner);

        String[] iphone = new String[]{"iphone phones", "iphone 14", "iphone 12", "iphone 14 pro"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, iphone);
        spinner1.setAdapter(adapter1);

        String[] Samsung = new String[]{"Samsung phones", "Samsung Galaxy S21", "Samsung Galaxy Note 20", "Samsung Galaxy A52"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Samsung);
        spinner2.setAdapter(adapter2);

        String[] oppo = new String[]{"Oppp phones", "Oppo Find X3 Pro", "Oppo Reno 6 Pro", "Oppo A74"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, oppo);
        spinner3.setAdapter(adapter3);

        String[] GooglePixel = new String[]{"Google Pixel phones", "Google Pixel 6", "Google Pixel 5a", "Google Pixel 4a"};
        ArrayAdapter<String> adapter4 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, GooglePixel);
        spinner4.setAdapter(adapter4);
    }
}

//تبقى جزئية ال pass data from ListActivity to ResultActivity
//    Intent intent = new Intent(ListActivity.this, ResultActivity.class);
//    String selectedIphone = spinner1.getSelectedItem().toString();
//    String selectedSamsung = spinner2.getSelectedItem().toString();
//    String selectedOppo = spinner3.getSelectedItem().toString();
//    String selectedGoogle = spinner4.getSelectedItem().toString();
//    String selectedPhone = spinner.getSelectedItem().toString();
//    int selectedRadioId = radioGroup.getCheckedRadioButtonId();
//    RadioButton selectedRadioButton = findViewById(selectedRadioId);
//    String selectedStorage = selectedRadioButton.getText().toString();
//
//    intent.putExtra("phone", selectedPhone);
//     intent.putExtra("iphone", selectedIphone);
//     intent.putExtra("samsung", selectedSamsung);
//      intent.putExtra("oppo", selectedOppo);
//      intent.putExtra("google", selectedGoogle);
//      intent.putExtra("storage", selectedStorage);
//
//      startActivity(intent);