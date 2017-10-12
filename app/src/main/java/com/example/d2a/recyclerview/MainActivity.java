package com.example.d2a.recyclerview;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {


    RecyclerView r1;
    String s1[],s2[];
    int imageResource[] = {R.drawable.college_icon,R.drawable.college_icon,R.drawable.college_icon,R.drawable.college_icon,R.drawable.college_icon,R.drawable.college_icon};

    MyAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1=(RecyclerView)findViewById(R.id.listMhs);

        s1 = getResources().getStringArray(R.array.nimMhs);
        s2 = getResources().getStringArray(R.array.detailMhs);

        ad = new MyAdapter(this,s1,s2,imageResource);

        r1.setAdapter(ad);
        r1.setLayoutManager(new LinearLayoutManager(this));
    }
}
