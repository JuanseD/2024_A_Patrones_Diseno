package Observer;

import java.util.ArrayList;

public abstract class Subject {
    private ArrayList<IObserver> observers = new ArrayList<IObserver>();

    public Subject() {
    }

    public void addObserver(IObserver o) {
        observers.add(o);
        notifyObservers();
    }

    public void removeObserver(IObserver o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (IObserver obj : observers) {
            obj.update();
        }
    }
}

