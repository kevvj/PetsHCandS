
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
    
    
    
    public void makeAppointment(){
        appointments app = appointments.getInstance();
        app.setClientName(name);
    }
    
    public void handleShow(){
        appointments app = appointments.getInstance();
        JOptionPane.showMessageDialog(null, app.getClientName() +"\n" + app.getPetName() +"\n" + app.getDateAppointment()+"\n" + app.getPrice());
    }
}
