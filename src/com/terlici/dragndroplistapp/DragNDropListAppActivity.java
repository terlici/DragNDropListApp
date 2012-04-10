package com.terlici.dragndroplistapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.terlici.dragndroplist.DragNDropListView;
import com.terlici.dragndroplist.DragNDropSimpleAdapter;

import android.app.Activity;
import android.os.Bundle;

public class DragNDropListAppActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testdragndroplist);
        
        ArrayList<Map<String, Object>> items = new ArrayList<Map<String, Object>>();
		for(int i = 0; i < 10; ++i) {
			HashMap<String, Object> item = new HashMap<String, Object>();
			item.put("name", "item" + i);
			item.put("_id", i);
			
			items.add(item);
		}
		
		DragNDropListView list = (DragNDropListView)findViewById(R.id.list1);
		list.setDragNDropAdapter(new DragNDropSimpleAdapter(this,
				 items,
				 R.layout.testitem,
				 new String[]{"name"},
				 new int[]{R.id.text},
				 R.id.handler));
    }
}