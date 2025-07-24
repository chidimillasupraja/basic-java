
class MovieTicket {
    public static void main(String[] args) {
        int choice = 1;
        String name = "Supraja";
        int ticketPrice = 150;

        if (choice == 1) 
           System.out.println("You booked HARAHARA VIRA MALLU .");
        else 
           System.out.println("Invalid movie choice.");

        if (ticketPrice > 150) 
           System.out.println("book tickets");
        else 
          System.out.println("Insuffient money.");
    }
}

