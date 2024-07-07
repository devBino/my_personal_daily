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
import java.awt.Dimension;

public class VCadAtividade extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel ctCenter = new JPanel();
	private JTextField txtId;
	private JTextField txtIdExterno;
	private JTextField txtDescricao;

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
		
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setUndecorated(true);
		setTitle("Cadastro de Atividades");
		setBounds(100, 100, 310, 300);
		getContentPane().setLayout(new BorderLayout());
		ctCenter.setBorder(new LineBorder(new Color(53, 132, 228)));
		getContentPane().add(ctCenter, BorderLayout.CENTER);
		setLocationRelativeTo(null);
		
		ctCenter.setLayout(null);
		{
			JLabel lblId = new JLabel("ID");
			lblId.setBounds(12, 22, 14, 15);
			lblId.setFont(new Font("Dialog", Font.BOLD, 12));
			ctCenter.add(lblId);
		}
		{
			txtId = new JTextField();
			txtId.setBounds(12, 42, 119, 21);
			txtId.setFont(new Font("Dialog", Font.PLAIN, 14));
			ctCenter.add(txtId);
			txtId.setColumns(21);
		}
		{
			JLabel lblIdExterno = new JLabel("ID Externo");
			lblIdExterno.setBounds(12, 68, 72, 15);
			lblIdExterno.setFont(new Font("Dialog", Font.BOLD, 12));
			ctCenter.add(lblIdExterno);
		}
		{
			txtIdExterno = new JTextField();
			txtIdExterno.setBounds(12, 88, 119, 21);
			txtIdExterno.setFont(new Font("Dialog", Font.PLAIN, 14));
			ctCenter.add(txtIdExterno);
			txtIdExterno.setColumns(21);
		}
		{
			JLabel lblDescrio = new JLabel("Descrição");
			lblDescrio.setBounds(12, 114, 69, 15);
			lblDescrio.setFont(new Font("Dialog", Font.BOLD, 12));
			ctCenter.add(lblDescrio);
		}
		{
			txtDescricao = new JTextField();
			txtDescricao.setBounds(12, 134, 277, 21);
			txtDescricao.setFont(new Font("Dialog", Font.PLAIN, 14));
			ctCenter.add(txtDescricao);
			txtDescricao.setColumns(21);
		}
		{
			JLabel lblTipo = new JLabel("Tipo");
			lblTipo.setBounds(12, 164, 30, 15);
			lblTipo.setFont(new Font("Dialog", Font.BOLD, 12));
			ctCenter.add(lblTipo);
		}
		{
			JComboBox cbxTipo = new JComboBox();
			cbxTipo.setBounds(12, 186, 277, 24);
			ctCenter.add(cbxTipo);
		}
		
		JButton btnPrev = new JButton("<<");
		btnPrev.setBounds(162, 40, 61, 25);
		ctCenter.add(btnPrev);
		
		JButton btnNext = new JButton(">>");
		btnNext.setBounds(228, 40, 61, 25);
		ctCenter.add(btnNext);
		{
			JPanel ctBottom = new JPanel();
			ctBottom.setBackground(new Color(153, 193, 241));
			ctBottom.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(ctBottom, BorderLayout.SOUTH);
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.setForeground(Color.WHITE);
				btnCancelar.setBackground(new Color(26, 95, 180));
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				btnCancelar.setActionCommand("OK");
				ctBottom.add(btnCancelar);
				getRootPane().setDefaultButton(btnCancelar);
			}
			{
				JButton btnConfirmar = new JButton("Confirmar");
				btnConfirmar.setForeground(Color.WHITE);
				btnConfirmar.setBackground(new Color(26, 95, 180));
				btnConfirmar.setActionCommand("Cancel");
				ctBottom.add(btnConfirmar);
			}
		}
		{
			JPanel ctTop = new JPanel();
			ctTop.setPreferredSize(new Dimension(10, 25));
			ctTop.setBackground(new Color(153, 193, 241));
			getContentPane().add(ctTop, BorderLayout.NORTH);
			ctTop.setLayout(new BorderLayout(0, 0));
			{
				JButton btnSair = new JButton("Sair");
				btnSair.setForeground(Color.WHITE);
				btnSair.setBackground(new Color(26, 95, 180));
				ctTop.add(btnSair, BorderLayout.EAST);
			}
			{
				JLabel lblTitulo = new JLabel("Cadastro de Atividades");
				lblTitulo.setForeground(new Color(26, 95, 180));
				ctTop.add(lblTitulo, BorderLayout.WEST);
			}
		}
	}
}
