package com.olivier.singleton;

public class ThreadLocalSingleton {
	private static ThreadLocal<Boolean> initHolder=new ThreadLocal<Boolean>();
	private static ThreadLocalSingleton instance = null;
	
	public static ThreadLocalSingleton getInstance(){
		if(initHolder.get()==null){
			synchronized(ThreadLocalSingleton.class){
				if(instance==null){
					instance=new ThreadLocalSingleton();
				}
				initHolder.set(Boolean.TRUE);
			}
		}
		return instance;
	}
}
