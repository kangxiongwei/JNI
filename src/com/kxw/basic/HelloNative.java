package com.kxw.basic;

/**
 * 测试JNI的第一个程序
 * @author kangxiongwei
 * @date 2015年9月8日
 */
public class HelloNative {

	static {
		System.loadLibrary("HelloNative");
	}
	
	public static native void greeting();
	
}
