package de.jexam.headless.application;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

public class Application implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello this is a headless application");
		return null;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
