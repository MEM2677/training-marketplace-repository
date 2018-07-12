package es.everis.entando.plugins.jpmiguelangel.aps.system.services.hello;

import com.agiletec.aps.system.common.AbstractService;
import es.everis.entando.plugins.jpmiguelangel.aps.system.services.hello.IHelloManager;

public class HelloManager extends AbstractService implements IHelloManager {

	@Override
	public void init() throws Exception {
		System.out.println("MAB HelloManager.init");
	}

}
