package mx.com.ledi.interfaces.gui;

import mx.com.ledi.gui.menu.MenuUtil;

/**
 *
 * @author Tony Stark -- Ironman --
 */
public interface Aplicacion {

	public MenuUtil getMenu();

	public void mostrarTarea(String tarea);

	public AplicacionBean getBean(Class clazz);

	public AplicacionBean getBean(String className);
}
