package Iterator;

public class ConcreteIterator implements Iterator {
    private ConcreteAggregate aggregate;
    private int current_position = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        Object obj = null;
        if (!this.aggregate.data.isEmpty()) {
            this.current_position = 0;
            obj = this.aggregate.data.firstElement();
        }
        return obj;
    }

    @Override
    public Object next() {
        Object obj = null;
        if ((this.current_position) < this.aggregate.data.size()) {
            obj = this.aggregate.data.elementAt(this.current_position);
            this.current_position = this.current_position + 1;
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        boolean ok = false;
        if (this.current_position < (this.aggregate.data.size())) {
            ok = true;
        }
        return ok;
    }

    @Override
    public Object current() {
        Object obj = null;
        if (this.current_position < this.aggregate.data.size()) {
            obj = this.aggregate.data.elementAt(this.current_position);
        }
        return obj;
    }
}

