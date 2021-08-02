package gb.java.level2.homework4.homework;

import javax.swing.*;
import java.awt.*;

public class ApplicationFrame {
    private static final int EXIT_CODE = 99;
    public final JFrame mainFrame;

    public ApplicationFrame() {
        mainFrame = new JFrame();
        mainFrame.setTitle("ChatClientWindow");
        mainFrame.setBounds(new Rectangle(300, 500));
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        BorderLayout borderLayout = new BorderLayout();
        mainFrame.setLayout(borderLayout);

        JTextArea chatTextArea = new JTextArea();
        chatTextArea.setEditable(false);
        JScrollPane jScrollPane = new JScrollPane(chatTextArea);
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        JTextArea messageEntryTextArea = new JTextArea();
        messageEntryTextArea.setText("Enter your text here...");

        mainFrame.add(jScrollPane, BorderLayout.CENTER);
        mainFrame.add(messageEntryTextArea, BorderLayout.SOUTH);
        mainFrame.setJMenuBar(getJMenuBar());

        JButton sendMessageButton = new JButton("Send Message");
        sendMessageButton.addActionListener(e -> chatTextArea.setText(messageEntryTextArea.getText()) );
        mainFrame.add(sendMessageButton, BorderLayout.EAST);

        mainFrame.setVisible(true);

    }

    private JMenu getFileJMenu() {
        JMenu jMenu = new JMenu();
        jMenu.setText("File");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem closeMenuItem = new JMenuItem("Close");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(e -> System.exit(EXIT_CODE));
        jMenu.add(openMenuItem);
        jMenu.add(closeMenuItem);
        jMenu.add(exitMenuItem);
        return jMenu;
    }

    private JMenu getToolsJMenu() {
        JMenu jMenu = new JMenu("Tools");
        JMenuItem setFileAsTemplateJMenuItem = new JMenuItem("Use File As Template");
        JMenuItem httpClientJMenuItem = new JMenuItem("HTTP Client");
        jMenu.add(setFileAsTemplateJMenuItem);
        jMenu.add(httpClientJMenuItem);
        return jMenu;
    }

    private JMenuBar getJMenuBar() {
        JMenuBar jMenuBar = new JMenuBar();
        jMenuBar.add(getFileJMenu());
        jMenuBar.add(getToolsJMenu());

        return jMenuBar;

    }
}
