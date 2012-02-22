/**
 * 
 */
package org.minecraft.rconclient.gui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPopupMenu;

import net.sourceforge.namedlogger.NamedLogger;

/**
 * A mouse listener to activate a popup menu.
 * 
 * @author vincent
 * 
 */
public class PopupMenuListener extends MouseAdapter {

	/**
	 * The logger for this class.
	 */
	private static final NamedLogger LOGGER = new NamedLogger();

	/**
	 * The popup menu.
	 */
	private final JPopupMenu popupMenu;

	/**
	 * A new listener will be created.
	 * 
	 * @param popupMenu
	 *            The popup menu to show.
	 */
	public PopupMenuListener(final JPopupMenu popupMenu) {
		LOGGER.entering(popupMenu);

		this.popupMenu = popupMenu;

		LOGGER.exiting();
	}

	@Override
	public void mousePressed(final MouseEvent event) {
		LOGGER.entering(event);

		maybeShowPopup(event);

		LOGGER.exiting();
	}

	@Override
	public void mouseReleased(final MouseEvent event) {
		LOGGER.entering(event);

		maybeShowPopup(event);

		LOGGER.exiting();
	}

	/**
	 * Show the popup menu in case the event is a popup trigger event.
	 * 
	 * @param event
	 */
	private void maybeShowPopup(final MouseEvent event) {
		LOGGER.entering(event);

		if (event.isPopupTrigger()) {
			popupMenu.show(event.getComponent(), event.getX(), event.getY());
		}

		LOGGER.exiting();
	}

}