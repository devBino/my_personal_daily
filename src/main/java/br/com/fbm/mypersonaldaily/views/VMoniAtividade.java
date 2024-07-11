package br.com.fbm.mypersonaldaily.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import br.com.fbm.mypersonaldaily.repository.ifaces.BaseFunctionalWindow;
import br.com.fbm.mypersonaldaily.repository.ifaces.DialogNavigateRecords;
import br.com.fbm.mypersonaldaily.views.ui.ComboboxUI;
import br.com.fbm.mypersonaldaily.views.ui.FontUI;
import br.com.fbm.mypersonaldaily.views.ui.TableAtividadesColorMonitorUI;
import br.com.fbm.mypersonaldaily.views.ui.TableUI;

public class VMoniAtividade 
	extends JDialog implements BaseFunctionalWindow, DialogNavigateRecords {

	private static final long serialVersionUID = 1L;
	private JTextField txtIdExterno, txtDescricao;
	private JComboBox<String> cbxTipo, cbxStatus;
	private JTable tbAtividades;
	
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
		configsDialog(this, "Monitoramento de Atividades", 
				100, 100, 850, 550);
		
		JPanel ctCenter = new JPanel();
		getContentPane().add(ctCenter, BorderLayout.CENTER);
		ctCenter.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel pnFiltro = new JPanel();
		pnFiltro.setBorder(
				new TitledBorder(null, "Filtro", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		pnFiltro.setPreferredSize(new Dimension(810, 55));
		ctCenter.add(pnFiltro);
		pnFiltro.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lblIdExterno = new JLabel("ID Externo");
		pnFiltro.add(lblIdExterno);
		
		txtIdExterno = new JTextField();
		pnFiltro.add(txtIdExterno);
		txtIdExterno.setColumns(10);
		
		JLabel lblDescricao = new JLabel("Descrição");
		pnFiltro.add(lblDescricao);
		
		txtDescricao = new JTextField();
		pnFiltro.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo");
		pnFiltro.add(lblTipo);
		
		cbxTipo = new JComboBox<String>();
		pnFiltro.add(cbxTipo);
		
		JLabel lblStatus = new JLabel("Status");
		pnFiltro.add(lblStatus);
		
		cbxStatus = new JComboBox<String>();
		pnFiltro.add(cbxStatus);
		
		JPanel pnPaginacao = new JPanel();
		pnPaginacao.setBorder(
				new TitledBorder(null, "Pagina\u00E7\u00E3o", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		pnPaginacao.setPreferredSize(new Dimension(810, 60));
		ctCenter.add(pnPaginacao);
		
		pnPaginacao.setLayout(new BorderLayout(0, 0));
		
		JPanel pnDescPaginacao = new JPanel();
		pnDescPaginacao.setPreferredSize(new Dimension(550, 55));
		pnPaginacao.add(pnDescPaginacao, BorderLayout.WEST);
		pnDescPaginacao.setLayout(null);
		
		JLabel lblPaginaDescricao = new JLabel("Pagina 1 de 50 - Total Registros: 500");
		lblPaginaDescricao.setBounds(12, 12, 257, 15);
		lblPaginaDescricao.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPaginaDescricao.setHorizontalAlignment(SwingConstants.CENTER);
		pnDescPaginacao.add(lblPaginaDescricao);
		
		JPanel pnBtnsPaginacao = new JPanel();
		pnBtnsPaginacao.setPreferredSize(new Dimension(120, 55));
		pnPaginacao.add(pnBtnsPaginacao, BorderLayout.EAST);
		
		addButtonsNavigate(pnBtnsPaginacao, this);
		
		JPanel pnRegistros = new JPanel();
		pnRegistros.setBorder(
				new TitledBorder(null, "Registros de Atividades", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		pnRegistros.setPreferredSize(new Dimension(810, 350));
		ctCenter.add(pnRegistros);
		pnRegistros.setLayout(new BorderLayout(0, 0));
		
		JScrollPane spTbAtividades = new JScrollPane();
		spTbAtividades.setBackground(new Color(61, 56, 70));
		pnRegistros.add(spTbAtividades);
		
		tbAtividades = new JTable();
		TableUI.configurarTable(tbAtividades, new TableAtividadesColorMonitorUI());
		spTbAtividades.setViewportView(tbAtividades);
		
		JPanel pnBtnsRegistros = new JPanel();
		pnBtnsRegistros.setPreferredSize(new Dimension(10, 35));
		FlowLayout fl_pnBtnsRegistros = (FlowLayout) pnBtnsRegistros.getLayout();
		fl_pnBtnsRegistros.setAlignment(FlowLayout.RIGHT);
		pnRegistros.add(pnBtnsRegistros, BorderLayout.NORTH);
		
		JButton btnLocalizar = new JButton("Localizar");
		btnLocalizar.setForeground(Color.WHITE);
		btnLocalizar.setBackground(new Color(26, 95, 180));
		pnFiltro.add(btnLocalizar);
		
		addBtnsCrud(pnBtnsRegistros);
		
		/**
		 * Inicialização padrão de componentes
		 */
		FontUI.setFontComponents(lblDescricao, lblIdExterno, lblPaginaDescricao, lblStatus, lblTipo);
		
		FontUI.setFontComponents(new Font("Dialog", Font.PLAIN, 14), 
				txtDescricao, txtIdExterno);
		
		/**
		 * Adicionando containers padrões
		 */
		addContainerTop("Monitoramento de Atividades");
		
		inicializarComponentes();
		
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
	
	@Override
	public void prevRecord() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void nextRecord() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void popularTabela() {
		
		final String[] colunas = new String[] {
			"ID",
			"ID EXTERNO",
			"DESCRIÇÃO",
			"TIPO",
			"STATUS"
		};
		
		final String[][] linhas = new String[5][];
		
		linhas[0] = new String[] {
			"1","10","Descrição Atividade UM","Desenvolvimento","Em Fila"
		};
		
		linhas[1] = new String[] {
			"2","20","Descrição Atividade DOIS","Análise","Fazendo"
		};
		
		linhas[2] = new String[] {
			"3","30","Descrição Atividade TRES","Bug","Pausado"
		};
		
		linhas[3] = new String[] {
			"4","40","Descrição Atividade QUATRO","Bug","Cancelado"
		};
		
		linhas[4] = new String[] {
			"5","50","Descrição Atividade CINCO","Bug","Feito"
		};
		
		TableUI.popularTabela(tbAtividades, colunas, linhas);
		
	}
	
	@Override
	public void popularCombobox() {
		
		ComboboxUI.popularCombobox(cbxStatus, List.of("Todo","Doing","Done"));
		ComboboxUI.popularCombobox(cbxTipo, List.of("Melhorias","Bugs"));
		
	}
	
}
