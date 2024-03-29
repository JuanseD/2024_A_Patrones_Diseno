package Iterator;

public class Client {
    public static void main(String[] args) {
        try {
            ConcreteAggregate aggregate = new ConcreteAggregate();
            Iterator iterator = aggregate.createIterator();
            String obj = (String) iterator.first();
            System.out.println(obj);
            iterator.next();
            iterator.next();
            System.out.println((String) iterator.current() + "\n");
            iterator.first();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

