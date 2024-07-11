package br.com.fbm.mypersonaldaily.repository.ifaces;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRootPane;

/**
 * Define ações comuns para serem reaproveitadas
 * nas {@code JDialog}s implementadas na aplicação
 */
public interface BaseFunctionalWindow extends BaseDialogo {

	/**
	 * Sobreescreme métodos obrigatórios de {@code BaseDialogo}[
	 */
	@Override
	default Container getContainerPrincipal() {
		//NA
		return null;
	}
	
	@Override
	default JRootPane getDialogRootPane() {
		//NA
		return null;
	}
	
	@Override
	default void cancelar() {
		//NA
	}
	
	@Override
	default void confirmar() {
		//NA
	}
	
	default void inicializarComponentes() {
		popularTabela();
		popularCombobox();
	}
	
	/**
	 * Define métodos padrões para interface 
	 */
	boolean salvar();
	boolean alterar();
	boolean deletar();
	
	void popularTabela();
	void popularCombobox();
	
	default void addBtnsCrud(final JPanel panel) {
		
		JButton btnCriar = new JButton("Criar");
		btnCriar.setForeground(Color.WHITE);
		btnCriar.setBackground(new Color(26, 95, 180));
		btnCriar.addActionListener(ev -> salvar());
		panel.add(btnCriar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setForeground(Color.WHITE);
		btnAtualizar.setBackground(new Color(26, 95, 180));
		btnCriar.addActionListener(ev -> alterar());
		panel.add(btnAtualizar);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.setForeground(Color.WHITE);
		btnDeletar.setBackground(new Color(26, 95, 180));
		btnDeletar.addActionListener(ev -> deletar());
		panel.add(btnDeletar);
		
	}
	
}
