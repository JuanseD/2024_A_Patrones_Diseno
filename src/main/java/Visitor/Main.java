package Visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Warrior g1 = new Warrior();
        Warrior g2 = new Warrior();
        Wizard m1 = new Wizard();
        Wizard m2 = new Wizard();
        List<ICharacter> characters = new ArrayList<ICharacter>();
        characters.add(g1);
        characters.add(g2);
        characters.add(m1);
        characters.add(m2);
        IVisitor weaponVisitor = new EquipWeapon();
        weaponVisitor.visit(characters);
        System.out.println("Weapon of warrior g1: " + g1.getWeapon());
        System.out.println("Weapon of warrior g2: " + g2.getWeapon());
        System.out.println("Weapon of wizard m1: " + m1.getWeapon());
        System.out.println("Weapon of wizard m2: " + m2.getWeapon());
    }
}

