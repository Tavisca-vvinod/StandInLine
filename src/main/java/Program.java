import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Program {
    public static void main(String[] args) {
        System.out.println(Arrays.equals(test( new int[] {0,0,0,0,0}),(new Integer[] {1,2,3,4,5}))? "PASS":"FAIL");
        System.out.println(Arrays.equals(test( new int[] {5,4,3,2,1,0}),(new Integer [] {6,5,4,3,2,1}))? "PASS":"FAIL");
        System.out.println(Arrays.equals(test( new int[] {6,1,1,1,2,0,0}),(new Integer [] {6,2,3,4,7,5,1}))? "PASS":"FAIL");
        System.out.println(Arrays.equals(test( new int[] {2,1,1,0}),(new Integer [] {4,2,1,3}))? "PASS":"FAIL");
    }
    public static Integer[] test(int[] left){
        List<List<Integer>> permutationsPossible = Permuter.permute(left);
        for(List<Integer> permutation:permutationsPossible)
        {
            int allClear=0;
            for (int i =0;i<permutation.size();i++)
            {
                int validRules=0;
                for(int j=0;j<i;j++)
                {
                    if(permutation.get(j)>permutation.get(i))
                    {
                        validRules++;
                    }
                }
                if(validRules==left[permutation.get(i)-1])
                {
                    allClear++;
                }
            }
            if(allClear==left.length)
            {
                Integer[] soldierSequence = permutation.toArray(new Integer[permutation.size()]);
                return soldierSequence;
            }
        }
        return null;
    }
}