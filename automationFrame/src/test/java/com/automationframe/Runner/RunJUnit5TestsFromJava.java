package com.automationframe.Runner;

import org.junit.platform.engine.DiscoverySelector;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.TestPlan;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;

import com.automationframe.test.HomePageTest;

public class RunJUnit5TestsFromJava {
	
	SummaryGeneratingListener listener = new SummaryGeneratingListener();
	 
    public void runOne() {
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
          .selectors(selectClass(HomePageTest.class)).build();
        Launcher launcher = LauncherFactory.create();
        TestPlan testPlan = launcher.discover(request);
        launcher.registerTestExecutionListeners(listener);
        launcher.execute(request);
    }
    
//    public void runAll() {
//        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
//          .selectors(selectPackage("com.automationframe.test"))
//          .filters(includeClassNamePatterns(".*Test"))
//          .build();
//        Launcher launcher = LauncherFactory.create();
//        TestPlan testPlan = launcher.discover(request);
//        launcher.registerTestExecutionListeners(listener);
//        launcher.execute(request);
//    }
    
		private DiscoverySelector selectClass(Class<HomePageTest> class1) {
		return null;
	}
}
