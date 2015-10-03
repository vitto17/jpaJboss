package com.olivier.singleton;

class D3{
	public static void main(String[] args) {
		D2[] a1 = new D2[1];
		D2[][] a2 = new D2[2][];
		D2[][][] a3 = new D2[3][][];
		a1[0]=new D2();
		a2[0]=a2[1]=a1;
		a3[0]=a3[1]=a3[2]=a2;
		System.out.println(a3[2][1][0]);
		
		int i = 0;
		int j = 9;
		while(i++<=j--){
			i++;
			if(j<5)break;
		}
		System.out.println(i+","+j);
	}
}

