import java.util.ArrayList;
import java.util.List;

public class TicketSystem {
    private List<Ticket> availableTickets;
    private List<Customer> customers;

    public TicketSystem() {
        availableTickets = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void addTicket(Ticket ticket) {
        availableTickets.add(ticket);
    }


    public void removeTicket(Ticket ticket) {
        availableTickets.remove(ticket);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public int checkAvailableTickets(String type) {
        int counter = 0;
        for (Ticket ticket : availableTickets) {
            if (ticket.type.equals(type) && ticket.status.equals("AVAILABLE")) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public String toString() {
        StringBuilder ticketSystemInfo = new StringBuilder();
        ticketSystemInfo.append("Available Tickets:\n");
        for (Ticket ticket : availableTickets) {
            ticketSystemInfo.append(ticket).append("\n");
        }
        ticketSystemInfo.append("\nCustomers:\n");
        for (Customer customer : customers) {
            ticketSystemInfo.append(customer).append("\n");
        }
        return ticketSystemInfo.toString();
    }
}
