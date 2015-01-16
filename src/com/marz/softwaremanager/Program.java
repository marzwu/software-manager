package com.marz.softwaremanager;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Program {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("hello world");
		Button btn = new Button(shell, SWT.PUSH);
		btn.setText("btn");
		btn.setSize(60, 32);
		btn.setLocation(100, 100);
		shell.open();
		
		while(!shell.isDisposed()){
			if(display.readAndDispatch() == false){
				display.sleep();
			}
		}
		shell.dispose();
	}

}
