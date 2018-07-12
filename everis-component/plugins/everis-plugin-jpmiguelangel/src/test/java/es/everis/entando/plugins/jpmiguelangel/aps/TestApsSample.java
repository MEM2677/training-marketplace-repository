package es.everis.entando.plugins.jpmiguelangel.aps;

import es.everis.entando.plugins.jpmiguelangel.aps.system.services.hello.IHelloManager;

public class TestApsSample extends ApsPluginBaseTestCase {
	
	private IHelloManager manager;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.init();
	}
	
	public void test() {
		assertTrue(true);
	}
	
	private void init() throws Exception {
    	try {
    		manager = (IHelloManager) this.getService("jpmiguelangelManager");
    		// init services
		} catch (Exception e) {
			throw e;
		}
    }
	
}
