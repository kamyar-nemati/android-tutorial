package com.kamyar.tutorial.fragmentsdiscussion;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class TopFragment extends Fragment {

    EditText inputText;
    Button sendButton;

    TopFragmentInterface topFragmentInterface;

    public interface TopFragmentInterface {
        void sendMessage(String message);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_top, container, false);

        inputText = (EditText) view.findViewById(R.id.inputText);
        sendButton = (Button) view.findViewById(R.id.sendButton);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendButton_onClick(v);
            }
        });

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            topFragmentInterface = (TopFragmentInterface) context;
        } catch (ClassCastException ex) {
            throw new ClassCastException(ex.getMessage());
        }
    }

    private void sendButton_onClick(View v) {
        String message = inputText.getText().toString();
        topFragmentInterface.sendMessage(message);
    }
}
