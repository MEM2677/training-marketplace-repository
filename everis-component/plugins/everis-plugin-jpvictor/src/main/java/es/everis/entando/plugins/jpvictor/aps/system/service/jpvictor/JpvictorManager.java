package es.everis.entando.plugins.jpvictor.aps.system.service.jpvictor;

import com.agiletec.aps.system.common.AbstractService;

public class JpvictorManager extends AbstractService implements IJpvictorManager {

	private static final long serialVersionUID = -2750732993453226841L;

	@Override
	public void init() throws Exception {
		System.out.println("JpvictorManager inited!");
	
	}
}
