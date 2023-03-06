package booking;

public interface Payment {
  public boolean pay(int ammount);
  public void topUp(int ammount);
  public float getBalance();
}
