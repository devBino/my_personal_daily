package br.com.fbm.mypersonaldaily.repository.utils;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Objects;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * {@code TableUtils} provê métodos úteis
 * para manipulação de {@code JTable}s
 */
public class TableUtils {

	public static void configurarTable(final JTable tabela) {
		
		tabela.setSelectionForeground(new Color(36, 31, 49));
		tabela.setSelectionBackground(new Color(98, 160, 234));
		tabela.setIntercellSpacing(new Dimension(2, 2));
		tabela.setGridColor(new Color(26, 95, 180));
		tabela.setDragEnabled(true);
		
	}
	
	public static void popularTabela(final JTable tabela, final String[] colunas, 
			final String[][] linhas) {
		
		tabela.setModel( new DefaultTableModel(colunas, 0) );
		
		if( Objects.isNull(linhas) ) {
			return;
		}
		
		DefaultTableModel model = (DefaultTableModel) tabela.getModel();
		
		limparTabelaRegistros(model);
		
		
		for(String[] dadosLinha : linhas) {
			
			Object[] row = new Object[colunas.length];
			
			for(int i=0; i<row.length; i++) {
				row[i] = dadosLinha[i];
			}
			
			model.addRow(row);
			
		}
		
		tabela.setModel(model);
		
	}
	
	/**
	 * Limpa tabela de exercícios
	 * @param model
	 */
	private static void limparTabelaRegistros(DefaultTableModel model) {
		if( model.getRowCount() > 0 ) {
			model.removeRow(0);
			limparTabelaRegistros(model);
		}
	}
	
}
