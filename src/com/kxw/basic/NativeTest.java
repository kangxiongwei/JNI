package com.kxw.basic;

import org.junit.Test;

import com.kxw.model.Employee;

/**
 * 测试JNI程序
 * @author kangxiongwei
 * @date 2015年9月9日
 */
public class NativeTest {

	@Test
	public void testHelloNative()
	{
		HelloNative.greeting();
	}
	
	@Test
	public void testPrintf01()
	{
		int count = Printf01.print(8, 4, 3.14);
		count += Printf01.print(8, 4, count);
		System.out.println();
		for(int i=0; i<count; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	@Test
	public void testPrintf02(){
		String str = Printf02.getString();
		System.out.println(str);
	}
	
	/**
	 * 通过JNI访问Java类的属性值，并设值
	 */
	@Test
	public void testEmpSalary(){
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Harry Hacker", 35000);
		staff[1] = new Employee("Carl Cracker", 75000);
		staff[2] = new Employee("Tony Tester", 38000);
		
		for(Employee e: staff) {
			e.raiseSalary(5);
		}
		for(Employee e: staff) {
			System.out.println(e);
		}
		
	}
}
