package game;

// Concrete Strategies
class SwordAttack implements AttackStrategy {
    public void attack() {
        System.out.println("Attacking with Sword");
    }
}
class GunAttack implements AttackStrategy {
    public void attack() {
        System.out.println("Attacking with Gun");
    }
}
class MagicAttack implements AttackStrategy {
    public void attack() {
        System.out.println("Attacking with Magic");
    }
}
// Context
class GameCharacter {
    private AttackStrategy strategy;
    public void setAttackStrategy(AttackStrategy strategy) {
        this.strategy = strategy;
    }
    public void performAttack() {
        strategy.attack();
    }
}