package br.com.fbm.mypersonaldaily.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import br.com.fbm.mypersonaldaily.repository.ifaces.BaseDialogo;
import br.com.fbm.mypersonaldaily.views.ui.FontUI;

public class VConfigPomodoro 
	extends JDialog implements BaseDialogo {

	private static final long serialVersionUID = 1L;
	
	private JTextField txtDescricao, txtMaxTempoCiclo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VCadPomodoro dialog = new VCadPomodoro();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VConfigPomodoro() {
		
		/**
		 * Configurações iniciais da JDialog
		 */
		configsDialog(this, "Configurações dos Ciclos de Pomodoro", 
				100, 100, 350, 300);
		
		/**
		 * Campos específicos dessa JDialog
		 */
		JPanel ctCenter = new JPanel();
		ctCenter.setBorder(new LineBorder(new Color(53, 132, 228)));
		getContentPane().add(ctCenter, BorderLayout.CENTER);
		ctCenter.setLayout(null);
		
		JLabel lblMaxTempoCiclo = new JLabel("Tempo Máximo do Ciclo (Minutos)");
		lblMaxTempoCiclo.setBounds(8, 34, 277, 15);
		ctCenter.add(lblMaxTempoCiclo);
		
		JLabel lblDescrio = new JLabel("Descrição");
		lblDescrio.setBounds(8, 75, 277, 15);
		ctCenter.add(lblDescrio);
		
		txtDescricao = new JTextField();
		txtDescricao.setColumns(21);
		txtDescricao.setBounds(8, 51, 277, 21);
		ctCenter.add(txtDescricao);
		
		txtMaxTempoCiclo = new JTextField();
		txtMaxTempoCiclo.setColumns(21);
		txtMaxTempoCiclo.setBounds(8, 94, 277, 21);
		ctCenter.add(txtMaxTempoCiclo);
		
		JButton btnPesquisa = new JButton("?");
		btnPesquisa.setBounds(286, 89, 41, 25);
		ctCenter.add(btnPesquisa);
		
		JLabel lblProporcaoDescanso = new JLabel("Proporção do Tempo Descansando");
		lblProporcaoDescanso.setBounds(8, 127, 246, 15);
		ctCenter.add(lblProporcaoDescanso);
		
		JComboBox<String> cbxTipo = new JComboBox<>();
		cbxTipo.setBounds(8, 148, 277, 24);
		ctCenter.add(cbxTipo);
		
		JCheckBox checkPularDesanso = new JCheckBox("Permite Pular Descanso");
		checkPularDesanso.setBounds(8, 180, 277, 25);
		ctCenter.add(checkPularDesanso);
		
		FontUI.setFontComponents(lblMaxTempoCiclo, lblDescrio, lblProporcaoDescanso);

		FontUI.setFontComponents(new Font("Dialog", Font.PLAIN, 14), 
				txtDescricao, txtMaxTempoCiclo);
		
		FontUI.setFontComponents(new Font("Dialog", Font.BOLD | Font.ITALIC, 14), 
				new Color(26, 95, 180), checkPularDesanso);
		
		/**
		 * Adicionando containers padrões
		 */
		addContainerTop("Configurações dos Ciclos de Pomodoro");
		addContainerBottom();
		
	}
	
	@Override
	public Container getContainerPrincipal() {
		return getContentPane();
	}
	
	@Override
	public JRootPane getDialogRootPane() {
		return this.getRootPane();
	}
	
	@Override
	public void closeDialog() {
		dispose();
	}
	
	@Override
	public void confirmar() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void cancelar() {
		// TODO Auto-generated method stub
		
	}
	
	
}
