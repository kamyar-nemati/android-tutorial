package com.kamyar.tutorial.fragmentsdiscussion;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class BottomFragment extends Fragment {

    EditText outputText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bottom, container, false);

        outputText = view.findViewById(R.id.outputText);

        return view;
    }

    public void setMessage(String message) {
        outputText.setText(message);
    }
}
