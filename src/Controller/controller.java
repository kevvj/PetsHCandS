package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import UseView.*;

public class controller implements ActionListener {

    viewPr vpr;
    HairCut HC;
    Spa spa;

    public controller() {
        vpr = new viewPr();
        HC = new HairCut();
        spa = new Spa();

        vpr.getButtonHC().addActionListener(this);
        vpr.getButtonSpa().addActionListener(this);

    }

    public void Run() {
        vpr.setResizable(false);
        vpr.setLocationRelativeTo(null);
        vpr.setTitle("INICIO");
        vpr.setVisible(true);

    }

    public void HandleHC() {
        HC.setResizable(false);
        HC.setLocationRelativeTo(null);
        HC.setTitle("INICIO");
        HC.setVisible(true);

    }

    public void HandleSpa() {
        spa.setResizable(false);
        spa.setLocationRelativeTo(null);
        spa.setTitle("INICIO");
        spa.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vpr.getButtonHC())
        {
            HandleHC();
        }

        if (e.getSource() == vpr.getButtonSpa())
        {
            HandleSpa();
        }
    }
}
