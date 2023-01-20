import java.util.Random;

public class Enemy {

    public String _enemyName;
    public Enemy(String enemy) {
    _enemyName = enemy;
    }

    public void makeEvilIntroduction() {
        System.out.println("I'm "+ _enemyName+"!");
    }

    public void attack(Billionaire billionaire) {
        Random rand = new Random();
        double decyzja = rand.nextDouble();
        if (decyzja > 0.5) {
            billionaire.danger = true;
        }
    }
}
