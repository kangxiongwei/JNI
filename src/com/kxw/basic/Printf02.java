package com.kxw.basic;

public class Printf02 {
	
	static {
		System.loadLibrary("Printf02");
	}
	
	//通过JNI得到一个返回的字符串
	public static native String getString();
	
}
