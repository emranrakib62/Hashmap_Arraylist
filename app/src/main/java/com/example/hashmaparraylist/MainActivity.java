package com.example.hashmaparraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ListView listView;
ArrayList<HashMap<String, String> > arrayList=new ArrayList<>();
HashMap<String, String>hashMap;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);

        hashMap =new HashMap<>();
        hashMap.put("name","Emranul Hoque");
        hashMap.put("mobile","01862240062");
        hashMap.put("email","emran@gmail.com");
        arrayList.add(hashMap);


        hashMap =new HashMap<>();
        hashMap.put("name","Swapon hossain");
        hashMap.put("mobile","01862240963");
        hashMap.put("email","sopon@gmail.com");
        arrayList.add(hashMap);

        hashMap =new HashMap<>();
        hashMap.put("name","Rudro Mondol");
        hashMap.put("mobile","01862240745");
        hashMap.put("email","rudro@gmail.com");
        arrayList.add(hashMap);

        hashMap =new HashMap<>();
        hashMap.put("name","Tanim");
        hashMap.put("mobile","0186220123");
        hashMap.put("email","tanim@gmail.com");
        arrayList.add(hashMap);



        Myadapter myadapter = new Myadapter();
        listView.setAdapter(myadapter);

    }

    private class Myadapter extends BaseAdapter {


        public android.view.ViewGroup ViewGroup;
        LayoutInflater layoutInflater;

        //...................................................................//
        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }


        public View getView(int position, View view, ViewGroup viewGroup) {

            layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View myview = layoutInflater.inflate(R.layout.item, viewGroup, false);


            ImageView imageView=myview.findViewById(R.id.imageView);
            TextView textname=myview.findViewById(R.id.textname);
            TextView textmobile=myview.findViewById(R.id.textmobile);
            TextView textemail=myview.findViewById(R.id.textemail);




             HashMap<String,String> hashMap=arrayList.get(position);
             String myname=hashMap.get("name");
            textname.setText(myname);
            String mynum=hashMap.get("mobile");
            textmobile.setText(mynum);

            String myemail=hashMap.get("email");
            textname.setText(myemail);

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "hello this is.."+myname, Toast.LENGTH_SHORT).show();
                }
            });

            return myview;

        }
    }
}