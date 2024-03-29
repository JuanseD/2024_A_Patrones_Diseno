package Iterator;

import java.util.Vector;

public class ConcreteAggregate implements Aggregate {
    protected Vector<String> data = new Vector<String>();

    public ConcreteAggregate() {
        this.fill();
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public void fill() {
        this.data.add("PABLO");
        this.data.add("CARLOS");
        this.data.add("MARIA JOSE");
        this.data.add("CAMILO");
    }
}

