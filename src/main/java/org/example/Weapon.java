package org.example;

public enum Weapon {
    SWORD(10,1),
    KNIFE(3,3),
    AXE(12,1);

    private int damage;
    private double attackSpeed;

    Weapon(int damage,double attackSpeed){
        this.damage=damage;
        this.attackSpeed=attackSpeed;
    }

    public int getDamage(){
        return damage;
    }
    public double getAttackSpeed(){
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
