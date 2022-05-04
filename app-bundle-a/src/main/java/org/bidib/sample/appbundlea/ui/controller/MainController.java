package org.bidib.sample.appbundlea.ui.controller;

import org.bidib.sample.appbundlea.ui.view.MainView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.swing.*;


/**
 * This is the main view of the application.  If it gets closed, then the application stops.
 */
@Controller
public class MainController extends JFrame {
    private final MainView view;
	
	@Autowired
    public MainController() {
		super("What a hideous application!");
		
		this.view = new MainView() {
            
        };

        this.setContentPane(view.getRootComponent());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.pack();
    }
	
}