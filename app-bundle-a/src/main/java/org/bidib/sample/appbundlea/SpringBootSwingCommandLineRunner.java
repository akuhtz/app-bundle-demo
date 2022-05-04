package org.bidib.sample.appbundlea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import org.bidib.sample.appbundlea.ui.controller.MainController;

import java.awt.EventQueue;

/**
 * This CommandLineRunner fires off at runtime and boots up our GUI.
 */
@Component
public class SpringBootSwingCommandLineRunner implements CommandLineRunner {
    private final MainController controller;

    @Autowired
    public SpringBootSwingCommandLineRunner(MainController controller) {
        this.controller = controller;
    }


    @Override
    public void run(String... args) {
        //This boots up the GUI.
        EventQueue.invokeLater(() -> controller.setVisible(true));
    }
}