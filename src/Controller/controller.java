package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import UseView.*;
import com.raven.datechooser.SelectedDate;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            HC.getIdOwner().setText("");
            HC.getOwnerNametxt().setText("");
            HC.getPetNamejtf().setText("");
            HC.getDetailstxt().setText("");
            try
            {
                appointments cloneapp = (appointments) app.clone();
                HC.getOwnerNametxt().setText(cloneapp.getClientName());
                HC.getPetNamejtf().setText(cloneapp.getPetName());
            } catch (CloneNotSupportedException ex)
            {
                Logger.getLogger(controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            
        }

        if (e.getSource() == vpr.getButtonSpa())
        {
            HandleSpa();
            spa.getIdOwner().setText("");
            spa.getOwnerNametxt().setText("");
            spa.getPetNamejtf().setText("");
            try
            {
                appointments cloneapp = (appointments) app.clone();
                spa.getOwnerNametxt().setText(cloneapp.getClientName());
                spa.getPetNamejtf().setText(cloneapp.getPetName());
            } catch (CloneNotSupportedException ex)
            {
                Logger.getLogger(controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (e.getSource() == vpr.getInfotxt())
        {
            if (app.isConfirmed())
            {
                cli.handleShow();
            }
        }

        if (e.getSource() == HC.getSaveButton())
        {
            cli.setName(HC.getOwnerNametxt().getText());
            app.setPetName(HC.getPetNamejtf().getText());
            app.setConfirmed(true);
            app.setPrice(399);
            HC.getPanelCita().setVisible(true);
        }

        if (e.getSource() == HC.getConfirmButton())
        {
            
            SelectedDate D = HC.getDateChooser1().getSelectedDate();
            app.setDateAppointment(D.getDay() + "/" + D.getMonth() + "/" + D.getYear());
            cli.makeAppointment();
 
        }
    }
}
