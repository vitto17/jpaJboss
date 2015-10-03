package com.olivier.singleton;

import java.util.List;

public class SingletonStatic {
	private static SingletonStatic instance=new SingletonStatic();
	private List maList;
	private Boolean etat;
	int a = 0;
	
	private SingletonStatic(){
		a++;
		System.out.println("a vaut : "+a);
	}
	
	public static SingletonStatic getInstance(){
		return instance;
	}
}
