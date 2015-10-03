package com.olivier.singleton;

public class A {
	private static int f1=1;
	private int f2=2;
	void m1(int p1, final int p2){
		int l1=5;
		final int l2=6;
		Object x = new Object(){
			int a = f1;
			int b = f2;
			int c=p1;
			int d = p2;
			int e = l1;
			int f = l2;
		};
	}
}
