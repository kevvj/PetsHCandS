package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import UseView.*;
import javax.swing.JOptionPane;
import src.appointments;
import src.clients;

public class controller implements ActionListener {
    
    appointments app = appointments.getInstance();
    clients cli = new clients();
    
    viewPr vpr;
    HairCut HC;
    Spa spa;
    
    public controller() {
        vpr = new viewPr();
        HC = new HairCut();
        spa = new Spa();
        
        vpr.getButtonHC().addActionListener(this);
        vpr.getButtonSpa().addActionListener(this);
        vpr.getInfotxt().addActionListener(this);
        HC.getConfirmButton().addActionListener(this);
        HC.getSaveButton().addActionListener(this);
        
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
        
        if (e.getSource() == vpr.getInfotxt())
        {
            if(app.isConfirmed()){
                cli.handleShow();
            }
        }
        
        if (e.getSource() == HC.getSaveButton())
        {
            cli.setName(HC.getOwnerNametxt().getText());
            HC.getPanelCita().setVisible(true);
            JOptionPane.showMessageDialog(null, "a");
        }
        
        if (e.getSource() == HC.getConfirmButton())
        {
            app.setPetName("");
            app.setConfirmed(true);
            app.setDateAppointment("");
            cli.makeAppointment();
        }
    }
}
