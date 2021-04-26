package com.oracle.main;

import org.junit.runner.RunWith;

import com.oracle.util.UtilClass;

public class MainClassTest {

	MainClass mainObj = new MainClass();
	
	@Test
	public void test() {
		mainObj.getRequiredInfo(UtilClass.getInputList("C:\\Users\\HI\\Desktop\\JAVA Coding\\OracleCodingChallenge\\resources\\input.txt"));
	}
}
