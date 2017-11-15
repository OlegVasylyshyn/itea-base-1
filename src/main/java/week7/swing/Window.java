package week7.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Window extends JFrame {

    private static final String WINDOW_NAME = "Notepad";

    private JButton openButton = new JButton("OPEN");
    private JButton saveButton = new JButton("SAVE");

    private JLabel label = new JLabel("Save");
    private JFileChooser files = new JFileChooser();
    private JPanel mainPanel = new JPanel();
    private JPanel buttonPanel = new JPanel();
    private JPanel rightPanel = new JPanel();

    private JMenuItem openItem = new JMenuItem("open");
    private JMenuItem saveItem = new JMenuItem("save");

    private JTextArea textArea = new JTextArea(30, 30);

    private JTextField openedFileNameInput;


    public Window() {
        init();
        initComponents();
        initListeners();
        pack();
        setVisible(true);
        setResizable(false);
    }

    private void initListeners() {

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveText();
            }
        });

        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openFile();
            }
        });

        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveText();
            }
        });

        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openFile();
            }
        });

    }

    private void openFile() {
        OpenWindow openWindow = new OpenWindow(textArea);
        openedFileNameInput = openWindow.getInput();
    }

    private void saveText() {
        String fileName = openedFileNameInput.getText();
        System.out.println("Opened file name - " + fileName);
        if(fileName != null && !fileName.isEmpty()) {

            Path path = Paths.get(fileName);
            try {
                Files.write(path, textArea.getText().getBytes());
            } catch (IOException e1) {
                System.err.println("Exception : " + e1.getClass().getSimpleName());
                System.err.println("message : " + e1.getMessage());
            }
            return;
        }

        new SaveWindow(textArea.getText());
    }

    private void initComponents() {
        buttonPanel.setLayout(new GridLayout(0, 1));
//        buttonPanel.add(files);
        buttonPanel.add(openButton);
        buttonPanel.add(saveButton);

        rightPanel.setLayout(new BorderLayout());
        rightPanel.add(buttonPanel, BorderLayout.NORTH);

        textArea.setLineWrap(true);

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(rightPanel, BorderLayout.EAST);
        mainPanel.add(textArea, BorderLayout.WEST);

        JScrollPane scroll = new JScrollPane(mainPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        add(scroll);


        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("file");
        openItem = new JMenuItem("open");
        saveItem = new JMenuItem("save");
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        menuBar.add(fileMenu);

        JMenu viewMenu = new JMenu("view");
        menuBar.add(viewMenu);

        JMenu editMenu = new JMenu("edit");
        menuBar.add(editMenu);

        JMenu aboutMenu = new JMenu("about");
        menuBar.add(aboutMenu);

        setJMenuBar(menuBar);
    }

    private void init() {
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocation(400, 250);
        setTitle(WINDOW_NAME);
    }
}
