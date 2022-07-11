public class Simulation {

    int numberOfDies;
    int numberOfTosses;

    public static void main(String[] args) {

        Simulation sim = new Simulation(2, 1000000);

        Dice dice = new Dice(2);
        Bins bins = new Bins(2,12);

        sim.runSimulation(dice, bins);
        sim.printResults(bins);


//        Bins bin = new Bins(1,10);
//        bin.incrementBin(5);
//        bin.incrementBin(5);
//        Integer five = bin.getBin(5);
//        System.out.println(five);


    }

    public Simulation (int numberOfDies, int numberOfTosses) {
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
    }

    public void runSimulation(Dice dice, Bins bins) {
        //we are trying to roll the dies a number of times.
        //in that number of times, we are getting the sum of the dies and storing them.
        //we store the result aka sum, by incrementing the Bins.
        for (int i = 1; i <= numberOfTosses; i++) {
            Integer result = dice.tossAndSum();
            bins.incrementBin(result);
        }
    }
    public void printResults(Bins bins) {
        // you have your bin, you have to call every single rsult possible and print out what the nmber is for eah resule. do a string  "
        System.out.println(String.format("***\n" +
                "Stimulation of %d dice tossed for %d times.\n" +
                "***\n \n" +
                " 2 : %8d:%5.2f ** \n" +
                " 3 : %8d:%5.2f ***** \n" +
                " 4 : %8d:%5.2f ******** \n" +
                " 5 : %8d:%5.2f *********** \n" +
                " 6 : %8d:%5.2f ************* \n" +
                " 7 : %8d:%5.2f **************** \n" +
                " 8 : %8d:%5.2f ************* \n" +
                " 9 : %8d:%5.2f *********** \n" +
                "10 : %8d:%5.2f ******** \n" +
                "11 : %8d:%5.2f ***** \n" +
                "12 : %8d:%5.2f ** \n" , this.numberOfDies, this.numberOfTosses,
                bins.getBin(2), (double)bins.getBin(2)/numberOfTosses,
                bins.getBin(3), (double)bins.getBin(3)/numberOfTosses,
                bins.getBin(4), (double)bins.getBin(4)/numberOfTosses,
                bins.getBin(5), (double)bins.getBin(5)/numberOfTosses,
                bins.getBin(6), (double)bins.getBin(6)/numberOfTosses,
                bins.getBin(7), (double)bins.getBin(7)/numberOfTosses,
                bins.getBin(8), (double)bins.getBin(8)/numberOfTosses,
                bins.getBin(9), (double)bins.getBin(9)/numberOfTosses,
                bins.getBin(10), (double)bins.getBin(10)/numberOfTosses,
                bins.getBin(11), (double)bins.getBin(11)/numberOfTosses,
                bins.getBin(12), (double)bins.getBin(12)/numberOfTosses)
        );
    }
}
