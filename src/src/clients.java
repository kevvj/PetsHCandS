package src;

import javax.swing.JOptionPane;

public class clients {

    private String name;
    private String id;

    public clients() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //Este metodo hace una cita
    public void makeAppointment() {
        appointments app = appointments.getInstance();

        app.setClientName(name);
    }

    //Este metodo retorna la informacion del cliente
    public String handleShow() {
        appointments app = appointments.getInstance();

        String t = "<html>El usuario " + app.getClientName() + "<br>"
                + "Junto a su mascota "+app.getPetName() + "<br>"
                + "Tienen una cita Programada en la fecha: "+ app.getDateAppointment() + "<br>"
                + "Con un precio de: " +app.getPrice() + "</html>";
        return t;
    }
}
