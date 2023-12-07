public class Main {
    public static void main(String[] args) {
        TicketSystem ticketSystem = new TicketSystem();
        Ticket ticket1 = new Ticket("SEAT", 30.0, "SOLD");
        Ticket ticket2 = new Ticket("VIP", 100.0, "AVAILABLE");
        Ticket ticket3 = new Ticket("STANDING_TICKET", 20.0, "RESERVED");
        ticketSystem.addTicket(ticket1);
        ticketSystem.addTicket(ticket2);
        ticketSystem.addTicket(ticket3);
        Customer customer1 = new Customer("Paul", 4385);
        Customer customer2 = new Customer("Jessica", 2332);
        ticketSystem.addCustomer(customer1);
        ticketSystem.addCustomer(customer2);
        customer1.buyTicket(ticket1);
        customer2.reserveTicket(ticket3);
        int availableVIP = ticketSystem.checkAvailableTickets("VIP");
        System.out.println("Available VIP tickets: " + availableVIP);
        System.out.println("\nTicket System Information:\n" + ticketSystem);
    }
}
