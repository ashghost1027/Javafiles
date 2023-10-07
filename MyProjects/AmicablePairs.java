import java.util.ArrayList;
import java.util.List;

class AmicablePairs {
    public int factorSum(int m){
        List<Integer> factors = new ArrayList<>();
        for(int i = 1; i < m; i++){
            if(m % i == 0){
                factors.add(i);
            }
        }
        int sum = 0;
        for (int factor : factors){
            sum += factor;
        }
        return sum;
    }

    public static void main(String[] args){
        List<Integer> pairs = new ArrayList<>();
        AmicablePairs pair = new AmicablePairs();
        for (int i = 1; i <= 200000; i++){
            for (int j = i + 1; j <= 200000; j++){
                if (pair.factorSum(i) == j && pair.factorSum(j) == i){
                    pairs.add(i);
                    pairs.add(j);
                }
            }
        }
        System.out.println("Pairs= "+pairs);
    }
}

