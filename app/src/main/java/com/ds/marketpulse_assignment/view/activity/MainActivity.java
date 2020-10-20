package com.ds.marketpulse_assignment.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.ds.marketpulse_assignment.R;
import com.ds.marketpulse_assignment.view.fragment.ListFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_page);
        attachFragemnt(new ListFragment(),R.id.fragment_container,"ListFragment");
    }

    private void attachFragemnt (Fragment fragment, int containerId, String Tag) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(containerId,fragment);
        fragmentTransaction.addToBackStack(Tag);
        fragmentTransaction.commit();
    }
}