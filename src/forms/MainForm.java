package forms;

import utils.FormConfig;

import javax.swing.*;

public class MainForm extends JFrame{
    private JPanel panel1;
    private JTable table1;

    public MainForm(){
        setContentPane(panel1);
        FormConfig.setParams(this, "Жопка", 1000, 1000, WindowConstants.DISPOSE_ON_CLOSE);
    }
}
