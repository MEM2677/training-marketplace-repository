package es.everis.entando.plugins.jpsatoshi;

import es.everis.entando.plugins.jpsatoshi.aps.TestApsSample;
import es.everis.entando.plugins.jpsatoshi.apsadmin.TestApsAdminSample;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {
	
	public static Test suite() {
		TestSuite suite = new TestSuite("Change me with a suitable description");

		suite.addTestSuite(TestApsSample.class);
		suite.addTestSuite(TestApsAdminSample.class);
		
		return suite;
	}
	
}
