class UnfitTraineesException extends Exception {
    public UnfitTraineesException(String message) {
        super(message);
    }
}

public class qs3_2 {
    public static void main(String[] args) {
        int[][] oxygenLevels = {
            {75, 80, 85}, // Trainee 1
            {60, 65, 70}, // Trainee 2
            {78, 80, 82}  // Trainee 3
        };
       
        try {
            findFittestTrainees(oxygenLevels);
        } catch (UnfitTraineesException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void findFittestTrainees(int[][] oxygenLevels) throws UnfitTraineesException {
        int[] averages = new int[oxygenLevels.length];
        int maxAvg = 0;

        for (int i = 0; i < oxygenLevels.length; i++) {
            int sum = 0;
            for (int j = 0; j < oxygenLevels[i].length; j++) {
                if (oxygenLevels[i][j] < 1 || oxygenLevels[i][j] > 100) {
                    throw new IllegalArgumentException("Oxygen levels must be between 1 and 100");
                }
                sum += oxygenLevels[i][j];
            }
            averages[i] = sum / oxygenLevels[i].length;
            if (averages[i] > maxAvg) {
                maxAvg = averages[i];
            }
        }

        if (maxAvg < 70) {
            throw new UnfitTraineesException("All trainees are unfit. Average oxygen level is below 70.");
        } else {
            System.out.println("Fittest Trainee(s):");
            for (int i = 0; i < averages.length; i++) {
                if (averages[i] == maxAvg) {
                    System.out.println("Trainee " + (i + 1) + " with average oxygen level: " + maxAvg);
                }
            }
        }
    }
}
