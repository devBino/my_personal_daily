package br.com.fbm.mypersonaldaily.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VSistema extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel container;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VSistema frame = new VSistema();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VSistema() {
		setResizable(false);
		setTitle("My Personal Daily");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 395);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCadastro = new JMenu("Cadastro");
		menuBar.add(mnCadastro);
		
		JMenuItem cadAtividades = new JMenuItem("Atividades");
		cadAtividades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VCadAtividade view = new VCadAtividade();
				view.setVisible(true);
			}
		});
		mnCadastro.add(cadAtividades);
		
		JMenuItem cadPomodoro = new JMenuItem("Pomodoro");
		cadPomodoro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VCadPomodoro view = new VCadPomodoro();
				view.setVisible(true);
			}
		});
		mnCadastro.add(cadPomodoro);
		
		JMenu mnPomodoro = new JMenu("Pomodoro");
		menuBar.add(mnPomodoro);
		
		JMenuItem pomoConfiguracoes = new JMenuItem("Configurações");
		pomoConfiguracoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VConfigPomodoro view = new VConfigPomodoro();
				view.setVisible(true);
			}
		});
		mnPomodoro.add(pomoConfiguracoes);
		
		JMenu mnMonitoramento = new JMenu("Monitoramento");
		menuBar.add(mnMonitoramento);
		
		JMenuItem moniAtividades = new JMenuItem("Atividades");
		mnMonitoramento.add(moniAtividades);
		
		JMenuItem moniPomodoro = new JMenuItem("Pomodoro");
		mnMonitoramento.add(moniPomodoro);
		
		JMenuItem moniEstatisticasGithub = new JMenuItem("Estatisticas Github");
		mnMonitoramento.add(moniEstatisticasGithub);
		
		JMenu mnFerramentas = new JMenu("Ferramentas");
		menuBar.add(mnFerramentas);
		
		JMenu mnSobre = new JMenu("Sobre");
		menuBar.add(mnSobre);
		
		JMenuItem sobreMyPersonalDaily = new JMenuItem("My Personal Daily");
		mnSobre.add(sobreMyPersonalDaily);
		container = new JPanel();
		container.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(container);
		container.setLayout(new BorderLayout(0, 0));
		
		JPanel ctCenter = new JPanel();
		container.add(ctCenter, BorderLayout.CENTER);
		ctCenter.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		setLocationRelativeTo(null);
		
	}

}
