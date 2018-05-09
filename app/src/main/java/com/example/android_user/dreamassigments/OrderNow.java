package com.example.android_user.dreamassigments;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android_user.dreamassigments.Others.DataDialog;
import com.example.android_user.dreamassigments.Others.FilePicker;
import com.example.android_user.dreamassigments.Others.FilePicker1;
import com.example.android_user.dreamassigments.Others.FilePicker2;
import com.example.android_user.dreamassigments.Others.FilePicker3;
import com.example.android_user.dreamassigments.Others.FilePicker4;
import com.example.android_user.dreamassigments.Others.MathCaptcha;

import java.io.File;

public class OrderNow extends AppCompatActivity implements View.OnClickListener{
    private static final int REQUEST_PICK_FILE = 1;
    private static final int REQUEST_PICK_FILES = 2;
    private static final int REQUEST_PICK_FILES1 = 3;
    private static final int REQUEST_PICK_FILES2 = 4;
    private static final int REQUEST_PICK_FILES3 = 5;



    private TextView filePath,filePath1,filePath2,filePath3,filePath4;
    private Button Browse,Browse1,Browse2,Browse3,Browse4;
    private File selectedFile,selectedFile1,selectedFile2,selectedFile3,selectedFile4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_now);
        Spinner spinnerdocument =(Spinner)findViewById(R.id.spinnerDocument);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.document_array,R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinnerdocument.setAdapter(adapter);
        Spinner spinnerContact =(Spinner)findViewById(R.id.spinnerContact);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.contact_array,R.layout.support_simple_spinner_dropdown_item);
        adapter1.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinnerContact.setAdapter(adapter1);
        Spinner noOfPage=(Spinner)findViewById(R.id.no_of_page_spinner);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.No_Of_page_array,R.layout.support_simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        noOfPage.setAdapter(adapter2);
        Spinner country=(Spinner)findViewById(R.id.spinnerCountry);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,R.array.country_name,R.layout.support_simple_spinner_dropdown_item);
        adapter3.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        country.setAdapter(adapter3);
        Spinner spacing=(Spinner)findViewById(R.id.spinnerSpaccing);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,R.array.Spacing_array,R.layout.support_simple_spinner_dropdown_item);
        adapter4.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spacing.setAdapter(adapter4);
        Spinner dictionary =(Spinner)findViewById(R.id.spinnerDictionary);
        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this,R.array.dictionary_array,R.layout.support_simple_spinner_dropdown_item);
        adapter5.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        dictionary.setAdapter(adapter5);

        filePath = (TextView)findViewById(R.id.file_path);
        Browse = (Button)findViewById(R.id.browse);
        Browse.setOnClickListener(this);

        filePath1 = (TextView)findViewById(R.id.file_path1);
        Browse1 = (Button)findViewById(R.id.browse1);
        Browse1.setOnClickListener(this);

        filePath2 = (TextView)findViewById(R.id.file_path2);
        Browse2 = (Button)findViewById(R.id.browse2);
        Browse2.setOnClickListener(this);

        filePath3 = (TextView)findViewById(R.id.file_path3);
        Browse3 = (Button)findViewById(R.id.browse3);
        Browse3.setOnClickListener(this);

        filePath4 = (TextView)findViewById(R.id.file_path4);
        Browse4 = (Button)findViewById(R.id.browse4);
        Browse4.setOnClickListener(this);


        final MathCaptcha mathCaptcha = new MathCaptcha(1100, 300, MathCaptcha.MathOptions.PLUS_MINUS);
        ImageView imageView = (ImageView) findViewById(R.id.image);
        imageView.setImageBitmap(mathCaptcha.getImage());
        View btnCheck = findViewById(R.id.btn_check);
        //final AppCompatEditText edtTextCaptcha = (AppCompatEditText) findViewById(R.id.edt_text_image);
        final AppCompatEditText edtMathCaptcha = (AppCompatEditText) findViewById(R.id.edt_math_image);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtMathCaptcha.setError(null);
               // edtTextCaptcha.setError(null);
                int numberOfCaptchaFalse = 0;

                //checking text captcha


                //checking math captcha
                if (!mathCaptcha.checkAnswer(edtMathCaptcha.getText().toString().trim())) {
                    edtMathCaptcha.setError("Captcha not match");
                    numberOfCaptchaFalse++;
                }

                if (numberOfCaptchaFalse == 0) {
                    Toast.makeText(OrderNow.this, "All captcha texts match!", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }

    @Override
    protected void onStart() {
        super.onStart();
        EditText editText =(EditText)findViewById(R.id.textDate);
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus)
                {
                    DataDialog dataDialog=new DataDialog(v);
                    FragmentTransaction ft=getFragmentManager().beginTransaction();
                    dataDialog.show(ft,"DataPicker");
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {

            case R.id.browse:
                Intent intent = new Intent(this, FilePicker.class);
                startActivityForResult(intent, REQUEST_PICK_FILE);
                break;
            case R.id.browse1:
                Intent intent1 = new Intent(this, FilePicker1.class);
                startActivityForResult(intent1, REQUEST_PICK_FILES);
                break;
            case R.id.browse2:
                Intent intent2 = new Intent(this, FilePicker2.class);
                startActivityForResult(intent2, REQUEST_PICK_FILES1);
                break;
            case R.id.browse3:
                Intent intent3 = new Intent(this, FilePicker3.class);
                startActivityForResult(intent3, REQUEST_PICK_FILES2);
                break;
            case R.id.browse4:
                Intent intent4 = new Intent(this, FilePicker4.class);
                startActivityForResult(intent4, REQUEST_PICK_FILES3);
                break;
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(resultCode == RESULT_OK) {

            switch(requestCode) {

                case REQUEST_PICK_FILE:

                    if(data.hasExtra(FilePicker.EXTRA_FILE_PATH)) {

                        selectedFile = new File
                                (data.getStringExtra(FilePicker.EXTRA_FILE_PATH));
                        filePath.setText(selectedFile.getPath());
                    }
                    break;

                case REQUEST_PICK_FILES:

                    if(data.hasExtra(FilePicker1.EXTRA_FILE_PATH)) {

                        selectedFile1 = new File
                                (data.getStringExtra(FilePicker1.EXTRA_FILE_PATH));
                        filePath1.setText(selectedFile1.getPath());
                    }
                    break;

                case REQUEST_PICK_FILES1:

                    if(data.hasExtra(FilePicker2.EXTRA_FILE_PATH)) {

                        selectedFile2 = new File
                                (data.getStringExtra(FilePicker2.EXTRA_FILE_PATH));
                        filePath2.setText(selectedFile2.getPath());
                    }
                    break;

                case REQUEST_PICK_FILES2:

                    if(data.hasExtra(FilePicker3.EXTRA_FILE_PATH)) {

                        selectedFile3 = new File
                                (data.getStringExtra(FilePicker3.EXTRA_FILE_PATH));
                        filePath3.setText(selectedFile3.getPath());
                    }
                    break;

                case REQUEST_PICK_FILES3:

                    if(data.hasExtra(FilePicker4.EXTRA_FILE_PATH)) {

                        selectedFile4 = new File
                                (data.getStringExtra(FilePicker4.EXTRA_FILE_PATH));
                        filePath4.setText(selectedFile4.getPath());
                    }
                    break;



            }
        }
    }
}
