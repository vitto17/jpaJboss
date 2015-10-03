package com.olivier.singleton;

public class SingletonHolder {
	private SingletonHolder(){
		
	}
	private static class SingletonHolderInterne{
		private final static SingletonHolderInterne instance=new SingletonHolderInterne();
	}
	
	public static SingletonHolderInterne getInstance(){
		return SingletonHolderInterne.instance;	
	}
}
