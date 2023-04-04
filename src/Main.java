import Enums.CourierType;
import Enums.Status;
import Service.CourierIMPL;

public class Main {
    public static void main(String[] args) {
        CourierIMPL cmpl = new CourierIMPL();
        cmpl.CreateCourier("abc","Sameer","shekhar", CourierType.Letter,444,9999);
        cmpl.CreateCourier("abcd","Sameer","shekhar", CourierType.Letter,444,9999);
        cmpl.CreateCourier("abce","Sameera","shekhar", CourierType.Letter,444,9999);
        System.out.println(cmpl.displayCouriersBySender("Sameer"));
        System.out.println(cmpl.displayAllCouriers());
        System.out.println(cmpl.displayCouriersByStatus(Status.REQUESTED));
        cmpl.updateDeliveryStatus("abc",Status.DELIVERED);
        System.out.println(cmpl.displayCouriersByStatus(Status.REQUESTED));
        cmpl.updateDeliveryStatus("abc",Status.CANCELED);
    }



}
