package ui;

import javax.swing.*;

public class MainForm extends JFrame{
    private JPanel rootPanel;
    private JTable tableContacts;
    private JButton buttonNewContact;
    private JButton buttonRemove;

    public MainForm() {

        setContentPane(rootPanel);
        setSize(600, 350);
        setVisible(true);

    }
}
