import java.util.List;

public class SequenceFinder {
    public static Integer[] findSequence(int[] left){
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
