public class Kunde implements Observer{

    @Override
    public void getUpdate(Subject s) {
        if(s instanceof Room){
            System.out.println("Der Raum ist " +((Room) s).isOccupancy());
        }
    }
}
