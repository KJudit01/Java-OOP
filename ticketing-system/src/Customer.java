public class Customer {
    private String name;
    private int accountNumber;

    public Customer(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void buyTicket(Ticket ticket) {
        ticket.sellTicket();
    }

    public void reserveTicket(Ticket ticket) {
        ticket.reserveTicket();
    }

    @Override
    public String toString() {
        return "+--------------------------------+\n" +
                "| Name:            " + name + " |\n" +
                "| Account no:      " + accountNumber + " |\n" +
                "+-------------------------------+";
    }
}
