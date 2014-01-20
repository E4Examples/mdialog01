/*******************************************************************************
 * Copyright (c) 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Lars Vogel <lars.Vogel@gmail.com> - Bug 419770
 *******************************************************************************/
package mdialog01.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MDialog;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.swt.widgets.Shell;

public class OpenHandler {

	@Execute
	public void execute(Shell shell, MWindow window, EModelService ms /*@Named("mdialog01.dialog.0") MDialog dialog*/) {

		MDialog dialog = (MDialog) ms.find("mdialog01.dialog.0", window);
		dialog.setToBeRendered(true);
		dialog.setToBeRendered(false);
	}
}
