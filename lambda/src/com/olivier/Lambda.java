package com.olivier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lambda {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integers = Arrays.asList(1,2,3,4,5);
		Consumer<Integer> consumer = x -> System.out.println(x);
		integers.forEach(consumer);
		
		PasswordEncoder encoder = makeBadEncoder();
		doSomething(encoder);
	}

	public static PasswordEncoder makeBadEncoder(){
		return(password,salt)-> password.toUpperCase();
	}
	public static void doSomething(PasswordEncoder encoder){
		String salt = encoder.encode("abc","123");
	}

}
