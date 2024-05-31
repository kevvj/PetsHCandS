
package src;


public class appointments implements Cloneable{
    public int price;
    public String clientName;
    public String petName;
    public String dateAppointment;
    
    public boolean confirmed;

    private static final appointments instance = new appointments();
    
    private appointments() {
        price = 0;
        clientName = "";
        petName = "";
        dateAppointment = "";
        confirmed = false;
    }
    
    public static appointments getInstance(){
        return instance;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }


    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getDateAppointment() {
        return dateAppointment;
    }

    public void setDateAppointment(String dateAppointment) {
        this.dateAppointment = dateAppointment;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    
    
}
