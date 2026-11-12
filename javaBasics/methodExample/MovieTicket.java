package methodExample;

public class MovieTicket {
    String movieName;
    int ticketPrice;

    MovieTicket(String movieName, int ticketPrice){
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
    }
    MovieTicket(){
        System.out.println("Default constructor");
    }

   void bookTicket(){
        System.out.println("Booking ticket for movie: " + movieName);
        System.out.println("Ticket price: " + ticketPrice);
    }
    void bookTicket(String movieName, int ticketPrice){
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        System.out.println("Booking ticket for movie: " + movieName);
        System.out.println("Ticket price: " + ticketPrice);
    }
    void bookTicket(String movieName){
        this.movieName = movieName;
        System.out.println("Booking ticket for movie: " + movieName);
        System.out.println("Ticket price: " + ticketPrice);
    }
    void calculatePrice(){
        System.out.println("Total price for movie: " + movieName + " is: " + ticketPrice);
    }

    class RegularTicket extends MovieTicket{
        RegularTicket(String movieName, int ticketPrice){
           this.movieName = movieName;
            this.ticketPrice = ticketPrice;
        }
        @Override 
        void calculatePrice(){
            System.out.println("Total price for regular ticket for movie: " + movieName + " is: " + ticketPrice);
        }
    }
    class PremiumTicket extends MovieTicket{
        PremiumTicket(String movieName, int ticketPrice){
            this.movieName = movieName;
            this.ticketPrice = ticketPrice;
        }
        @Override 
        void calculatePrice(){
            System.out.println("Total price for premium ticket for movie: " + movieName + " is: " + ticketPrice);
        }
    }
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Inception", 150);
        ticket1.bookTicket();
        ticket1.calculatePrice();

        MovieTicket ticket2 = new MovieTicket();
        ticket2.bookTicket("Interstellar", 200);
        ticket2.calculatePrice();

        RegularTicket regularTicket = ticket1.new RegularTicket("The Dark Knight", 100);
        regularTicket.calculatePrice();

        PremiumTicket premiumTicket = ticket1.new PremiumTicket("Batman Begins", 250);
        premiumTicket.calculatePrice();
    }
}

