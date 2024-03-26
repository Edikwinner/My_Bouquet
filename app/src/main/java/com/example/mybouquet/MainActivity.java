package com.example.mybouquet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    //New comment

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.fragment, new HomeFragment()).commit();
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.home_screen){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new HomeFragment()).commit();
                    return true;
                }
                else if(item.getItemId() == R.id.maps_screen){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new MapFragment()).commit();
                    return true;
                }
                else if(item.getItemId() == R.id.custom_bouquet_screen){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new AddFragment()).commit();
                    return true;
                }
                else if(item.getItemId() == R.id.favorite_screen){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new FavoriteFragment()).commit();
                    return true;
                }
                else if(item.getItemId() == R.id.profile_screen){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new UserFragment()).commit();
                    return true;
                }
                return false;
            }
        });
    }
}