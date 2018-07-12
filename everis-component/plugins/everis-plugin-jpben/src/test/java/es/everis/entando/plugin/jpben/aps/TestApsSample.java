package es.everis.entando.plugin.jpben.aps;

import es.everis.entando.plugin.jpben.aps.system.services.hello.IHelloManager;

public class TestApsSample extends ApsPluginBaseTestCase {
	
	private IHelloManager manager;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.init();
	}
	
	public void test() {
		assertNotNull(manager);
	}
	
	private void init() throws Exception {
    	try {
    		this.manager = (IHelloManager) this.getService("everisHelloManager");
		} catch (Exception e) {
			throw e;
		}
    }
	
}
