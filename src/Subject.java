import java.util.ArrayList;

public class Subject{

    private ArrayList<Observer> observerArrayList=new ArrayList<>();

    public void addObserver(Observer observer){
        observerArrayList.add(observer);
    }
    public void removeObserver(Observer observer){
        observerArrayList.remove(observer);
    }
    public void broadcast(Subject subject){
        for (Observer observer:observerArrayList) {
        observer.getUpdate(subject);
        }
    }

}
