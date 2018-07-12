package es.everis.entando.plugins.jpdvilas.aps.system.services.hello;

import com.agiletec.aps.system.common.AbstractService;

public class HelloManager  extends AbstractService implements IHelloManager
{
    @Override
    public void init() throws Exception {
        System.out.println("Hello from JpDvilas HelloManager");
    }
}
