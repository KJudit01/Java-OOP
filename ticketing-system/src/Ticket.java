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
        return "+-----------------------+\n" +
                "| Type:      " + type + "      |\n" +
                "| Price:     " + price + "      |\n" +
                "| State:     " + status + "    |\n" +
                "+-----------------------+";
    }
}
