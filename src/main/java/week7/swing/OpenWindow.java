package week7.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class OpenWindow extends JFrame {

    private static final String WINDOW_NAME = "Enter file name";

    private JFileChooser fileChooser = new JFileChooser();

    private JTextArea textArea;
    private JTextField fileName = new JTextField();

    OpenWindow(JTextArea textArea){
        init();
        initComponents();
        initListeners();
        pack();
        setVisible(true);
        setResizable(false);
        this.textArea = textArea;
    }

    private void initListeners() {

        fileChooser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File selectedFile = fileChooser.getSelectedFile();

                if(!selectedFile.exists()) {
                    return;
                }

                System.out.println("Was opened file : " + selectedFile.getAbsolutePath());
                fileName.setText(selectedFile.getAbsolutePath());
                Path path = Paths.get(selectedFile.getAbsolutePath());

                try {

                    List<String> strings = Files.readAllLines(path);
                    StringBuilder sb = new StringBuilder();
                    for(String line : strings) {
                        sb.append(line).append("\n");
                    }
                    textArea.setText(sb.toString());

                } catch (IOException e1) {
                    System.err.println("Exception : " + e1.getClass().getSimpleName());
                    System.err.println("message : " + e1.getMessage());
                    JOptionPane.showMessageDialog((Component) e.getSource(),
                            "File name " + fileName + " wrong.");
                    return;
                }

                System.out.println("File was read");
                dispose();
            }
        });

    }

    private void initComponents() {
        setLayout(new BorderLayout());
        add(fileChooser, BorderLayout.CENTER);
    }

    private void init() {
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocation(400, 250);
        setTitle(WINDOW_NAME);
    }

    public JTextField getInput() {
        return fileName;
    }
}
