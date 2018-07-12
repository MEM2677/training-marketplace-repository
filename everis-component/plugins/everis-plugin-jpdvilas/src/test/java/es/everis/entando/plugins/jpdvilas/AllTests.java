package es.everis.entando.plugins.jpdvilas;

import es.everis.entando.plugins.jpdvilas.aps.TestApsSample;
import es.everis.entando.plugins.jpdvilas.aps.system.services.hello.HelloManagerTest;
import es.everis.entando.plugins.jpdvilas.apsadmin.TestApsAdminSample;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {
	
	public static Test suite() {
		TestSuite suite = new TestSuite("Change me with a suitable description");

		suite.addTestSuite(TestApsSample.class);
		suite.addTestSuite(TestApsAdminSample.class);
		suite.addTestSuite(HelloManagerTest.class);
		return suite;
	}
	
}
