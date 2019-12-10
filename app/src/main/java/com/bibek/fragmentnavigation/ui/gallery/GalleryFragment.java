package com.bibek.fragmentnavigation.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.bibek.fragmentnavigation.R;

public class GalleryFragment extends Fragment implements View.OnClickListener {
    private Button btnPalindromenumber;
    private EditText etPalindrome;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //  galleryViewModel =
        //  ViewModelProviders.of(this).get(GalleryViewModel.class);
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        etPalindrome=view.findViewById(R.id.etpalindromenumber);
        btnPalindromenumber=view.findViewById(R.id.btnPalindrome);

        btnPalindromenumber.setOnClickListener(this);
        return view;
        // final TextView textView = root.findViewById(R.id.text_gallery);
        // galleryViewModel.getText().observe(this, new Observer<String>() {
        // @Override
        // public void onChanged(@Nullable String s) {
        //   textView.setText(s);
        //  }
        //  });
        // return root;
    }

    @Override
    public void onClick(View v) {
        int pal=Integer.parseInt(etPalindrome.getText().toString());

        Palindrome palindrome=new Palindrome();
        int result=palindrome.reverse(pal);

        if (result==pal)
        {
            Toast.makeText(getActivity(),pal + " is palindrome number",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getActivity(),pal + " is not palindrome number",Toast.LENGTH_LONG).show();
        }

    }
}