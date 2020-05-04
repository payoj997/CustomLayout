package com.example.prabhin.customlayout;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    //Items to show in list view
    Integer[] images = {R.drawable.imga,R.drawable.imgb,R.drawable.imgc,R.drawable.imgd};
    String[] textImages = {"Medicine","Diabetes","Heart","Blood Pressure"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Call the custom adapter constructor and pass the values you want to be shown in the listview


        listView = (ListView) findViewById(R.id.list_view);
        ListAdapterClass listAdapterClass = new ListAdapterClass();
        listView.setAdapter(listAdapterClass);


    }
    public class ListAdapterClass extends BaseAdapter {
        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }


        @Override
        public View getView(int position, View view, ViewGroup parent) {
            view= getLayoutInflater().inflate(R.layout.listview,null);

            ImageView imageView = (ImageView)view.findViewById(R.id.Image_View);
            TextView textView = (TextView)view.findViewById(R.id.Text_View);


            imageView.setImageResource(images[position]);
            textView.setText(textImages[position]);

            return view;
        }
    }
}
