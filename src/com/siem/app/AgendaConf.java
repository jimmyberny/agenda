package com.siem.app;

import java.util.Properties;
import mx.com.ledi.config.ArchivoConfiguracion;

/**
 *
 * @author Tony Stark -- Ironman --
 */
public class AgendaConf extends ArchivoConfiguracion {

	public AgendaConf(String nombreArchivo) {
		super(nombreArchivo);
	}

	@Override
	public void initPorDefecto(Properties props) {
		props.put("app.creador", "Iván");
	}

}
