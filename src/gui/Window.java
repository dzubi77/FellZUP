package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Window extends JFrame {
    private JPanel mainPanel;
    private JPanel controlPanel;
    private JPanel userPanel;
    private JPanel innnerButtonPanel;
    private JButton minButton;
    private JButton maxButton;
    private JButton closeButton;
    private JButton fileButton;
    private JButton villageButton;
    private JButton layersButton;
    private JButton zoomButton;
    private JButton moveButton;
    private JButton measureButton;
    private JButton drawButton;
    private JButton editButton;
    private JMenuItem[] fileItems;
    private JMenuItem[] villageItems;
    private JMenuItem[] layersItems;
    private JMenuItem[] zoomItems;
    private JMenuItem[] drawItems;
    private JMenuItem[] editItems;

    public Window() {
        super();
        this.setTitle("FellZUP");
        this.setContentPane(this.mainPanel);
        this.setSize(1200, 1000);
        this.initMenus();

        this.mainPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });

        // ACTIONS
        this.fileButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JPopupMenu menu = new JPopupMenu();
                Window.this.loadMenuItems(menu, Window.this.fileItems);
                menu.show(Window.this.fileButton, 0, 30);
            }
        });

        this.villageButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JPopupMenu menu = new JPopupMenu();
                Window.this.loadMenuItems(menu, Window.this.villageItems);
                menu.show(Window.this.villageButton, 0, 30);
            }
        });

        this.layersButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JPopupMenu menu = new JPopupMenu();
                Window.this.loadMenuItems(menu, Window.this.layersItems);
                menu.show(Window.this.layersButton, 0, 30);
            }
        });

        this.zoomButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JPopupMenu menu = new JPopupMenu();
                Window.this.loadMenuItems(menu, Window.this.zoomItems);
                menu.show(Window.this.zoomButton, 0, 30);
            }
        });

        this.moveButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JOptionPane.showMessageDialog(null, "Toto tlačidlo neposkytuje menu (poskytne akciu :))!");
            }
        });

        this.measureButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JOptionPane.showMessageDialog(null, "Toto tlačidlo neposkytuje menu (poskytne akciu :))!");
            }
        });

        this.drawButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JPopupMenu menu = new JPopupMenu();
                Window.this.loadMenuItems(menu, Window.this.drawItems);
                menu.show(Window.this.drawButton, 0, 30);
            }
        });

        this.editButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JPopupMenu menu = new JPopupMenu();
                Window.this.loadMenuItems(menu, Window.this.editItems);
                menu.show(Window.this.editButton, 0, 30);
            }
        });

        //main window options
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                if (JOptionPane.showConfirmDialog(null, "Ste si istý?", "Ukončenie", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    System.exit(0);
                } else {
                    Window.this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
                }
            }
        });

        this.setVisible(true);
    }

    private void loadMenuItems(JPopupMenu menu, JMenuItem[] items) {
        for (var i : items) {
            menu.add(i);
        }
    }

    private void initMenus() {
        this.fileItems = new JMenuItem[8];
        this.fileItems[0] = new JMenuItem("Nový");
        this.fileItems[1] = new JMenuItem("Otvoriť");
        this.fileItems[2] = new JMenuItem("Uložiť");
        this.fileItems[3] = new JMenuItem("Uložiť ako");
        this.fileItems[4] = new JMenuItem("Export");
        this.fileItems[5] = new JMenuItem("Tlač");
        this.fileItems[6] = new JMenuItem("Preferencie");
        this.fileItems[7] = new JMenuItem("Koniec");

        this.villageItems = new JMenuItem[3];
        this.villageItems[0] = new JMenuItem("Otvoriť ÚP");
        this.villageItems[1] = new JMenuItem("Vložiť nový ÚP");
        this.villageItems[2] = new JMenuItem("Aktualizovať ÚP");

        this.layersItems = new JMenuItem[16];
        this.layersItems[0] = new JMenuItem("Parcely C-KN");
        this.layersItems[1] = new JMenuItem("Parcely E-KN");
        this.layersItems[2] = new JMenuItem("Parcelné čísla C-KN");
        this.layersItems[3] = new JMenuItem("Parcelné čísla E-KN");
        this.layersItems[4] = new JMenuItem("Hranica zastavaného územia");
        this.layersItems[5] = new JMenuItem("Hranice urbanizovaných okrskov");
        this.layersItems[6] = new JMenuItem("Funkčné využitie územia");
        this.layersItems[7] = new JMenuItem("Priestorové využitie územia");
        this.layersItems[8] = new JMenuItem("Doprava");
        this.layersItems[9] = new JMenuItem("Vodné hospodárstvo");
        this.layersItems[10] = new JMenuItem("Energetika");
        this.layersItems[11] = new JMenuItem("Lesné hospodárstvo");
        this.layersItems[12] = new JMenuItem("Vrstevnice");
        this.layersItems[13] = new JMenuItem("Ortofoto aktuálna");
        this.layersItems[14] = new JMenuItem("Ortofoto historická");
        this.layersItems[15] = new JMenuItem("Ochranné pásma");

        this.zoomItems = new JMenuItem[2];
        this.zoomItems[0] = new JMenuItem("Priblížiť");
        this.zoomItems[1] = new JMenuItem("Vzdialiť");

        this.drawItems = new JMenuItem[8];
        this.drawItems[0] = new JMenuItem("Bod");
        this.drawItems[1] = new JMenuItem("Priamka");
        this.drawItems[2] = new JMenuItem("Polygon");
        this.drawItems[3] = new JMenuItem("Mnohouholník");
        this.drawItems[4] = new JMenuItem("Kružnica");
        this.drawItems[5] = new JMenuItem("Krivka");
        this.drawItems[6] = new JMenuItem("Šrafa");
        this.drawItems[7] = new JMenuItem("Text");

        this.editItems = new JMenuItem[8];
        this.editItems[0] = new JMenuItem("Späť");
        this.editItems[1] = new JMenuItem("Vpred");
        this.editItems[2] = new JMenuItem("Vymazať");
        this.editItems[3] = new JMenuItem("Vložiť obrázok");
        this.editItems[4] = new JMenuItem("Kalibrovať obrázok");
        this.editItems[5] = new JMenuItem("Posunúť obrázok");
        this.editItems[6] = new JMenuItem("Otočiť obrázok");
        this.editItems[7] = new JMenuItem("Vymazať obrázok");
    }
}