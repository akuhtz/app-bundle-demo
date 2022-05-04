package org.bidib.sample.appbundlea.ui.view;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainView {
    private final JPanel mainPanel;
	
	public MainView() {
		
		mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2, 1, -1, -1));
        mainPanel.setMinimumSize(new Dimension(420, 420));
        mainPanel.setPreferredSize(new Dimension(420, 420));
		mainPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Ugly Journal"));

        mainPanel.add(new JLabel("Demo"));
	}
	
    public JComponent getRootComponent() {
        return mainPanel;
    }
	
}