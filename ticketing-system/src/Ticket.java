public class Ticket {
    public String type;
    private double price;
    String status;

    public Ticket(String type, double price, String status) {
        this.type = type;
        this.price = price;
        this.status = "AVAILABLE";
    }

    public void reserveTicket() {
        this.status = "RESERVED";
    }

    public void sellTicket() {
        this.status = "SOLD";
    }

    @Override
    public String toString() {
        return String.format("+-------------------------------+%n" +
                        "| Type:          %-16s |%n" +
                        "| Price:         %-16.2f |%n" +
                        "| Status:        %-16s |%n" +
                        "+-------------------------------+",
                this.type, this.price, this.status);
    }
}
