public class Atm {
    private double balance = 10000;

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }

        balance -= amount;
        System.out.println("Balance Amount: " + balance);
    }

    public static void main(String[] args) {
        Atm m = new Atm();
        try {
            m.withdraw(1);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

