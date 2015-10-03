package com.olivier;

@FunctionalInterface
public interface Consumer<T> {
	public void accept(T t);
}
