package Visitor;

public class Warrior implements ICharacter {
    private String weapon = "";
    // ------------------------------
    public Warrior() {
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

