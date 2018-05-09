package com.example.android_user.dreamassigments;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ContactUs extends AppCompatActivity implements View.OnClickListener{
    ImageView message,call,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        message=(ImageView)findViewById(R.id.contact_message);
        call=(ImageView)findViewById(R.id.contact_call);
        call.setOnClickListener(this);
        email=(ImageView)findViewById(R.id.contact_email);

        Email();
        message();
    }




    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.contact_call:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("You need to call our Customer care.")
                        .setCancelable(false)
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                // TODO Auto-generated method stub
                                dialog.dismiss();
                            }
                        });

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // TODO Auto-generated method stub

                        Intent phoneIntent = new Intent(Intent.ACTION_CALL);
                        phoneIntent.setData(Uri.parse("tel: 0867-6754-543"));

                        try{
                            startActivity(phoneIntent);
                        }

                        catch (android.content.ActivityNotFoundException ex){
                            Toast.makeText(getApplicationContext(),"yourActivity is not founded",Toast.LENGTH_SHORT).show();
                        }

                    }
                });
                AlertDialog alert = builder.create();
                alert.show();

        }

    }
    public void Email()
    {
        email.setOnClickListener(new View.OnClickListener() {
            Intent intent=null, chooser=null;
            @Override
            public void onClick(View v) {
                intent=new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                String[] to={"pfajitshaw@gmail.com"};
                intent.putExtra(Intent.EXTRA_EMAIL,to);
                intent.putExtra(Intent.EXTRA_SUBJECT,"Order Assignment");
                //intent.putExtra(Intent.EXTRA_TEXT,"hey whats app,these is my fst email message");
                intent.setType("message/rfc822");
                chooser=Intent.createChooser(intent,"Send Email");
                startActivity(chooser);

            }
        });
    }
    public void message()
    {
        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Send SMS", "");
                Intent smsIntent = new Intent(Intent.ACTION_VIEW);

                smsIntent.setData(Uri.parse("smsto:"));
                smsIntent.setType("vnd.android-dir/mms-sms");
                smsIntent.putExtra("address"  , new String ("(+1)3238253015"));
                smsIntent.putExtra("sms_body"  , " ");

                try {
                    startActivity(smsIntent);
                    finish();
                    Log.i("Finished sending SMS...", "");
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(getApplicationContext(),
                            "SMS faild, please try again later.", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
