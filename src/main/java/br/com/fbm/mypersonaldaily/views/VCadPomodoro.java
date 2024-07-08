package br.com.fbm.mypersonaldaily.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import br.com.fbm.mypersonaldaily.repository.ifaces.BaseDialogo;
import br.com.fbm.mypersonaldaily.repository.ifaces.DialogNavigateRecords;

public class VCadPomodoro 
	extends JDialog implements BaseDialogo, DialogNavigateRecords {

	private static final long serialVersionUID = 1L;
	
	private JTextField txtId, txtDescricao, txtMinTrabalhando, txtMinDescansando;
	
	private JComboBox<String> cbxTipo;
	
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
	public VCadPomodoro() {
		
		/**
		 * Configurações iniciais da JDialog
		 */
		configsDialog(this, "Cadastro de Pomodoro", 
				100, 100, 350, 300);
		
		/**
		 * Campos específicos dessa JDialog
		 */
		JPanel ctCenter = new JPanel(new BorderLayout());
		ctCenter.setBorder(new LineBorder(new Color(53, 132, 228)));
		getContentPane().add(ctCenter, BorderLayout.CENTER);

		addButtonsNavigate(ctCenter, this);
		
		JPanel pnComponentesCenter = new JPanel();
		ctCenter.add(pnComponentesCenter);
		pnComponentesCenter.setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(12, 12, 14, 15);
		pnComponentesCenter.add(lblId);
		lblId.setFont(new Font("Dialog", Font.BOLD, 12));
		
		txtId = new JTextField();
		txtId.setBounds(12, 29, 151, 21);
		pnComponentesCenter.add(txtId);
		txtId.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtId.setColumns(21);
		
		JLabel lblMinTrabalhando = new JLabel("Minutos Trabalhando");
		lblMinTrabalhando.setBounds(12, 55, 151, 15);
		pnComponentesCenter.add(lblMinTrabalhando);
		lblMinTrabalhando.setFont(new Font("Dialog", Font.BOLD, 12));
		
		txtMinTrabalhando = new JTextField();
		txtMinTrabalhando.setBounds(12, 77, 151, 21);
		pnComponentesCenter.add(txtMinTrabalhando);
		txtMinTrabalhando.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtMinTrabalhando.setColumns(21);
		
		JLabel lblMinDescansando = new JLabel("Minutos Descansando");
		lblMinDescansando.setBounds(170, 55, 157, 15);
		pnComponentesCenter.add(lblMinDescansando);
		lblMinDescansando.setFont(new Font("Dialog", Font.BOLD, 12));
		
		txtMinDescansando = new JTextField();
		txtMinDescansando.setBounds(170, 77, 157, 21);
		pnComponentesCenter.add(txtMinDescansando);
		txtMinDescansando.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtMinDescansando.setColumns(21);
		
		JLabel lblDescrio = new JLabel("Descrição");
		lblDescrio.setBounds(12, 103, 69, 15);
		pnComponentesCenter.add(lblDescrio);
		lblDescrio.setFont(new Font("Dialog", Font.BOLD, 12));
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(12, 122, 315, 21);
		pnComponentesCenter.add(txtDescricao);
		txtDescricao.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtDescricao.setColumns(21);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(12, 150, 30, 15);
		pnComponentesCenter.add(lblTipo);
		lblTipo.setFont(new Font("Dialog", Font.BOLD, 12));
		
		cbxTipo = new JComboBox<>();
		cbxTipo.setBounds(13, 168, 314, 24);
		pnComponentesCenter.add(cbxTipo);
		
		/**
		 * Adicionando containers padrões
		 */
		addContainerTop("Cadastro de Ciclo de Pomodoro");
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
	
	@Override
	public void nextRecord() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void prevRecord() {
		// TODO Auto-generated method stub
		
	}
	
}
