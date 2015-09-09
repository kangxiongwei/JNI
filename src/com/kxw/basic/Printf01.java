package com.kxw.basic;

/**
 * 参数问题
 * @author kangxiongwei
 * @date 2015年9月9日
 */
public class Printf01 {

	static {
		System.loadLibrary("Printf01");
	}
	
	public static native int print(int width,int precision,double x);
	
}
