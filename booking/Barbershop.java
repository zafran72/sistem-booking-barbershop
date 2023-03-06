package booking;

import java.util.ArrayList;

public class Barbershop implements Booking {
  private Payment eWallet;
  private String name;
  private ArrayList <Service> services;

  public Barbershop(String name) {
    this.eWallet = null;
    this.name = name;
    this.services = new ArrayList<> ();
  }

  @Override
  public boolean booking() {
    boolean bookingStatus = false;

    if (eWallet != null) {
      boolean paymentStatus = eWallet.pay(15000);
      
      if (paymentStatus) {
        bookingStatus = true;
      } else {
        System.out.println("\n Payment failed");
      }
      System.out.println("Your remaining balance is Rp"+eWallet.getBalance());
    }
    return bookingStatus;
  }

  @Override
  public void connectTo(Payment eWallet) {
    System.out.println("\nConnecting to payment ...");
    this.eWallet = eWallet;
    System.out.println("Payment connected");
  }
  
  public void orderService(Service service) {
    System.out.println("Ordering "+service.getName()+" service at "+this.name);
    this.services.add(service);
    System.out.println(service.getName()+" ordered");
  }
}
