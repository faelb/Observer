public class Main {

    public static void main(String[] args) {

        Room loft = new Room();
        Room apartment = new Room();

        Kunde fischer = new Kunde();
        Kunde felber = new Kunde();
        Kunde bandic = new Kunde();


        loft.addObserver(felber);
        loft.addObserver(bandic);

        apartment.addObserver(fischer);


        loft.setOccupancy(false);
        apartment.setOccupancy(true);

        loft.broadcast(loft);
    }
}
