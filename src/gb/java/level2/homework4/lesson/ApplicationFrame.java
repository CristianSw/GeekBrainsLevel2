package gb.java.level2.homework4.lesson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplicationFrame {
    private static final int EXIT_CODE = 99;
    private final JFrame mainFrame;

    public ApplicationFrame() {
        mainFrame = new JFrame();
        mainFrame.setTitle("CD_Chat");
        mainFrame.setBounds(new Rectangle(300, 500));
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBorderLayout();

        JTextArea jtextArea = new JTextArea();
        jtextArea.append("sfhjbasdfvbsjd vjdsjvbjhsdbvjhsdbfvhsbd\n");
        jtextArea.append("sfhjbasdfvbsjd vjdsjvbjhsdbvjhsdbfvhsbd\n");
        jtextArea.append("sfhjbasdfvbsjd vjdsjvbjhsdbvjhsdbfvhsbd\n");
        jtextArea.append("sfhjbasdfvbsjd vjdsjvbjhsdbvjhsdbfvhsbd\n");
        jtextArea.append("sfhjbasdfvbsjd vjdsjvbjhsdbvjhsdbfvhsbd\n");
        jtextArea.append("sfhjbasdfvbsjd vjdsjvbjhsdbvjhsdbfvhsbd\n");
        jtextArea.append("sfhjbasdfvbsjd vjdsjvbjhsdbvjhsdbfvhsbd\n");
        jtextArea.append("sfhjbasdfvbsjd vjdsjvbjhsdbvjhsdbfvhsbd\n");
        jtextArea.append("sfhjbasdfvbsjd vjdsjvbjhsdbvjhsdbfvhsbd\n");
        jtextArea.append("sfhjbasdfvbsjd vjdsjvbjhsdbvjhsdbfvhsbd\n");
        jtextArea.append("sfhjbasdfvbsjd vjdsjvbjhsdbvjhsdbfvhsbd\n");
        jtextArea.append("sfhjbasdfvbsjd vjdsjvbjhsdbvjhsdbfvhsbd\n");

        JScrollPane jScrollPane = new JScrollPane(jtextArea);
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        mainFrame.add(jScrollPane,BorderLayout.CENTER);


        mainFrame.setJMenuBar(getJMenuBar());


        mainFrame.setVisible(true);


    }

    private void setFlowLayout() {
        LayoutManager layoutManager = new FlowLayout();
        mainFrame.setLayout(layoutManager);
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btnX = new JButton("X");
        mainFrame.add(btn1);
        mainFrame.add(btn2);
        mainFrame.add(btn3);
        mainFrame.add(btn4);
        mainFrame.add(btnX);
    }

    private void setBoxLayout() {
        LayoutManager layoutManager = new BoxLayout(mainFrame.getContentPane(), BoxLayout.X_AXIS);
        mainFrame.setLayout(layoutManager);
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btnX = new JButton("X");
        mainFrame.add(btn1);
        mainFrame.add(btn2);
        mainFrame.add(btn3);
        mainFrame.add(btn4);
        mainFrame.add(btnX);
    }

    private void setBorderLayout() {
        BorderLayout borderLayout = new BorderLayout();
        mainFrame.setLayout(borderLayout);

        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btnX = new JButton("X");

        mainFrame.add(btn1, BorderLayout.NORTH);
        mainFrame.add(btn2, BorderLayout.EAST);
        mainFrame.add(btn3, BorderLayout.SOUTH);
        mainFrame.add(btn4, BorderLayout.WEST);
        mainFrame.add(btnX, BorderLayout.CENTER);
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
