package plugin1;

import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class CompositeTab implements ILaunchConfigurationTab {
	private List control;

	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		control = new List(parent, SWT.SINGLE);
		for (String lc : collectLaunchConfigurations())
			control.add("lc: " + lc);
//		for (String lct : collectLaunchConfigurationTypes())
//			control.add("lct: " + lct);
	}

	private String[] collectLaunchConfigurations() {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		try {
			for (ILaunchConfiguration lc : manager.getLaunchConfigurations())
				if (!lc.getType().getName().equals("Composite"))
					list.add(lc.getName());
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list.toArray(new String[]{});
	}
	private String[] collectLaunchConfigurationTypes() {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		for (ILaunchConfigurationType lc : manager.getLaunchConfigurationTypes())
			list.add(lc.getName());

		return list.toArray(new String[]{});
	}

	@Override
	public Control getControl() {
		// TODO Auto-generated method stub
		return control;
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getErrorMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean canSave() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setLaunchConfigurationDialog(ILaunchConfigurationDialog dialog) {
		// TODO Auto-generated method stub

	}

	@Override
	public void launched(ILaunch launch) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Launch configurations";
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void activated(ILaunchConfigurationWorkingCopy workingCopy) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deactivated(ILaunchConfigurationWorkingCopy workingCopy) {
		// TODO Auto-generated method stub

	}

}
