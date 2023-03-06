package booking;

public class Service {
  private String name;
  private int price;
  private int durationMinutes;

  public Service(String name, int price, int durationMinutes) {
    this.name = name;
    this.price = price;
    this.durationMinutes = durationMinutes;
  }

  public String getName() {
    return this.name;
  }

  public int getPrice() {
    return this.price;
  }

  public int getDurationMinutes() {
    return this.durationMinutes;
  }
}
