package booking;

public class Gopay implements Payment{
    private int balance;

    public Gopay() {
        this.balance = 0;
    }

    public Gopay(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean pay(int ammount) {
        boolean paymentStatus = false;

        System.out.println("\nStarting payment");

        if (this.getBalance() >= ammount) {
            this.balance -= ammount;
            paymentStatus = true;
        }

        return paymentStatus;
    }

    @Override
    public void topUp(int ammount) {
        this.balance += ammount;
    }

    @Override
    public float getBalance() {
        return this.balance;
    }
}
