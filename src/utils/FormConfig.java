package utils;

import javax.swing.*;
import java.awt.*;

public class FormConfig {
    public static void setParams(JFrame frame, String title, int width, int height, int operationClose){
        frame.setTitle(title);
        frame.setMinimumSize(new Dimension(width, height));
        frame.setDefaultCloseOperation(operationClose);
        frame.setLocationRelativeTo(null);
        frame.setIconImage(new ImageIcon("").getImage());
    }
}
