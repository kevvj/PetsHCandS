package src;

public class SpaDateCommand implements Command {

    private appointments appointment;

    public SpaDateCommand(appointments appointment) {
        this.appointment = appointment;
    }

    @Override
    public void execute() {
        appointment.SpaDate();
    }

}
