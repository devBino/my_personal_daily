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
import br.com.fbm.mypersonaldaily.repository.utils.FontUtils;

public class VCadAtividade 
	extends JDialog implements BaseDialogo, DialogNavigateRecords {

	private static final long serialVersionUID = 1L;
	
	private JTextField txtId, txtIdExterno, txtDescricao;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VCadAtividade dialog = new VCadAtividade();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VCadAtividade() {
		
		/**
		 * Configurações iniciais da JDialog
		 */
		configsDialog(this, "Cadastro de Atividades", 
				100, 100, 310, 300);
		
		/**
		 * Campos específicos dessa JDialog
		 */
		JPanel ctCenter = new JPanel(new BorderLayout());
		ctCenter.setBorder(new LineBorder(new Color(53, 132, 228)));
		getContentPane().add(ctCenter, BorderLayout.CENTER);
		
		addButtonsNavigate(ctCenter, this);
		
		JPanel pnComponentesCenter = new JPanel();
		ctCenter.add(pnComponentesCenter, BorderLayout.CENTER);
		pnComponentesCenter.setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(13, 11, 277, 15);
		pnComponentesCenter.add(lblId);
		
		txtId = new JTextField();
		txtId.setBounds(13, 28, 277, 21);
		txtId.setColumns(21);
		pnComponentesCenter.add(txtId);
		
		JLabel lblIdExterno = new JLabel("ID Externo");
		lblIdExterno.setBounds(13, 60, 277, 15);
		pnComponentesCenter.add(lblIdExterno);
		
		txtIdExterno = new JTextField();
		txtIdExterno.setBounds(13, 77, 277, 21);
		txtIdExterno.setColumns(21);
		pnComponentesCenter.add(txtIdExterno);
		
		JLabel lblDescricao = new JLabel("Descrição");
		lblDescricao.setBounds(13, 105, 277, 15);
		pnComponentesCenter.add(lblDescricao);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(13, 123, 277, 21);
		txtDescricao.setColumns(21);
		pnComponentesCenter.add(txtDescricao);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(12, 149, 278, 15);
		pnComponentesCenter.add(lblTipo);
		
		JComboBox<String> cbxTipo = new JComboBox<String>();
		cbxTipo.setBounds(12, 168, 278, 24);
		pnComponentesCenter.add(cbxTipo);
		
		FontUtils.setFontComponents(lblId, lblIdExterno, lblDescricao, lblTipo);

		FontUtils.setFontComponents(new Font("Dialog", Font.PLAIN, 14), 
				txtId, txtIdExterno, txtDescricao);
		
		/**
		 * Adicionando containers padrões
		 */
		addContainerTop("Cadastro de Atividades");
		addContainerBottom();
		
	}
	
	@Override
	public Container getContainerPrincipal() {
		return this.getContentPane();
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
	public void prevRecord() {
		
	}
	
	@Override
	public void nextRecord() {
		// TODO Auto-generated method stub
		
	}
	
}
