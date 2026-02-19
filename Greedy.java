import java.util.Arrays;
import java.util.ArrayList;
public class Greedy {
    public static void greedycoins(int[] coins, int amount){
        int count=0;
        Arrays.sort(coins);
        ArrayList<Integer> used = new ArrayList<>();
        for(int i=coins.length-1;i>=0;i--){
            while(amount>=coins[i]){
                amount-=coins[i];
                count++;
                used.add(coins[i]);
            }
        }
        if(amount!=0){  
            System.out.println("Can't make amount");
        }else{
            System.out.println("Coins used: " + used);
            System.out.println("Total coins: " + count);
        }
    }
    public static void main(String[] args){
        int[] coins={10, 34, 43, 2, 5, 1};
        int amount=45;
        greedycoins(coins,amount);
    }
}
