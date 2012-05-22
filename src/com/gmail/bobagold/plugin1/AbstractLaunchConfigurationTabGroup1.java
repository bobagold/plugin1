package com.gmail.bobagold.plugin1;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
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
		CommonTab commonTab = new CommonTab();
		CompositeTab compositeTab = new CompositeTab();
		ILaunchConfigurationTab[] tabs = {commonTab, compositeTab};
		setTabs(tabs);
	}

}
