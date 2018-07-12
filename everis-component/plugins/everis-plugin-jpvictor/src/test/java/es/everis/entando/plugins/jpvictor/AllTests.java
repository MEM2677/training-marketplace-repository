package es.everis.entando.plugins.jpvictor;

import es.everis.entando.plugins.jpvictor.aps.TestApsSample;
import es.everis.entando.plugins.jpvictor.apsadmin.TestApsAdminSample;

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
