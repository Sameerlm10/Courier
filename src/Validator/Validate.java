package Validator;

import Enums.Status;

public class Validate {

    public  boolean checkStatuesChange(Status newStatus,Status oldStatus){
return (oldStatus == Status.REQUESTED && newStatus == Status.DELIVERED) || (oldStatus == Status.REQUESTED && newStatus == Status.CANCELED);

    }
}
