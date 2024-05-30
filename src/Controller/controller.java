package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        vpr.setTitle("INICIO");
        vpr.setVisible(true);
    }

    public void HandleHC() {
        HC.setResizable(false);
        
        HC.setTitle("Hair Cut");
        HC.setVisible(true);

    }

    public void HandleSpa() {
        spa.setResizable(false);
        
        spa.setTitle("Spa");
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
