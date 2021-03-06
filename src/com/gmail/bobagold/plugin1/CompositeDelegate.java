package com.gmail.bobagold.plugin1;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;


public class CompositeDelegate implements ILaunchConfigurationDelegate{

	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		// TODO Auto-generated method stub
		System.out.println("Launch");
		for (String lc_name : CompositeTab.unserializeLC(configuration)) {
			System.out.println(lc_name);
			ILaunchConfiguration lc = CompositeTab.getLC(lc_name);
			if (lc != null) lc.launch(mode, monitor);
		}
	}

}
