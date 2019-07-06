package com.example.fragementapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ContentFragement extends Fragment {
    private Button contentButton;
    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle saveInstanceState){
        View fragementView = inflater.inflate(R.layout.fragement_content,
                container,false);
        initView(fragementView);
        return fragementView;
    }

    private void initView(View fragementView){
        textView = (TextView)fragementView.findViewById(R.id.contentText);
        contentButton = (Button)fragementView.findViewById(R.id.contentButton);
        contentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("After Clicked");
            }
        });

    }
}
