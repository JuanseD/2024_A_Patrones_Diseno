package Visitor;

import java.util.List;

public interface IVisitor {
    public void visit(Wizard m);
    public void visit(Warrior g);
    public void visit(List<ICharacter> elementList);
}

