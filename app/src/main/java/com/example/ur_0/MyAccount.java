package com.example.ur_0;

import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.action;
import static android.R.attr.data;

public class MyAccount extends AppCompatActivity {

    private List<InfoArticle> adapterlist = new ArrayList<>();//这个是用于存储我们每个list的类的名字，虽然我们这里只用到了名字，事实上这代表了一个类，而且这里在创建的时候就已经说明了他们都是InfoArticle的实例。
    private DrawerLayout mDrawerlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mDrawerlayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null){
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setHomeAsUpIndicator(R.drawable.sidebar);
        }

        initArticles();
        InfoAdapter adapter = new InfoAdapter(MyAccount.this,R.layout.potrait_infor,adapterlist);
        ListView listView = (ListView)findViewById(R.id.info_area);//这里指定了具体的将adapter运用到哪个list上面
        listView.setAdapter(adapter);
    }

    private void initArticles(){ //这个是给listView的方法
        for(int i = 0;i<1;i++){
            InfoArticle name = new InfoArticle("First Name");
            adapterlist.add(name);
            InfoArticle name1 = new InfoArticle("Last Name");
            adapterlist.add(name1);
            InfoArticle name2 = new InfoArticle("Email");
            adapterlist.add(name2);
            InfoArticle name3 = new InfoArticle("Telephone No.");
            adapterlist.add(name3);
            InfoArticle name4 = new InfoArticle("School/Faculty");
            adapterlist.add(name4);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { //让导航按钮可以使用
        switch (item.getItemId()){
            case android.R.id.home:
                mDrawerlayout.openDrawer(GravityCompat.START);
                break;
            default:
        }
        return true;
    }
}