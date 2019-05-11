package com.example.demo10;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class HomeFragment extends android.support.v4.app.Fragment {

    EditText editTextClass;
    EditText editTextSource;
    EditText editTextDestination;
    EditText editTextNoOfAdults;
    EditText getEditTextNoOfChildren;
    Button btnsub;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        editTextSource = (EditText) container.findViewById(R.id.edSource);
        editTextDestination = (EditText) container.findViewById(R.id.edDestination);
        editTextClass = (EditText) container.findViewById(R.id.edClass);
        editTextNoOfAdults = (EditText) container.findViewById(R.id.edNoOfAdult);
        getEditTextNoOfChildren = (EditText) container.findViewById(R.id.edNoOfChildren);
        btnsub = (Button)container.findViewById(R.id.btnSubmit);





        return inflater.inflate(R.layout.fragment_home, container, false);

    }
}
