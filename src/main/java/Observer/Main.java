package Observer;

public class Main {
    public static void main(String[] args) {
        Observer objObserved = new Observer();
        ObserverImpl objObserverCristian = new ObserverImpl("Cristian");
        objObserved.addObserver(objObserverCristian);
        ObserverImpl objObserverJuan = new ObserverImpl("Juan");
        objObserved.addObserver(objObserverJuan);
        ObserverImpl objObserverCamilo= new ObserverImpl("Camilo");
        objObserved.addObserver(objObserverCamilo);
    }
}

