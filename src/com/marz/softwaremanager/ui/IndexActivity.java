package com.marz.softwaremanager.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class IndexActivity {

	private Composite parent;

	public IndexActivity(Composite parent) {
		this.parent = parent;
		init();
	}

	private void init() {
		Text text = new Text(parent, SWT.SINGLE | SWT.LEAD | SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		text.setText("hello world");
		text.setSize(200, 40);
		Point parentSize = parent.getSize();
		Point currentSize = text.getSize();
		text.setLocation((parentSize.x - currentSize.x) >> 1,
				(parentSize.y - currentSize.x) >> 1);

		//
		Button button = new Button(parent, SWT.PUSH);
		button.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false,
				false));
		button.setText("搜索");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

			}
		});
		button.setSize(60, 32);
		button.setLocation((parentSize.x >> 1) - button.getSize().x - 4,
				text.getLocation().y + text.getSize().y + 4);

		//
		Button luckyBtn = new Button(parent, SWT.PUSH);
		luckyBtn.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false,
				false));
		luckyBtn.setText("碰碰运气");
		luckyBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		luckyBtn.setSize(100, 32);
		luckyBtn.setLocation((parentSize.x >> 1)  + 4,
				text.getLocation().y + text.getSize().y + 4);
	}

}
