package br.com.fbm.mypersonaldaily.views;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JRootPane;

import br.com.fbm.mypersonaldaily.repository.ifaces.BaseFunctionalWindow;

public class VMoniAtividade 
	extends JDialog implements BaseFunctionalWindow {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VMoniAtividade dialog = new VMoniAtividade();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VMoniAtividade() {
		
		/**
		 * Configurações iniciais da JDialog
		 */
		configsDialog(this, "Cadastro de Atividades", 
				100, 100, 600, 500);
		
		JPanel contentPanel = new JPanel();
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		
		/**
		 * Adicionando containers padrões
		 */
		addContainerTop("Monitoramento de Atividades");
		
	}
	
	@Override
	public void closeDialog() {
		dispose();
	}
	
	@Override
	public JRootPane getDialogRootPane() {
		return this.getRootPane();
	}
	
	@Override
	public Container getContainerPrincipal() {
		return this.getContentPane();
	}
	
	@Override
	public boolean salvar() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean alterar() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean deletar() {
		// TODO Auto-generated method stub
		return false;
	}

}
