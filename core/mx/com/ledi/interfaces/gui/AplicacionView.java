package mx.com.ledi.interfaces.gui;

import javax.swing.JComponent;
import mx.com.ledi.error.AppException;

/**
 *
 * @author Tony Stark -- Ironman --
 */
public interface AplicacionView extends AplicacionBean {

	public void show() throws AppException;

	public boolean hide();

	public String getTitle();

	public JComponent getComponent();
}
