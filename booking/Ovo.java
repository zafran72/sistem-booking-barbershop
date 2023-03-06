package booking;

public class Ovo implements Payment{
    private int balance;

    public Ovo() {
        this.balance = 0;
    }

    public Ovo(int balance) {
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
