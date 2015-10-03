package com.olivier.mapfilterreduce;

public class MapImp<T,V> implements Mapper<T,V>{

	@Override
	public V map(T t) {
		// TODO Auto-generated method stub
		return null;
	}
	
	Mapper<Person, Integer> mapper = new MapImp<Person,Integer>(){
		public Integer map(Person p){
			return p.getAge();
		}
	};
}
