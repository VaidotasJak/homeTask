package com.automationframe.Runner;

import org.junit.platform.engine.DiscoverySelector;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;

import com.automationframe.test.MyAccountPageTests;

public class RunJUnit5TestsFromJava {

	SummaryGeneratingListener listener = new SummaryGeneratingListener();

	public void runOneClass() {
		LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
				.selectors(selectClass(MyAccountPageTests.class)).build();
		Launcher launcher = LauncherFactory.create();
		launcher.registerTestExecutionListeners(listener);
		launcher.execute(request);
	}

	private DiscoverySelector selectClass(Class<MyAccountPageTests> class1) {
		return null;
	}
}
