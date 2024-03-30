import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Window extends JFrame {
    private JPanel mainPanel;
    private JPanel controlPanel;
    private JPanel innerControlPanel;
    private JPanel userPanel;
    private JPanel listPanel;
    private JPanel buttonPanel;
    private JButton minButton;
    private JButton maxButton;
    private JButton closeButton;
    private JPanel filePanel;
    private JPanel villagePanel;
    private JPanel layersPanel;
    private JPanel drawPanel;
    private JPanel editPanel;
    private JList<String> fileOptions;
    private JList<String> villageOptions;
    private JList<String> layersOptions;
    private JList<String> drawOptions;
    private JList<String> editOptions;
    private JList<String> zoomOptions;
    private JButton fileButton;
    private JButton villageButton;
    private JButton layersButton;
    private JButton zoomButton;
    private JButton moveButton;
    private JButton measureButton;
    private JButton drawButton;
    private JButton editButton;
    private JPanel zoomPanel;
    private final ArrayList<JPanel> panels = new ArrayList<>();

    public Window() {
        super();
        this.setTitle("FellZUp");
        this.setContentPane(this.mainPanel);
        this.setSize(1200, 1000);
        this.initLists();

        this.panels.add(this.filePanel);
        this.panels.add(this.villagePanel);
        this.panels.add(this.layersPanel);
        this.panels.add(this.zoomPanel);
        this.panels.add(this.drawPanel);
        this.panels.add(this.editPanel);

        this.mainPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Window.this.hidePanels();
            }
        });

        // ACTIONS
        this.fileButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Window.this.hidePanels();
                Window.this.showPanelsWithoutLists(Window.this.filePanel);
                Window.this.filePanel.setVisible(true);
            }
        });

        this.villageButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Window.this.hidePanels();
                Window.this.showPanelsWithoutLists(Window.this.villagePanel);
                Window.this.villagePanel.setVisible(true);
            }
        });

        this.layersButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Window.this.hidePanels();
                Window.this.showPanelsWithoutLists(Window.this.layersPanel);
                Window.this.layersPanel.setVisible(true);
            }
        });

        this.zoomButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Window.this.hidePanels();
                Window.this.showPanelsWithoutLists(Window.this.zoomPanel);
                Window.this.zoomPanel.setVisible(true);
            }
        });

        this.moveButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JOptionPane.showMessageDialog(null, "Button does not provide menu!");
            }
        });

        this.measureButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JOptionPane.showMessageDialog(null, "Button does not provide menu!");
            }
        });

        this.drawButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Window.this.hidePanels();
                Window.this.showPanelsWithoutLists(Window.this.drawPanel);
                Window.this.drawPanel.setVisible(true);
            }
        });

        this.editButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Window.this.hidePanels();
                Window.this.showPanelsWithoutLists(Window.this.editPanel);
                Window.this.editPanel.setVisible(true);
            }
        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                if (JOptionPane.showConfirmDialog(null, "Si si isty?", "Ukoncenie", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    System.exit(0);
                } else {
                    Window.this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
                }
            }
        });

        this.setVisible(true);
    }

    private void initLists() {
        var model = new DefaultListModel<String>();
        this.fileOptions.setModel(model);
        model.addElement("Nový            ");
        model.addElement("Otvoriť         ");
        model.addElement("Uložiť          ");
        model.addElement("Uložiť ako      ");
        model.addElement("Export          ");
        model.addElement("Tlač            ");
        model.addElement("Preferencie     ");
        model.addElement("Koniec          ");
        this.filePanel.add(new JScrollPane(this.fileOptions), FlowLayout.LEFT);
        this.filePanel.setVisible(false);

        var model2 = new DefaultListModel<String>();
        this.villageOptions.setModel(model2);
        model2.addElement("Otvoriť ÚP        ");
        model2.addElement("Vložiť nový ÚP    ");
        model2.addElement("Aktualizovať ÚP   ");
        this.villagePanel.add(new JScrollPane(this.villageOptions), FlowLayout.LEFT);
        this.villagePanel.setVisible(false);

        var model3 = new DefaultListModel<String>();
        this.layersOptions.setModel(model3);
        model3.addElement("Parcely C-KN                      ");
        model3.addElement("Parcely E-KN                      ");
        model3.addElement("Parcelné čísla C-KN               ");
        model3.addElement("Parcelné čísla E-KN               ");
        model3.addElement("Hranica zastavaného územia        ");
        model3.addElement("Hranice urbanizovaných okrskov    ");
        model3.addElement("Funkčné využitie územia           ");
        model3.addElement("Priestorové využitie územia       ");
        model3.addElement("Doprava                           ");
        model3.addElement("Vodné hospodárstvo                ");
        model3.addElement("Energetika                        ");
        model3.addElement("Lesné hospodárstvo                ");
        model3.addElement("Vrstevnice                        ");
        model3.addElement("Ortofoto aktuálna                 ");
        model3.addElement("Ortofoto historická               ");
        model3.addElement("Ochranné pásma                    ");
        this.layersPanel.add(new JScrollPane(this.layersOptions), FlowLayout.LEFT);
        this.layersPanel.setVisible(false);

        var model4 = new DefaultListModel<String>();
        this.drawOptions.setModel(model4);
        model4.addElement("Bod           ");
        model4.addElement("Priamka       ");
        model4.addElement("Polygon       ");
        model4.addElement("Mnohouholník  ");
        model4.addElement("Kružnica      ");
        model4.addElement("Krivka        ");
        model4.addElement("Šrafa         ");
        model4.addElement("Text          ");
        this.drawPanel.add(new JScrollPane(this.drawOptions), FlowLayout.LEFT);
        this.drawPanel.setVisible(false);

        var model5 = new DefaultListModel<String>();
        this.editOptions.setModel(model5);
        model5.addElement("Krok späť          ");
        model5.addElement("Krok vpred         ");
        model5.addElement("Vymazať            ");
        model5.addElement("Vložiť obrázok     ");
        model5.addElement("Kalibrovať obrázok ");
        model5.addElement("Posunúť obrázok    ");
        model5.addElement("Otočiť obrázok     ");
        model5.addElement("Vymazať obrázok    ");
        this.editPanel.add(new JScrollPane(this.editOptions), FlowLayout.LEFT);
        this.editPanel.setVisible(false);

        var model6 = new DefaultListModel<String>();
        this.zoomOptions.setModel(model6);
        model6.addElement("Priblížiť    ");
        model6.addElement("Vzdialiť     ");
        this.zoomPanel.add(new JScrollPane(this.zoomOptions), FlowLayout.LEFT);
        this.zoomPanel.setVisible(false);
    }

    private void hidePanels() {
        for (var p : this.panels) {
            if (p.isVisible()) {
                p.setVisible(false);
            }
        }
    }

    private void showPanelsWithoutLists(JPanel panel) {
        for (var p : this.panels) {
            if (!p.equals(panel)) {
                p.getComponent(0).setVisible(false);
                p.setVisible(true);
            } else {
                p.getComponent(0).setVisible(true);
            }
        }
    }
}