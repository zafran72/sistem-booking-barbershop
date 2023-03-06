import booking.*;

public class Main {
  public static void main(String[] args) {
    Barbershop barbershop = new Barbershop("Cut Box");
    BookingButton button = new BookingButton();
    Ovo ovo = new Ovo (150000);
    Gopay gopay = new Gopay();
    
    button.connectTo(barbershop);

    barbershop.orderService(new Service("haircut", 20000, 25));
  
    barbershop.connectTo(ovo);

    button.booked();
  }
}
