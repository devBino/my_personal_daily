package br.com.fbm.mypersonaldaily.repository.ifaces;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

public interface DialogNavigateRecords {

	void prevRecord(); 
	void nextRecord();
	
	default void addButtonsNavigate(final JPanel panel, final JDialog dialog) {
		
		final JPanel ctButtons = new JPanel();
		ctButtons.setBounds(0, 0, 0, 20);
		ctButtons.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		JButton btnPrev = new JButton("<<");
		btnPrev.addActionListener(ev -> prevRecord());
		ctButtons.add(btnPrev);
		
		JButton btnNext = new JButton(">>");
		btnNext.addActionListener(ev -> nextRecord());
		ctButtons.add(btnNext);
		
		panel.add(ctButtons, BorderLayout.NORTH);
		dialog.revalidate();
		dialog.repaint();
		
	}
	
}
