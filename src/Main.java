import gui.Window;

public class Main {
    public static void main(String[] args) {
        Window w = new Window();
    }
}

//import javax.swing.*;
//import java.awt.event.*;
//
//public class Main {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Popup Menu Example");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        JButton button = new JButton("File");
//        JPopupMenu popupMenu = new JPopupMenu();
//        JMenuItem menuItem1 = new JMenuItem("Option 1");
//        JMenuItem menuItem2 = new JMenuItem("Option 2");
//        JMenuItem menuItem3 = new JMenuItem("Option 3");
//
//        popupMenu.add(menuItem1);
//        popupMenu.add(menuItem2);
//        popupMenu.add(menuItem3);
//
//        button.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                popupMenu.show(button, 0, button.getHeight());
//            }
//        });
//
//        frame.getContentPane().add(button);
//        frame.setSize(300, 200);
//        frame.setVisible(true);
//    }
//}
