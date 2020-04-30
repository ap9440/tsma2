package com.tsma.worstone.tsma;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rview = findViewById(R.id.rview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        rview.setLayoutManager(layoutManager);

        List<card> list = new ArrayList<>();
        list.add(new card("FACEBOOK", R.drawable.ic1, R.drawable.b1));
        list.add(new card("HIKE", R.drawable.ic2, R.drawable.b2));
        list.add(new card("INSTAGRAM", R.drawable.ic3, R.drawable.b3));
        list.add(new card("MESSENGER", R.drawable.ic4, R.drawable.b4));
        list.add(new card("WHATSAPP", R.drawable.ic5, R.drawable.b5));
        list.add(new card("SNAPCHAT", R.drawable.ic6, R.drawable.b6));
        list.add(new card("TWITTER", R.drawable.ic7, R.drawable.b7));
        list.add(new card("HANGOUTS", R.drawable.ic8, R.drawable.b8));
        list.add(new card("TELEGRAM", R.drawable.ic9, R.drawable.b9));
        list.add(new card("KIK", R.drawable.ic10, R.drawable.b10));

        Adptr adapter = (Adptr) new Adptr(list,this);
        rview.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
         MenuInflater menuInflater=getMenuInflater();
         menuInflater.inflate(R.menu.option_menu,menu);
         return true;
    }

    private void shareIt(){
        Intent i = new Intent();
        i.setAction(Intent.ACTION_SEND);
        i.putExtra(Intent.EXTRA_SUBJECT,"The Social Media App");
        getIntent().putExtra(Intent.EXTRA_TEXT,"Download this app from https://play.google.com/store/apps/details?id=com.tsma.worstone.tsma");
        i.setType("text/plain");
        startActivity(i);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this,item.getTitle(),Toast.LENGTH_LONG).show();
        switch (item.getItemId()){
            case R.id.share:
                shareIt();
                break;
            case R.id.feedback:
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.tsma.worstone.tsma"));
                startActivity(i);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}


