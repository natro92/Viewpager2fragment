package com.natro92.viewpager2fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    TextView bottom_textview_a,bottom_textview_b,bottom_textview_c,bottom_textview_d,bottom_textview_e,bottom_textview_f;
    LinearLayout bottom_linearlayout_a,bottom_linearlayout_b,bottom_linearlayout_c,bottom_linearlayout_d,bottom_linearlayout_e,bottom_linearlayout_f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ViewPager2 gameinterface_viewpager_viewpage = findViewById(R.id.activity_main_viewpager2_viewpage);
        List<Fragment> mFragments = new ArrayList<>();
        mFragments.add(new com.natro92.viewpager2fragment.Fragment1());
        mFragments.add(new com.natro92.viewpager2fragment.Fragment2());
        mFragments.add(new com.natro92.viewpager2fragment.Fragment3());
        mFragments.add(new com.natro92.viewpager2fragment.Fragment4());
        mFragments.add(new com.natro92.viewpager2fragment.Fragment5());
        mFragments.add(new com.natro92.viewpager2fragment.Fragment6());
        MyFragmentPagerAdapter mAdapter = new MyFragmentPagerAdapter(this, mFragments);
        gameinterface_viewpager_viewpage.setAdapter(mAdapter);
        gameinterface_viewpager_viewpage.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                bottom_textview_a=(TextView)findViewById(R.id.bottom_textview_a);
                bottom_textview_b=(TextView)findViewById(R.id.bottom_textview_b);
                bottom_textview_c=(TextView)findViewById(R.id.bottom_textview_c);
                bottom_textview_d=(TextView)findViewById(R.id.bottom_textview_d);
                bottom_textview_e=(TextView)findViewById(R.id.bottom_textview_e);
                bottom_textview_f=(TextView)findViewById(R.id.bottom_textview_f);

                bottom_textview_a.setTextColor(Color.BLACK);
                bottom_textview_b.setTextColor(Color.BLACK);
                bottom_textview_c.setTextColor(Color.BLACK);
                bottom_textview_d.setTextColor(Color.BLACK);
                bottom_textview_e.setTextColor(Color.BLACK);
                bottom_textview_f.setTextColor(Color.BLACK);

                switch (position){
                    case 0:
                        bottom_textview_a.setTextColor(Color.rgb(51,153,0));
                        break;
                    case 1:
                        bottom_textview_b.setTextColor(Color.rgb(51,153,0));
                        break;
                    case 2:
                        bottom_textview_c.setTextColor(Color.rgb(51,153,0));
                        break;
                    case 3:
                        bottom_textview_d.setTextColor(Color.rgb(51,153,0));
                        break;
                    case 4:
                        bottom_textview_e.setTextColor(Color.rgb(51,153,0));
                        break;
                    case 5:
                        bottom_textview_f.setTextColor(Color.rgb(51,153,0));
                        break;
                }
                //TODO 测试 以及补全手机上没写的代码
                gameinterface_viewpager_viewpage.setCurrentItem(position);
                LinearLayout bottom_linearlayout_a = (LinearLayout)findViewById(R.id.bottom_linearlayout_a);
                LinearLayout bottom_linearlayout_b = (LinearLayout)findViewById(R.id.bottom_linearlayout_b);
                LinearLayout bottom_linearlayout_c = (LinearLayout)findViewById(R.id.bottom_linearlayout_c);
                LinearLayout bottom_linearlayout_d = (LinearLayout)findViewById(R.id.bottom_linearlayout_d);
                LinearLayout bottom_linearlayout_e = (LinearLayout)findViewById(R.id.bottom_linearlayout_e);
                LinearLayout bottom_linearlayout_f = (LinearLayout)findViewById(R.id.bottom_linearlayout_f);
                bottom_linearlayout_a.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        gameinterface_viewpager_viewpage.setCurrentItem(Integer.parseInt(String.valueOf(view.getTag())));
                    }
                });
                bottom_linearlayout_b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        gameinterface_viewpager_viewpage.setCurrentItem(Integer.parseInt(String.valueOf(view.getTag())));
                    }
                });
                bottom_linearlayout_c.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        gameinterface_viewpager_viewpage.setCurrentItem(Integer.parseInt(String.valueOf(view.getTag())));
                    }
                });
                bottom_linearlayout_d.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        gameinterface_viewpager_viewpage.setCurrentItem(Integer.parseInt(String.valueOf(view.getTag())));
                    }
                });
                bottom_linearlayout_e.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        gameinterface_viewpager_viewpage.setCurrentItem(Integer.parseInt(String.valueOf(view.getTag())));
                    }
                });
                bottom_linearlayout_f.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        gameinterface_viewpager_viewpage.setCurrentItem(Integer.parseInt(String.valueOf(view.getTag())));
                    }
                });
            }
        });
    }
}