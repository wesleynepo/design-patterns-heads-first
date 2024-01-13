package ChapterOne;

public abstract class Character {
    WeaponBehavior weapon;

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    void fight() {
        this.weapon.useWeapon();
    }
}
