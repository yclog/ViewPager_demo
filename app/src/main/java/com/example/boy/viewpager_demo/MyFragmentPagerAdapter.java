package com.example.boy.viewpager_demo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;

import java.util.List;

public class MyFragmentPagerAdapter extends FragmentStatePagerAdapter {

	private List<Fragment> fragList;
	public MyFragmentPagerAdapter(FragmentManager fm, List<Fragment> fragList) {
		super(fm);
		// TODO Auto-generated constructor stub
		this.fragList=fragList;
	}

	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		return fragList.get(arg0);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return fragList.size();
	}
	
	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		// TODO Auto-generated method stub
		super.destroyItem(container, position, object);
	}
	
	@Override
	public Object instantiateItem(ViewGroup arg0, int arg1) {
		// TODO Auto-generated method stub
		return super.instantiateItem(arg0, arg1);
	}

}
