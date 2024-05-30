
package src;

import java.math.BigInteger;


public class appointments {
    public BigInteger price;
    public String clientName;
    public String petName;
    public String dateAppointment;

    public appointments() {
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
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
    
    
}
