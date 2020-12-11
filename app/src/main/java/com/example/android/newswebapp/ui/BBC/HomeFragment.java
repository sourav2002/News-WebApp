package com.example.android.newswebapp.ui.BBC;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.android.newswebapp.R;
import com.example.android.newswebapp.WebViewController;
import com.example.android.newswebapp.ui.AlJazera.GalleryFragment;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        //web view
        WebView webView = root.findViewById(R.id.webViewbbc);
        webView.loadUrl("https://www.bbc.com/");
        webView.setWebViewClient(new WebViewController());

        return root;
    }
}