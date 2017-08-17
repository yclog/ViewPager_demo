package com.example.boy.viewpager_demo;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, ViewPager.OnPageChangeListener{

    private List<Fragment> fragList;
    private ViewPager pager;
    private RelativeLayout bottom_menu_one_Layout,bottom_menu_two_Layout,bottom_menu_three_Layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init_layout();
        init_fragmentViewpager();
    }

    //设置底部按钮点击事件
    public void init_layout(){
         /*
        * 初始化底部按钮控件所在的布局
        * */
        bottom_menu_one_Layout=(RelativeLayout)findViewById(R.id.bottom_menu_one_Layout);
        bottom_menu_two_Layout=(RelativeLayout)findViewById(R.id.bottom_menu_two_Layout);
        bottom_menu_three_Layout=(RelativeLayout)findViewById(R.id.bottom_menu_three_Layout);
         /*
        * 底部菜单栏设置点击事件
        * */
        bottom_menu_one_Layout.setOnClickListener(this);
        bottom_menu_two_Layout.setOnClickListener(this);
        bottom_menu_three_Layout.setOnClickListener(this);
    }

    //设置点击事件
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bottom_menu_one_Layout:
                pager.setCurrentItem(0);
                break;
            case R.id.bottom_menu_two_Layout:
                pager.setCurrentItem(1);
                break;
            case R.id.bottom_menu_three_Layout:
                pager.setCurrentItem(2);
                break;
        }
    }

    //设置Viewpager
    public void init_fragmentViewpager(){
        /*
        * 初始化viewpager控件
        * */
        pager=(ViewPager) findViewById(R.id.main_viewpager);
        fragList=new ArrayList<Fragment>();
        /*
        * 为fragmentViewpagerList添加fragment
        * */
        fragList.add(new Fragment1());
        fragList.add(new Fragment2());
        fragList.add(new Fragment3());
        /*
        * 添加Viewpager滑动监听事件
        * */
        pager.setOnPageChangeListener(this);
        /*
        * viewapager设置adapter
        * */
        MyFragmentPagerAdapter adapter=new MyFragmentPagerAdapter(getSupportFragmentManager(),fragList);
        pager.setAdapter(adapter);
    }


    //Viewpager重写方法
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        //翻页时事件
    }

    @Override
    public void onPageSelected(int position) {
        //该方法为当前选定页面事件
    }

    @Override
    public void onPageScrollStateChanged(int state) {
        //该方法为翻页状态变化事件
    }
}
