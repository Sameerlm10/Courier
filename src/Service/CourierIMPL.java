package Service;

import Entity.Courier;
import Enums.CourierType;
import Enums.Status;
import Repository.CourierRepo;
import Validator.Validate;


import java.util.LinkedList;
import java.util.List;


public class CourierIMPL {

    public void CreateCourier(String title, String sender, String reciver, CourierType cType,int sourcePin , int destinationPin ){
        if(CourierRepo.courierRepo.containsKey(title))
            throw new IllegalArgumentException("Cant use same titele");

        Courier courier = new Courier(title,sender,reciver,cType,sourcePin,destinationPin, Status.REQUESTED);
        CourierRepo.courierRepo.put(title,courier);

    }

    public List<Courier> displayCouriersBySender(String name){
     List<Courier> clist = new LinkedList<>();
     for(var each : CourierRepo.courierRepo.entrySet())
         if(each.getValue().getSenderName()==name)
             clist.add(each.getValue());
         return clist;
    }


public List<Courier> displayAllCouriers(){
    List<Courier> clist = new LinkedList<>();
    for(var each : CourierRepo.courierRepo.entrySet())
        clist.add(each.getValue());

    return clist;
}



   public List<Courier> displayCouriersByType(CourierType ctype){
       List<Courier> clist = new LinkedList<>();
       for(var each : CourierRepo.courierRepo.entrySet())
         if(each.getValue().getCourierType()==ctype)
             clist.add(each.getValue());

       return  clist;
   }

        public List<Courier>    displayCouriersByStatus(Status status){
            List<Courier> clist = new LinkedList<>();
            for(var each : CourierRepo.courierRepo.entrySet())
                if(each.getValue().getStatus()==status)
                    clist.add(each.getValue());

            return  clist;
        }


        public void updateDeliveryStatus(String title, Status s){
            if(!CourierRepo.courierRepo.containsKey(title))
                throw new IllegalArgumentException("this title does not exist");

            var k = CourierRepo.courierRepo.get(title);
            Validate v = new Validate();
            if(!v.checkStatuesChange(s,k.getStatus()))
                throw new IllegalArgumentException("Cant change to this state");


            k.setStatus(s);
            CourierRepo.courierRepo.put(title,k);

    }




}
