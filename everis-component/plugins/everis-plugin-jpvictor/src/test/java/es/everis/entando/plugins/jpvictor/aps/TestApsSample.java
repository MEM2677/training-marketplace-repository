package es.everis.entando.plugins.jpvictor.aps;

import es.everis.entando.plugins.jpvictor.aps.system.service.jpvictor.IJpvictorManager;

public class TestApsSample extends ApsPluginBaseTestCase {
	
	private IJpvictorManager contentManager ;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.init();
	}
	
	public void test() {
		assertNotNull(contentManager);
	}
	
	private void init() throws Exception {
    	try {
    		contentManager = (IJpvictorManager) this.getService("jpvictorManager");
		} catch (Exception e) {
			throw e;
		}
    }
	
}
