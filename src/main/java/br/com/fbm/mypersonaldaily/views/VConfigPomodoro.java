package br.com.fbm.mypersonaldaily.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import java.awt.Dimension;

public class VConfigPomodoro extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel ctCenter = new JPanel();
	private JTextField txtDescricao;
	private JTextField txtMaxTempoCiclo;

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
		
		setUndecorated(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 350, 300);
		getContentPane().setLayout(new BorderLayout());
		ctCenter.setBorder(new LineBorder(new Color(53, 132, 228)));
		getContentPane().add(ctCenter, BorderLayout.CENTER);
		ctCenter.setLayout(null);
		
		JLabel lblMaxTempoCiclo = new JLabel("Tempo Máximo do Ciclo");
		lblMaxTempoCiclo.setFont(new Font("Dialog", Font.BOLD, 12));
		lblMaxTempoCiclo.setBounds(12, 71, 172, 15);
		ctCenter.add(lblMaxTempoCiclo);
		
		JLabel lblDescrio = new JLabel("Descrição");
		lblDescrio.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDescrio.setBounds(12, 22, 69, 15);
		ctCenter.add(lblDescrio);
		
		txtDescricao = new JTextField();
		txtDescricao.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtDescricao.setColumns(21);
		txtDescricao.setBounds(12, 38, 254, 21);
		ctCenter.add(txtDescricao);
		
		JComboBox cbxTipo = new JComboBox();
		cbxTipo.setBounds(12, 142, 327, 24);
		ctCenter.add(cbxTipo);
		
		txtMaxTempoCiclo = new JTextField();
		txtMaxTempoCiclo.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtMaxTempoCiclo.setColumns(21);
		txtMaxTempoCiclo.setBounds(12, 88, 172, 21);
		ctCenter.add(txtMaxTempoCiclo);
		
		JButton btnPesquisa = new JButton("?");
		btnPesquisa.setBounds(278, 36, 61, 25);
		ctCenter.add(btnPesquisa);
		
		JLabel lblProporcaoDescanso = new JLabel("Proporção do Tempo Descansando");
		lblProporcaoDescanso.setFont(new Font("Dialog", Font.BOLD, 12));
		lblProporcaoDescanso.setBounds(12, 121, 254, 15);
		ctCenter.add(lblProporcaoDescanso);
		
		JCheckBox checkPularDesanso = new JCheckBox("Permite Pular Descanso");
		checkPularDesanso.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		checkPularDesanso.setForeground(new Color(26, 95, 180));
		checkPularDesanso.setBounds(12, 186, 327, 23);
		ctCenter.add(checkPularDesanso);
		{
			JPanel ctBottom = new JPanel();
			ctBottom.setBackground(new Color(153, 193, 241));
			ctBottom.setBorder(new LineBorder(new Color(53, 132, 228)));
			ctBottom.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(ctBottom, BorderLayout.SOUTH);
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				btnCancelar.setForeground(Color.WHITE);
				btnCancelar.setBackground(new Color(26, 95, 180));
				btnCancelar.setActionCommand("OK");
				ctBottom.add(btnCancelar);
				getRootPane().setDefaultButton(btnCancelar);
			}
			{
				JButton btnConfirmar = new JButton("Confirmar");
				btnConfirmar.setBackground(new Color(26, 95, 180));
				btnConfirmar.setForeground(Color.WHITE);
				btnConfirmar.setActionCommand("Cancel");
				ctBottom.add(btnConfirmar);
			}
		}
		
		JPanel ctTop = new JPanel();
		ctTop.setBackground(new Color(153, 193, 241));
		ctTop.setPreferredSize(new Dimension(10, 25));
		getContentPane().add(ctTop, BorderLayout.NORTH);
		ctTop.setLayout(new BorderLayout(0, 0));
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBackground(new Color(26, 95, 180));
		btnSair.setForeground(new Color(255, 255, 255));
		ctTop.add(btnSair, BorderLayout.EAST);
		
		JLabel lblTitulo = new JLabel("Configurações dos Ciclos de Pomodoro");
		lblTitulo.setForeground(new Color(26, 95, 180));
		ctTop.add(lblTitulo, BorderLayout.WEST);
		
		setLocationRelativeTo(null);
		
	}
	
}
