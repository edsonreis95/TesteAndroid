package com.example.edson.testeandroid.base;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.example.edson.testeandroid.R;
import com.example.edson.testeandroid.contact.ContactFragment;
import com.example.edson.testeandroid.investiment.InvestimentFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @BindView(R.id.tabLayout)
    protected TabLayout tabLayout;
    @BindView(R.id.viewPager)
    protected ViewPager viewPager;
    @BindView(R.id.toolbar)
    protected Toolbar toolbar;
    @BindView(R.id.tvTitleToolbar)
    protected TextView tvTitleToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        setupToolbar();
        setupTabLayout();
        setupViewPager();
    }

    public void setupToolbar() {
        tvTitleToolbar.setText("");
    }

    public void setupViewPager() {
        Fragment contactFragment = new ContactFragment();
        Fragment investimentFragment =  new InvestimentFragment();
        final PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), this);

        adapter.addFragment(investimentFragment, "Investimento");
        adapter.addFragment(contactFragment, "Contato");


        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                tvTitleToolbar.setText(adapter.getPageTitle(position));
            }

            @Override
            public void onPageSelected(int position) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }

    public void setupTabLayout() {
        tabLayout.addTab(tabLayout.newTab().setText("Investimento"));
        tabLayout.addTab(tabLayout.newTab().setText("Contato"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(viewPager);
    }
}
