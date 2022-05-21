package week5.day1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Assignment2 {
	
	@Test(priority = 1)
	public void a() {
		System.out.println("Test1");
	}
	
	@Test(enabled = false)
	public void b() {
		System.out.println("Test2");
	}
	
	@Test@Ignore
	public void c() {
		System.out.println("Test3");
	}
	@Test
	public void d() {
		System.out.println("Test4");
	}
	@Test(priority = -1)
	public void e() {
		System.out.println("Test5");
	}
	@Test(invocationCount=5,invocationTimeOut=5000)
	public void f() {
		System.out.println("Test6");
	}
	@Test(invocationCount=5,invocationTimeOut=5000,threadPoolSize=2)
	public void g() {
		System.out.println("Test7");
	}
	

}
