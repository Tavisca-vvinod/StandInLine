import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class PermutateArray {
    public static void main(String[] args) {
        System.out.println(Arrays.equals(test( new int[] {0,0,0,0,0}),(new int [] {1,2,3,4,5}))? "PASS":"FAIL");
        System.out.println(Arrays.equals(test( new int[] {5,4,3,2,1,0}),(new int [] {6,5,4,3,2,1}))? "PASS":"FAIL");
        System.out.println(Arrays.equals(test( new int[] {6,1,1,1,2,0,0}),(new int [] {6,2,3,4,7,5,1}))? "PASS":"FAIL");
        System.out.println(Arrays.equals(test( new int[] {2,1,1,0}),(new int [] {4,2,1,3}))? "PASS":"FAIL");
    }
    public static int[] test(int[]array){
        List<List<Integer>> permutations = Permuter.permute(array);
        for(List<Integer> permutation:permutations)
        {
            int allClear=0;
            for (int i =0;i<permutation.size();i++)
            {
                int high=0;
                for(int j=0;j<i;j++)
                {
                    if(permutation.get(j)>permutation.get(i))
                    {
                        high++;
                    }
                }
                if(high==array[permutation.get(i)-1])
                {
                    allClear++;
                }
            }
            if(allClear==array.length)
            {
                int[] permuttation=convertToArray(permutation);
                return permuttation;
            }
        }
        return null;
    }

    private static int[] convertToArray(List<Integer> permutation) {
        int[] permuttation=new int [permutation.size()];
        for(int i=0;i<permutation.size();i++)
        {
            permuttation[i]=permutation.get(i);
        }
        return permuttation;
    }

}