package com.olivier;

@FunctionalInterface
public interface PasswordEncoder {
	public String encode(String password, String salt);
}


