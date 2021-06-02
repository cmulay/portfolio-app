package com.mad.portfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.mad.portfolio.connect.ContactFragment;
import com.mad.portfolio.cv.WorkFragment;
import com.mad.portfolio.edu.EduFragment;
import com.mad.portfolio.home.HomeFragment;
import com.mad.portfolio.sidemenu.Callback;
import com.mad.portfolio.sidemenu.MenuAdapter;
import com.mad.portfolio.sidemenu.MenuItem;
import com.mad.portfolio.sidemenu.MenuUtil;
import com.mad.portfolio.testimonials.TestimonialFragment;

import java.util.List;

public class MainActivity extends AppCompatActivity implements Callback{

    RecyclerView menuRv;
    List<MenuItem> menuItems;
    MenuAdapter adapter;
    int selectedMenuPos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        
        setupSideMenu();
        setHomeFragment();
    }

    private void setupSideMenu() {
        menuRv = findViewById(R.id.rv_side_menu);


        menuItems = MenuUtil.getMenuList();
        adapter = new MenuAdapter(menuItems, this);
        menuRv.setLayoutManager(new LinearLayoutManager(this));
        menuRv.setAdapter(adapter);


    }

    void setWorkFragment(){
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new WorkFragment()).commit();
    }
    void setTestimonialFragment(){
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new TestimonialFragment()).commit();
    }
    void setHomeFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new HomeFragment()).commit();
    }
    void setEducationFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new EduFragment()).commit();
    }
    void setContactFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new ContactFragment()).commit();
    }

    public void openLinkedIn(View view) {
        Uri uri = Uri.parse("http://linkedin.com/in/cmulay17");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void openGithub(View view) {
        Uri uri = Uri.parse("http://github.com/cmulay");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    @Override
    public void onSideMenuItemClick(int i) {
        switch (menuItems.get(i).getCode()) {
            case MenuUtil.HOME_FRAGMENT_CODE : setHomeFragment();
                break;
            case MenuUtil.EDUCATION_FRAGMENT_CODE : setEducationFragment();
                break;
            case MenuUtil.WORK_FRAGMENT_CODE: setWorkFragment();
                break;
            case MenuUtil.TESTIMONIAL_FRAGMENT_CODE: setTestimonialFragment();
                break;
            case MenuUtil.CONTACT_FRAGMENT_CODE: setContactFragment();
                break;
            default: setHomeFragment();
        }

        menuItems.get(selectedMenuPos).setSelected(false);
        menuItems.get(i).setSelected(true);
        selectedMenuPos = i;
        adapter.notifyDataSetChanged();

    }
}