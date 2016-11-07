package com.example.user085.listview_test;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lvspot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Spot> spolist = getSpolist();
        lvspot = (ListView)findViewById(R.id.lvspot);
        lvspot.setAdapter(new SpotAdapter(this, spolist));
    }



    private List<Spot> getSpolist(){
        List<Spot> spotlist=new ArrayList<>();
        spotlist.add(new Spot(R.drawable.taipei_101,"taipei101","01232456789"));
        spotlist.add(new Spot(R.drawable.us_map,"us","026564689"));
        spotlist.add(new Spot(R.drawable.chian_kai_shek,"cjian","03232456789"));
        return spotlist;
    }

    private class SpotAdapter extends BaseAdapter {
        Context context;
        List<Spot> spotList;
        public SpotAdapter( Context context, List<Spot> spotList ) {

            this.context = context;
            this.spotList=spotList;
        }

        @Override
        public int getCount() {
            return spotList.size();
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
        public View getView(int position, View convertView, ViewGroup parent) {
            Spot spot = spotList.get(position);
            LayoutInflater laoutInflater = LayoutInflater.from(context);
            View itemView = laoutInflater.inflate(R.layout.item_view,parent,false);

           // 3個 放到UI的 還沒做
            ImageView ivSpot = (ImageView) itemView.findViewById(R.id.ivspot);
            ivSpot.setImageResource(spot.getImageID());

            TextView tvSpot = (TextView) itemView.findViewById(R.id.tvspot);
            tvSpot.setText(spot.getName());

            TextView tvPhone = (TextView) itemView.findViewById(R.id.tvphone);
            tvPhone.setText(spot.getPhone());

            return itemView;
        }
    }
}
