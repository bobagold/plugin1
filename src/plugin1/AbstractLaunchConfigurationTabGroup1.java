package plugin1;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class AbstractLaunchConfigurationTabGroup1 extends
		AbstractLaunchConfigurationTabGroup {

	public AbstractLaunchConfigurationTabGroup1() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		// TODO Auto-generated method stub
		ILaunchConfigurationTab[] tabs = {new CommonTab()};
		setTabs(tabs);
	}

}
