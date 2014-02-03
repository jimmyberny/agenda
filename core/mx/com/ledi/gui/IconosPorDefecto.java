package mx.com.ledi.gui;

import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;

/**
 *
 * @author Tony Stark -- Ironman --
 */
public class IconosPorDefecto implements IconSet {

	private Map<String, ImageIcon> cache;

	public IconosPorDefecto() {
		cache = new HashMap<String, ImageIcon>(40);
	}

	/**
	 *
	 * @param fileName
	 * @return
	 */
	public ImageIcon getIcon(String fileName) {
		ImageIcon ii = cache.get(fileName);
		if (ii == null) {
			ii = new ImageIcon(getClass().getResource("/com/sayco/images/" + fileName));
			cache.put(fileName, ii);
		}
		return ii;
	}

	@Override
	public ImageIcon getNoIcon() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public ImageIcon getAppIcon() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public ImageIcon getSaveIcon() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public ImageIcon getBackIcon() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public ImageIcon getAddIcon() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public ImageIcon getDeleteIcon() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public ImageIcon getDownloadIcon() {
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
