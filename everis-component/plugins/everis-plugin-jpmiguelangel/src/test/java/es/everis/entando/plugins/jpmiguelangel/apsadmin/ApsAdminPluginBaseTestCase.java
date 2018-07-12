package es.everis.entando.plugins.jpmiguelangel.apsadmin;

import com.agiletec.ConfigTestUtils;
import com.agiletec.apsadmin.ApsAdminBaseTestCase;
import es.everis.entando.plugins.jpmiguelangel.PluginConfigTestUtils;

public class ApsAdminPluginBaseTestCase extends ApsAdminBaseTestCase {
	
	@Override
	protected ConfigTestUtils getConfigUtils() {
		return new PluginConfigTestUtils();
	}
	
}
