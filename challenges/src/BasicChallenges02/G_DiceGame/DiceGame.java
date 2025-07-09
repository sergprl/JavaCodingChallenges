package BasicChallenges02.G_DiceGame;

import java.util.Arrays;
import java.util.HashMap;

public class DiceGame {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(diceGameSimulation(10)));
    }

    public static HashMap[] diceGameSimulation(int numSimulations) {
        // create the results array
        HashMap[] results = new HashMap[numSimulations];

        for (int i = 0; i < numSimulations; i++) {
            HashMap<String, Integer> simulation = new HashMap<>();

            // throw both dice
            int dice1 = throwDice();
            int dice2 = throwDice();

            // find the sum
            int sum = dice1 + dice2;

            // analyze the results, 1 = win, 0 = lose, 2 = roll again
            int result;
            if (sum == 7 || sum == 11) {
                result = 1;
            } else if (sum == 2 || sum == 3 || sum == 12) {
                result = 0;
            } else {
                result = 2;
            }

            // save the result
            simulation.put("dice1", dice1);
            simulation.put("dice2", dice2);
            simulation.put("sum", sum);
            simulation.put("result", result);

            results[i] = simulation;
        }

        return results;
    }

    public static int throwDice() {
        return (int) (Math.random() * 6) + 1;
    }
}
