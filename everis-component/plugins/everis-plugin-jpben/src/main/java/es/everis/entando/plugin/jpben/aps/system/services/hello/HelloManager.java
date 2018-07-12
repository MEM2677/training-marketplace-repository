package es.everis.entando.plugin.jpben.aps.system.services.hello;

import com.agiletec.aps.system.common.AbstractService;

public class HelloManager extends AbstractService implements IHelloManager {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws Exception {
		System.out.println("Hello Service Started\n");
	}

}
