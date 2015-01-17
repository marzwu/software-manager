package com.marz.softwaremanager.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Window {
	public void start() {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("hello world");
		shell.open();

		Button btn = new Button(shell, SWT.PUSH);
		btn.setText("btn");
		btn.setSize(60, 32);
		btn.setLocation(100, 100);
		btn.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("btn clicked");
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("default handler");
			}
		});
		
		while(!shell.isDisposed()){
			if(display.readAndDispatch() == false){
				display.sleep();
			}
		}
		shell.dispose();
	}
}
