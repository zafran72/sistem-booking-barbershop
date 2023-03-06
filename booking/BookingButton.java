package booking;

public class BookingButton implements Activity{
    private Booking order;

    public BookingButton() {
        this.order = null;
    }

    @Override
    public void booked() {
        if (order != null) {
            boolean bookingStatus = order.booking();

            if (bookingStatus) {
                System.out.println("\nBooking successed");
            } else {
                System.err.println("Booking failed");
            }
        } else {
            System.out.println("\nOrder not connected");
        }
    }
    
    public void connectTo(Booking orderBooking) {
        System.out.println("Start booking at barbershop ...");
        this.order = orderBooking;
        System.out.println();
    }
}
