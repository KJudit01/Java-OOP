public class Customer {
    private String name;
    private int accountNumber;

    public Customer(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public void buyTicket(Ticket ticket) {
        ticket.sellTicket();
    }

    public void reserveTicket(Ticket ticket) {
        ticket.reserveTicket();
    }

    @Override
    public String toString() {
        return String.format(
                "+-------------------------------+%n" +
                        "| Name:        %-16s |%n" +
                        "| Account No:  %-16s |%n" +
                        "+-------------------------------+",
                this.name, this.accountNumber);
    }
}
