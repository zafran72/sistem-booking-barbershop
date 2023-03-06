package booking;

public interface Booking {
  public boolean booking();
  public void connectTo(Payment wallet);
}