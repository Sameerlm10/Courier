package Entity;

import Enums.CourierType;
import Enums.Status;

public class Courier {

//    Courier Type
//    Source Pincode
//    Destination Pincode


private String title;
private String senderName;
private String reciverName;
private CourierType courierType;
private int sourcePinCode;
private  int destinationPincode;
private Status status;

    public Courier(String title, String senderName, String reciverName, CourierType courierType, int sourcePinCode, int destinationPincode, Status status) {
        this.title = title;
        this.senderName = senderName;
        this.reciverName = reciverName;
        this.courierType = courierType;
        this.sourcePinCode = sourcePinCode;
        this.destinationPincode = destinationPincode;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReciverName() {
        return reciverName;
    }

    public void setReciverName(String reciverName) {
        this.reciverName = reciverName;
    }

    public CourierType getCourierType() {
        return courierType;
    }

    public void setCourierType(CourierType courierType) {
        this.courierType = courierType;
    }

    public int getSourcePinCode() {
        return sourcePinCode;
    }

    public void setSourcePinCode(int sourcePinCode) {
        this.sourcePinCode = sourcePinCode;
    }

    public int getDestinationPincode() {
        return destinationPincode;
    }

    public void setDestinationPincode(int destinationPincode) {
        this.destinationPincode = destinationPincode;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "title='" + title + '\'' +
                ", senderName='" + senderName + '\'' +
                ", reciverName='" + reciverName + '\'' +
                ", courierType=" + courierType +
                ", sourcePinCode=" + sourcePinCode +
                ", destinationPincode=" + destinationPincode +
                ", status=" + status +
                '}';
    }
}
