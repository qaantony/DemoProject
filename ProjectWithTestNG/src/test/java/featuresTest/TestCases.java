package featuresTest;

import module.Features;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TestCases {
	Features fs=new Features();
	@Test
	public void testAdd() {		
		int result=	fs.add();
		System.out.println(result);
		Assert.assertEquals(result, 30);		
	}
	
	@Test
	public void testSub() {
		int result=	fs.sub();
		System.out.println(result);
		Assert.assertEquals(result, -10);		
	}
	
	
	@Test
	public void testMul() {
		int result=	fs.mul();
		System.out.println(result);
		Assert.assertEquals(result, 200);	
	}
	
	@Test
	public void testDiv() {
		int result=	fs.div();
		System.out.println(result);
		Assert.assertEquals(result, 5);		
	}
	
}
