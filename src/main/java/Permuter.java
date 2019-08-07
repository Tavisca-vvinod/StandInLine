import java.util.ArrayList;
import java.util.List;
public class Permuter {
    public static List<List<Integer>> permute(int[] soldiers) {
        int [] soldierSequence=new int[soldiers.length];
        for(int i=0;i<soldiers.length;i++)
        {
            soldierSequence[i]=i+1;
        }
        List<List<Integer>> permutation = new ArrayList<>();
        permuteHelper(permutation, new ArrayList<>(), soldierSequence);
        return permutation;
    }
    private static void permuteHelper(List<List<Integer>> permutation, List<Integer> resultList, int [] soldierSequence){
        if(resultList.size() == soldierSequence.length){
            permutation.add(new ArrayList<>(resultList));
        }
        else{
            for(int i = 0; i < soldierSequence.length; i++){
                if(resultList.contains(soldierSequence[i]))
                {
                    continue;
                }
                resultList.add(soldierSequence[i]);
                permuteHelper(permutation, resultList, soldierSequence);
                resultList.remove(resultList.size() - 1);
            }
        }
    }
}
