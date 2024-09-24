package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name=name;
        this.healthPercentage=healthPercentage>100?100:(healthPercentage<0?0:healthPercentage);
        this.weapon=weapon;
    }

    public int getHealthPercentage() {
        return healthPercentage;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setHealthPercentage(int healthPercentage) {
        this.healthPercentage = healthPercentage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int healthRemaining(){
        return healthPercentage;
    }

    public void loseHealth(int damage){
        this.healthPercentage=this.healthPercentage-damage;
        if (this.healthPercentage<0){
            healthPercentage=0;
            System.out.println(name+" player has been knocked out of the game");
        }

    }

    public void restoreHealth(int healthPotion){
        healthPercentage=healthPercentage+healthPotion;
        healthPercentage=healthPercentage>100?100:healthPercentage;
    }
}
