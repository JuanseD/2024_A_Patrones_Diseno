package Visitor;

public class Wizard implements ICharacter {
    private String weapon = "";
    // ------------------------------
    public Wizard() {
    }
    // ------------------------------
    public String getWeapon() {
        return this.weapon;
    }
    // ------------------------------
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    // ------------------------------
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}

