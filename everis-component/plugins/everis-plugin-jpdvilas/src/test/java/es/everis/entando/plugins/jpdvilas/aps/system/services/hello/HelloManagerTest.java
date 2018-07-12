package es.everis.entando.plugins.jpdvilas.aps.system.services.hello;

import es.everis.entando.plugins.jpdvilas.aps.ApsPluginBaseTestCase;

public class HelloManagerTest extends ApsPluginBaseTestCase {

    protected IHelloManager _helloManager;
    protected void setUp() throws Exception {
        super.setUp();
        this.init();
    }

    public void testStart(){
        assertTrue(true);
    }

    private void init() throws Exception {
        try {
            _helloManager = (IHelloManager) this.getService("jpDvilasHelloManager");
        } catch (Throwable e) {
            throw new Exception(e);
        }
    }
}
