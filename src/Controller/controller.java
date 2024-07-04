package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import UseView.*;
import com.raven.datechooser.SelectedDate;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import src.HaircuteDateCommand;
import src.SpaDateCommand;
import src.appointments;
import src.clients;

public class controller implements ActionListener, MouseListener {

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
        vpr.getUsuarioButton().addMouseListener(this);
        vpr.getAcercadeButton().addMouseListener(this);

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


        if (e.getSource() == HC.getSaveButton())
        {
            cli.setName(HC.getOwnerNametxt().getText());
            app.setPetName(HC.getPetNamejtf().getText());
            app.setConfirmed(true);
            app.setPrice(19999);
            HC.getPanelCita().setVisible(true);
        }

        if (e.getSource() == HC.getConfirmButton())
        {

            SelectedDate D = HC.getDateChooser1().getSelectedDate();
            app.setDateAppointment(D.getDay() + "/" + D.getMonth() + "/" + D.getYear());
            cli.makeAppointment();
            JOptionPane.showMessageDialog(null, "cita confirmada");

        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vpr.getUsuarioButton()){
            if (app.isConfirmed())
            {
            vpr.getUsuarioLabel().setText(cli.handleShow());
            }
            new HaircuteDateCommand(app).execute();
        }
        
        if(e.getSource() == vpr.getAcercadeButton()){
            String aboutus = "<html>En \"Bubbliny\", nos esforzamos por brindar un servicio"
                             +" personalizado y adaptado a las necesidades individuales de"
                             +" cada cliente peludo. Nuestro ambiente tranquilo y relajante"
                             +" ayuda a que las mascotas se sientan cómodas y disfruten de su"
                             +" experiencia de cuidado y tratamiento en el spa.</html>"; 
            vpr.getAboutText().setText(aboutus);
            
            new SpaDateCommand(app).execute(); 
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
