package br.com.fbm.mypersonaldaily.repository.ifaces;

import java.awt.Container;

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
	
	/**
	 * Define métodos padrões para interface 
	 */
	boolean salvar();
	boolean alterar();
	boolean deletar();
	
}
