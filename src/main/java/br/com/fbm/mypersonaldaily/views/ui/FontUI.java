package br.com.fbm.mypersonaldaily.views.ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 * {@code FontUI} provê métodos úteis
 * para manipulação das fontes dos componentes das views
 */
public class FontUI {

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
			
			if( cp instanceof JCheckBox ) {
				((JCheckBox) cp).setFont(null);
				((JCheckBox) cp).setFont(font);
			}
			
			if( cp instanceof JRadioButton ) {
				((JRadioButton) cp).setFont(null);
				((JRadioButton) cp).setFont(font);
			}
			
			if( cp instanceof JTextArea ) {
				((JTextArea) cp).setFont(null);
				((JTextArea) cp).setFont(font);
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
			
			if( cp instanceof JCheckBox ) {
				((JCheckBox) cp).setFont(null);
				((JCheckBox) cp).setFont(font);
			}
			
			if( cp instanceof JRadioButton ) {
				((JRadioButton) cp).setFont(null);
				((JRadioButton) cp).setFont(font);
			}
			
			if( cp instanceof JTextArea ) {
				((JTextArea) cp).setFont(null);
				((JTextArea) cp).setFont(font);
			}
			
		}
		
	}
	
	public static void setFontComponents(final Font font, final Color color,
			final Object... components) {
		
		for(final Object cp : components) {
			
			if( cp instanceof JTextField ) {
				((JTextField) cp).setFont(null);
				((JTextField) cp).setFont(font);
				((JTextField) cp).setForeground(color);
				continue;
			}
			
			if( cp instanceof JLabel ) {
				((JLabel) cp).setFont(null);
				((JLabel) cp).setFont(font);
				((JLabel) cp).setForeground(color);
				continue;
			}
			
			if( cp instanceof JCheckBox ) {
				((JCheckBox) cp).setFont(null);
				((JCheckBox) cp).setFont(font);
				((JCheckBox) cp).setForeground(color);
			}
			
			if( cp instanceof JRadioButton ) {
				((JRadioButton) cp).setFont(null);
				((JRadioButton) cp).setFont(font);
				((JRadioButton) cp).setForeground(color);
			}
			
			if( cp instanceof JTextArea ) {
				((JTextArea) cp).setFont(null);
				((JTextArea) cp).setFont(font);
				((JRadioButton) cp).setForeground(color);
			}
			
		}
		
	}

	
}
