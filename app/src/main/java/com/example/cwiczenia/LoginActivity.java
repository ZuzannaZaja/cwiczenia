package com.example.cwiczenia;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static android.Manifest.permission.READ_CONTACTS;


public class LoginActivity extends AppCompatActivity{



    private EditText email, password;
    private Button btn_login;
    private Button btn_zadanie1;
    private ProgressBar loading;
    private static String URL_LOGIN ="http://ip-z-tablicy/cwiczenia/login1.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.email);
        password =  findViewById(R.id.password);
        loading = findViewById(R.id.loading);
        btn_login = findViewById(R.id.btn_login);
        btn_zadanie1 = findViewById(R.id.zadanie1);
        btn_zadanie1.setOnClickListener(new View.OnClickListener(){

        //TODO : ZADANIE 1

            @Override
            public void onClick(View v) {
                //Intent intent ...

            }

        });
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mEmail = email.getText().toString().trim();
                String mPass = password.getText().toString().trim();

                if(!mEmail.isEmpty() || !mPass.isEmpty()){
                    Login(mEmail, mPass);

                }else{
                    email.setError("Please insert email");
                    password.setError("Please insert password");
                }
            }
        });



    }




    private  void Login(final String email, final String password){
        loading.setVisibility(View.VISIBLE);
        btn_login.setVisibility(View.GONE);

       //TODO: ZADANIE 2
       //StringRequest stringRequest = ..







       //{
       //     @Override
       //     protected Map..
       // };
       //RequestQueue ..


    }





}

