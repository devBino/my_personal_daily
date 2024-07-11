package br.com.fbm.mypersonaldaily.views.ui;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * {@code TableAtividadesColorMonitorUI} é uma herança de {@code DefaultTableCellRenderer}
 * para renderizar as linhas das {@code JTable}s de atividades de acordo com seu status
 */
public class TableAtividadesColorMonitorUI extends DefaultTableCellRenderer {

	private static final long serialVersionUID = 8202251396510108747L;

	@Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
		super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        final String status = table.getModel().getValueAt(row, 4).toString();
        
        Color feito = new Color(102, 204, 102);
        Color fazendo = new Color(204, 204, 102); 
        Color pausado = new Color(255, 178, 102);
        Color emFila = new Color(153, 153, 153); 
        Color cancelado = new Color(204, 102, 102);
        
        if( status.equals("Feito") ) {
            setBackground(feito);
        }else if( status.equals("Em Fila") ) {
        	setBackground(emFila);
        }else if( status.equals("Cancelado") ) {
        	setBackground(cancelado);
        }else if( status.equals("Pausado") ) {
        	setBackground(pausado);
        }else if( status.equals("Fazendo") ) {
        	setBackground(fazendo);
        }

        if (isSelected) {
            setBackground(table.getSelectionBackground());
            setForeground(table.getSelectionForeground());
        } else {
            setForeground(Color.BLACK);
        }

        return this;
    }
	
}
