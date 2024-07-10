package br.com.fbm.mypersonaldaily.repository.utils;

import java.util.List;
import java.util.function.Consumer;

import javax.swing.JComboBox;

/**
 * {@code ComboboxUtils} provê métodos úteis
 * para manipulação de {@code JComboBox}s
 */
public class ComboboxUtils {

	public static void popularCombobox(final JComboBox<String> combobox,
			final List<String> itens) {
		
		combobox.removeAll();
		combobox.addItem("");
		
		final Consumer<String> csItens = item -> combobox.addItem(item);
		
		itens.forEach(csItens);
		
	}
	
}
