package com.example.android_user.dreamassigments.Fragments;


import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android_user.dreamassigments.MainActivity;
import com.example.android_user.dreamassigments.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragments extends Fragment implements View.OnClickListener {
    public static final String LOGIN_URL="http://rahulkr.esy.es/UserRegistration/login.php";
    public static final String KEY_EMAIL="email";
    public static final String KEY_PASSWORD="password";
    public static final String LOGIN_SUCCESS="success";
    public static final String SHARED_PREF_NAME="tech";
    public static final String EMAIL_SHARED_PREF="email";
    public static final String LOGGEDIN_SHARED_PREF="loggedin";
    private String text;
    private boolean loggedIn=false;
    int page;
    Button b;
    TextView tv_signup;
    EditText uname, passw;
    String mUname, mPassw;
    TextInputLayout inputlayoutusername ,inputlayoutpassword ;


    public LoginFragments() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_login_fragments, container, false);
        b  = (Button) v.findViewById(R.id.login_btn);
        b.setOnClickListener(this);
        uname = (EditText) v.findViewById(R.id.uname);
        passw = (EditText) v.findViewById(R.id.passw);



        initViews(v);

        Toast.makeText(getActivity(),"Please swipe to Register ", Toast.LENGTH_SHORT).show();

        return  v;
    }
    public void initViews(View v) {

        TextView tv_forgetpasword = (TextView) v.findViewById(R.id.tv_forgetpasword);
        tv_forgetpasword.setPaintFlags(tv_forgetpasword.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        //TextView tv_signup = (TextView) v.findViewById(R.id.tv_signup);
        //tv_signup.setPaintFlags(tv_signup.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        uname = (EditText) v.findViewById(R.id.uname);
        passw = (EditText) v.findViewById(R.id.passw);
        inputlayoutusername = (TextInputLayout) v.findViewById(R.id.inputlayoutusername);
        inputlayoutpassword = (TextInputLayout) v.findViewById(R.id.inputlayoutpassword);
    }
    public void doSignIn() {
        mUname = uname.getText().toString();
        mPassw = passw.getText().toString();
        if (doValidation()) {

            Intent i = new Intent(getActivity(), MainActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);


        }

    }
    public void SignUp()
    {

        if (doValidation()) {





//            Intent i = new Intent(getContext(), SignUpFragments.class);
//            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//            startActivity(i);


        }
    }
    public boolean doValidation() {
        boolean isValid = true;
        if (mUname.equals("")) {
            isValid = false;
            // uname.setError("Please enter  user name");
            inputlayoutusername.setError("Please enter  user name");
            //inputlayoutusername.requestFocus();
            return false;

        }
        else
        {
            inputlayoutusername.setErrorEnabled(false);
        }

        if (mPassw.equals("")) {
            isValid = false;
            //passw.setError("Enter your password");
            inputlayoutpassword.setError("Enter your password");
            //inputlayoutpassword.requestFocus();
            return false;
        }
        else
        {
            inputlayoutpassword.setErrorEnabled(false);
        }

        if (mPassw != null && mPassw.length() < 6) {
            isValid = false;
            passw.setError("write atleast six char");
        }

        return isValid;
    }
    @Override
    public void onClick(View v) {
        doSignIn();
        SignUp();

    }
}
