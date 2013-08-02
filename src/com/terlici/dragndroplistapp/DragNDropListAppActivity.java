/*
 * Copyright 2012 Terlici Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
		for(int i = 0; i < 30; ++i) {
			HashMap<String, Object> item = new HashMap<String, Object>();
			item.put("name", "item" + i);
			item.put("_id", i);
			
			items.add(item);
		}
		
		DragNDropListView list = (DragNDropListView)findViewById(R.id.list1);
		list.addFooterView(getLayoutInflater().inflate(R.layout.footer, null));
		list.setDragNDropAdapter(new DragNDropSimpleAdapter(this,
				 items,
				 R.layout.testitem,
				 new String[]{"name"},
				 new int[]{R.id.text},
				 R.id.handler));
    }
}
