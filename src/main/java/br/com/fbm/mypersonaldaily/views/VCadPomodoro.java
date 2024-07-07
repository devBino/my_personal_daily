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

public class VCadPomodoro extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel ctCenter = new JPanel();
	private JTextField txtId;
	private JTextField txtDescricao;
	private JTextField txtMinTrabalhando;
	private JTextField txtMinDescansando;

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
		setUndecorated(true);
		setTitle("Cadastro de Pomodoro");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 350, 300);
		getContentPane().setLayout(new BorderLayout());
		ctCenter.setBorder(new LineBorder(new Color(53, 132, 228)));
		getContentPane().add(ctCenter, BorderLayout.CENTER);
		ctCenter.setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Dialog", Font.BOLD, 12));
		lblId.setBounds(12, 26, 14, 15);
		ctCenter.add(lblId);
		
		txtId = new JTextField();
		txtId.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtId.setColumns(21);
		txtId.setBounds(12, 46, 157, 21);
		ctCenter.add(txtId);
		
		JButton btnPrev = new JButton("<<");
		btnPrev.setBounds(218, 44, 61, 25);
		ctCenter.add(btnPrev);
		
		JButton btnNext = new JButton(">>");
		btnNext.setBounds(281, 44, 61, 25);
		ctCenter.add(btnNext);
		
		JLabel lblMinTrabalhando = new JLabel("Minutos Trabalhando");
		lblMinTrabalhando.setFont(new Font("Dialog", Font.BOLD, 12));
		lblMinTrabalhando.setBounds(12, 79, 157, 15);
		ctCenter.add(lblMinTrabalhando);
		
		JLabel lblDescrio = new JLabel("Descrição");
		lblDescrio.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDescrio.setBounds(12, 129, 69, 15);
		ctCenter.add(lblDescrio);
		
		txtDescricao = new JTextField();
		txtDescricao.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtDescricao.setColumns(21);
		txtDescricao.setBounds(12, 145, 330, 21);
		ctCenter.add(txtDescricao);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTipo.setBounds(12, 175, 30, 15);
		ctCenter.add(lblTipo);
		
		JComboBox cbxTipo = new JComboBox();
		cbxTipo.setBounds(12, 191, 330, 24);
		ctCenter.add(cbxTipo);
		
		txtMinTrabalhando = new JTextField();
		txtMinTrabalhando.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtMinTrabalhando.setColumns(21);
		txtMinTrabalhando.setBounds(12, 96, 157, 21);
		ctCenter.add(txtMinTrabalhando);
		
		JLabel lblMinDescansando = new JLabel("Minutos Descansando");
		lblMinDescansando.setFont(new Font("Dialog", Font.BOLD, 12));
		lblMinDescansando.setBounds(185, 79, 157, 15);
		ctCenter.add(lblMinDescansando);
		
		txtMinDescansando = new JTextField();
		txtMinDescansando.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtMinDescansando.setColumns(21);
		txtMinDescansando.setBounds(185, 96, 157, 21);
		ctCenter.add(txtMinDescansando);
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
		ctTop.setPreferredSize(new Dimension(10, 25));
		ctTop.setBackground(new Color(153, 193, 241));
		getContentPane().add(ctTop, BorderLayout.NORTH);
		ctTop.setLayout(new BorderLayout(0, 0));
		
		JButton btnSair = new JButton("Sair");
		btnSair.setForeground(Color.WHITE);
		btnSair.setBackground(new Color(26, 95, 180));
		ctTop.add(btnSair, BorderLayout.EAST);
		
		JLabel lblTitulo = new JLabel("Cadastro de Ciclo de Pomodoro");
		lblTitulo.setForeground(new Color(26, 95, 180));
		ctTop.add(lblTitulo, BorderLayout.WEST);
		
		setLocationRelativeTo(null);
		
	}
}
