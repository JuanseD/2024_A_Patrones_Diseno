package Visitor;

import java.util.List;

public class EquipWeapon implements IVisitor {
    @Override
    public void visit(Wizard m) {
        m.setWeapon("DAGGER");
    }

    @Override
    public void visit(Warrior g) {
        g.setWeapon("SWORD");
    }

    @Override
    public void visit(List<ICharacter> characters) {
        for (ICharacter c : characters) {
            c.accept(this);
        }
    }
}

