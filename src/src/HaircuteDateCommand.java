
package src;

public class HaircuteDateCommand implements Command{
    
    private appointments appointment;

    public HaircuteDateCommand(appointments appointment) {
        this.appointment = appointment;
    }
    

    @Override
    public void execute() {
        appointment.HairCutDate();
    }
    
}
