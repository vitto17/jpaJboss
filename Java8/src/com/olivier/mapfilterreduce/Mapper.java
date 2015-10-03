package com.olivier.mapfilterreduce;

public interface Mapper<T, V> {
	public V map(T t);
}
