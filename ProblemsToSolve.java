public class ProblemsToSolve {
    public int maximumNumberOfPeopleToTourWith(int numberOf5Seaters, int numberOf7Seaters) {
        return numberOf5Seaters * 5 + numberOf7Seaters * 7;
    }

    public String sumOfSubarray(int[] array) {
        int countOfOdd = 0;
        int countOfEven = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                countOfEven++;
            } else {
                countOfOdd++;
            }
        }
        if (countOfOdd % 2 != countOfEven % 2) {
            return "YES";
        } else {
            return "NO";
        }

    }

    public int expensiveSteps(final int N, int x1, int y1, int x2, int y2) {
        int steps = 0;
        int inGridDifferenceX = Math.abs(x1 - x2);
        int inGridDifferenceY = Math.abs(y2 - y2);
        int outGridDifferenceX = x1;
        int outGridDifferenceY = y1;
        int distanceTravelledInGrid = inGridDifferenceX + inGridDifferenceY;
        int distanceToOutsideTheGrid = outGridDifferenceX + outGridDifferenceY;
        if (distanceToOutsideTheGrid > distanceTravelledInGrid) {
            steps = distanceTravelledInGrid;
        } else {
            steps = distanceToOutsideTheGrid + inGridDifferenceX < inGridDifferenceY ? inGridDifferenceX
                    : inGridDifferenceY;
        }

        if (steps > distanceTravelledInGrid) {
            return distanceTravelledInGrid;
        } else {
            return steps;
        }
    }

    public int optimalWayToPissSomeoneOff(final int N, final int K) {

        int[] jigsawPuzzle = new int[N];
        for (int i = 0; i < N; i++) {
            jigsawPuzzle[i] = i + 1;
        }
        if (N == 0)
            return 0;
        if (N <= K) {
            if (N % 2 == 1)
                return N - 1 + N / 2;
            return N;
        }
        int maximumAngriness = 0;
        for (int i = 0; i < K; i++) {
            jigsawPuzzle[jigsawPuzzle.length - (i + 1)] -= jigsawPuzzle[i];
            jigsawPuzzle[i] += jigsawPuzzle[jigsawPuzzle.length - (i + 1)];
            maximumAngriness += jigsawPuzzle.length - 1;
        }

        int n = jigsawPuzzle.length - K * 2;
        maximumAngriness += n * K;
        return maximumAngriness;

    }

    public static void main(String[] args) {
        ProblemsToSolve problems = new ProblemsToSolve();
        int max = problems.optimalWayToPissSomeoneOff(8, 3);
        System.out.println(max);
        // String something = "ab";
        // System.out.println(something.hashCode());
    }

}
