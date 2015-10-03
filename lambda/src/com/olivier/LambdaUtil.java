package com.olivier;

public class LambdaUtil {
	public PasswordEncoder makeBadEncoder(){
		return(password,salt)-> password.toUpperCase();
	}
	public void doSomething(PasswordEncoder encoder){
		String salt = encoder.encode("abc","123");
	}
}
