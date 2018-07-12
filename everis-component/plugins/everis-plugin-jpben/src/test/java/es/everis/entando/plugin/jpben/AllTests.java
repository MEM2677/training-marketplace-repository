package es.everis.entando.plugin.jpben;

import es.everis.entando.plugin.jpben.aps.TestApsSample;
import es.everis.entando.plugin.jpben.apsadmin.TestApsAdminSample;

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