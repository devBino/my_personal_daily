package br.com.fbm.mypersonaldaily.repository.utils;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 * {@code FontComponentUtils} provê métodos úteis
 * para manipulação das fontes dos componentes das views
 */
public class FontComponentUtils {

	public static void setFontComponents(final Object... components) {
		
		final Font font = UIManager.getFont("Label.font");
		
		for(final Object cp : components) {
			
			if( cp instanceof JTextField ) {
				((JTextField) cp).setFont(font);
				continue;
			}
			
			if( cp instanceof JLabel ) {
				((JLabel) cp).setFont(font);
				continue;
			}
			
		}
		
	}
	
	public static void setFontComponents(final Font font, final Object... components) {
		
		for(final Object cp : components) {
			
			if( cp instanceof JTextField ) {
				((JTextField) cp).setFont(null);
				((JTextField) cp).setFont(font);
				continue;
			}
			
			if( cp instanceof JLabel ) {
				((JLabel) cp).setFont(null);
				((JLabel) cp).setFont(font);
				continue;
			}
			
		}
		
	}
	
	public static void setFontComponents(final Font font, final Color color,
			final Object... components) {
		
		for(final Object cp : components) {
			
			if( cp instanceof JTextField ) {
				((JTextField) cp).setFont(null);
				((JTextField) cp).setFont(font);
				continue;
			}
			
			if( cp instanceof JLabel ) {
				((JLabel) cp).setFont(null);
				((JLabel) cp).setFont(font);
				continue;
			}
			
			if( cp instanceof JCheckBox ) {
				((JCheckBox) cp).setFont(null);
				((JCheckBox) cp).setFont(font);
				((JCheckBox) cp).setForeground(color);
			}
			
		}
		
	}

	
}
