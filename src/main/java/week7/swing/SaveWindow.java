package week7.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SaveWindow extends JFrame {

    private static final String WINDOW_NAME = "Enter file name";

    private JTextField input = new JTextField(15);
    private JButton save = new JButton("save");

    private final String text;

    SaveWindow(String text){
        init();
        initComponents();
        initListeners();
        pack();
        setVisible(true);
        setResizable(false);
        this.text = text;
    }

    private void initListeners() {

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fileName = input.getText();

                if(fileName == null || fileName.isEmpty()) {
                    JOptionPane.showMessageDialog((Component) e.getSource(),
                            "File name was not set.");
                    return;
                }

                System.out.println("File will be save with this name - " + fileName);
                System.out.println(text);
                System.out.println();

                Path path = Paths.get(fileName);
                try {
                    Files.write(path, text.getBytes());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                dispose();
            }
        });

    }

    private void initComponents() {
        setLayout(new BorderLayout());
        add(input, BorderLayout.NORTH);
        add(save, BorderLayout.SOUTH);
    }

    private void init() {
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocation(400, 250);
        setTitle(WINDOW_NAME);
    }

}
