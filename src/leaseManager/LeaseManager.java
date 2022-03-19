package leaseManager;

import javax.sound.sampled.Line;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeaseManager {
    public static void main(String [] args)
    {
        /*Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        JFrame leaseManagerFrame = new JFrame("Lease Manager");
        leaseManagerFrame.setSize(screenSize.width/2, screenSize.height/2);

        JPanel panel = new JPanel();


        Border border = new LineBorder(Color.red);

        JMenuBar bar = new JMenuBar();

        bar.setBorder(border);

        JMenu menuDatei = new JMenu("Datei");
        JMenuItem menuItemBeenden = new JMenuItem();
        menuItemBeenden.setText("Beenden");
        menuItemBeenden.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }));

        menuDatei.add(menuItemBeenden);

        bar.add(menuDatei);

        leaseManagerFrame.setJMenuBar(bar);
        leaseManagerFrame.add(panel);

        //leaseManagerFrame.pack();
        leaseManagerFrame.setLocationRelativeTo(null);
        leaseManagerFrame.setVisible(true);*/
        Pachtdauer pachtdauer = new Pachtdauer();

        System.out.println(pachtdauer.getBefristungText());

        Pachtdauer pachtdauer1 = new Pachtdauer("19.03.2022");

        System.out.println(pachtdauer1.getBefristungText());

        Pachtdauer pachtdauer2 = new Pachtdauer(2, 9);

        System.out.println(pachtdauer2.getBefristungText());

    }


}
