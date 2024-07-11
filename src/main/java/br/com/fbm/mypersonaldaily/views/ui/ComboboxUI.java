package br.com.fbm.mypersonaldaily.views.ui;

import java.util.List;
import java.util.function.Consumer;

import javax.swing.JComboBox;

/**
 * {@code ComboboxUI} provê métodos úteis
 * para manipulação de {@code JComboBox}s
 */
public class ComboboxUI {

	public static void popularCombobox(final JComboBox<String> combobox,
			final List<String> itens) {
		
		combobox.removeAllItems();
		combobox.addItem("");
		
		final Consumer<String> csItens = item -> combobox.addItem(item);
		
		itens.forEach(csItens);
		
		combobox.revalidate();
		combobox.repaint();
		
	}
	
}
