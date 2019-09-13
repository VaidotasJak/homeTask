package com.automationframe.Runner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import com.automationframe.test.Scripts;

public class testRunner {
	
		public static void main(String[] args) {
			JUnitCore junit = new JUnitCore();
			Result result = junit.run(Scripts.class);
			System.out.println(result.getFailureCount());
	}
}
