import java.util.Random;

public class Dice {

    Integer numOfDice;

    Random rand = new Random();

    public Dice(Integer numOfDice) {
        this.numOfDice = numOfDice;
    }

    public Integer tossAndSum() {
//        Dice dice = new Dice(2);
//        Integer toss = dice.tossAndSum();

        int sum = 0;
        for (int i = 1; i <= numOfDice; i++) {
            //this is a for loop to figure out what side the dice lands on.
            sum = sum + rand.nextInt(1,7);
        }
        return sum;
    }
}
