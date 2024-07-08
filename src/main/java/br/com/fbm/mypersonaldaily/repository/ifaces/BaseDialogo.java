package br.com.fbm.mypersonaldaily.repository.ifaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.SwingConstants;

/**
 * Define ações comuns para serem reaproveitadas
 * nas {@code JDialog}s implementadas na aplicação
 */
public interface BaseDialogo {

	Container getContainerPrincipal();
	JRootPane getDialogRootPane();
	void closeDialog();
	void cancelar();
	void confirmar();
	
	default void configsDialog(final JDialog dialog, final String titulo, 
			int x, int y, int w, int h) {
		
		dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		dialog.setUndecorated(true);
		dialog.setTitle(titulo);
		dialog.setBounds(x, y, w, h);
		dialog.setLocationRelativeTo(null);
		
		getContainerPrincipal().setLayout(new BorderLayout());
		
	}
	
	default void addContainerTop(final String titulo) {
		
		JPanel ctTop = new JPanel();
		
		ctTop.setPreferredSize(new Dimension(10, 25));
		ctTop.setBackground(new Color(153, 193, 241));
		
		getContainerPrincipal().add(ctTop, BorderLayout.NORTH);
			
		ctTop.setLayout(new BorderLayout(0, 0));
			
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(ev -> closeDialog());
		
		btnSair.setForeground(Color.WHITE);
		btnSair.setBackground(new Color(26, 95, 180));
		ctTop.add(btnSair, BorderLayout.EAST);
		
		JLabel lblTitulo = new JLabel("  ".concat(titulo));
		lblTitulo.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(new Color(26, 95, 180));
		ctTop.add(lblTitulo, BorderLayout.WEST);
		
	}
	
	default void addContainerBottom() {
		
		JPanel ctBottom = new JPanel();
		
		ctBottom.setBackground(new Color(153, 193, 241));
		ctBottom.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		getContainerPrincipal().add(ctBottom, BorderLayout.SOUTH);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.setBackground(new Color(26, 95, 180));
		btnCancelar.setActionCommand("Cancel");
		btnCancelar.addActionListener(ev -> cancelar());
		ctBottom.add(btnCancelar);
		getDialogRootPane().setDefaultButton(btnCancelar);
	
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setForeground(Color.WHITE);
		btnConfirmar.setBackground(new Color(26, 95, 180));
		btnConfirmar.setActionCommand("OK");
		btnConfirmar.addActionListener(ev -> confirmar());
		ctBottom.add(btnConfirmar);
		
	}
	
}
