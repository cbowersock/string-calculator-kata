package com.techelevator;

import org.junit.*;

public class KataStringCalculatorTest {
	
	private KataStringCalculator target;
	
	@Before
	public void setup() {
		target = new KataStringCalculator();
	}
	
	@Test
	public void empty_string_returns_zero() {
		Assert.assertEquals(0, target.add(""));
	}
	
	@Test
	public void number_returns_that_int() {
		Assert.assertEquals(1, target.add("1"));
		Assert.assertEquals(2, target.add("2"));
		Assert.assertEquals(3, target.add("3"));
	}
	
	@Test
	public void two_numbers_returns_sum() {
		Assert.assertEquals(3, target.add("1,2"));
		Assert.assertEquals(27, target.add("12,15"));
	}
	
	@Test
	public void any_numbers_returns_sum() {
		Assert.assertEquals(300, target.add("100,100,100"));
		Assert.assertEquals(178, target.add("12,15,30,52,68,1"));
	}
	
	@Test
	public void any_numbers_with_new_lines_returns_sum() {
		Assert.assertEquals(10, target.add("5\n3,2"));
		Assert.assertEquals(14, target.add("3\n5\n2,4"));
	}
	
	@Test
	public void specified_delimeter_returns_sum() {
		Assert.assertEquals(16, target.add("3\n5\n2,6"));
		Assert.assertEquals(17, target.add("3,5,9"));
		Assert.assertEquals(3, target.add("//;\n1;2"));
		Assert.assertEquals(13, target.add("//!\n4!9"));
		Assert.assertEquals(47, target.add("//!\n4!9!11!23"));
	}
	


}
