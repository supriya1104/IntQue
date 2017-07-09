package com.interview.que;

import java.util.ArrayList;
import java.util.List;

public class HashMapI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapI hm = new HashMapI();
		hm.put("101", "hash");
		hm.put("202", "map");
		hm.put("303", "imp");
		System.out.println(hm.get("101"));
		hm.put("303", "value");

		System.out.println(hm.get("102"));
		System.out.println(hm.get("303"));
		System.out.println(hm.get("1"));
	}

	private MapI m;
	private List<MapI> mapList;

	public HashMapI() {

		this.mapList = new ArrayList<MapI>();
	}

	
	//method to implement inserting values into the HashMap
	public void put(Object k, Object v) {
		this.m = new MapI();
		m.insert(k, v);
		for (int i = 0; i < mapList.size(); i++) {
			MapI c1 = mapList.get(i);
			// checking for the unique key
			if (c1.key.equals(k)) {
				mapList.remove(i);
				break;
			}
		}
		mapList.add(m);
	}

	public Object get(Object k) {
		for (int i = 0; i < this.mapList.size(); i++) {
			MapI g = mapList.get(i);
			if (k.toString() == g.key.toString()) {
				return g.value;
			}

		}
		return null;
	}

}

class MapI {
	Object key;
	Object value;

	public void insert(Object k, Object v) {
		this.key = k;
		this.value = v;
	}
}