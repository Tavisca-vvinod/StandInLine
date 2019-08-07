import java.util.ArrayList;
import java.util.List;
public class Permuter {
    public static List<List<Integer>> permute(int[] array) {
        int [] soldiers=new int[array.length];
        for(int i=0;i<array.length;i++)
        {
            soldiers[i]=i+1;
        }
        List<List<Integer>> list = new ArrayList<>();
        permuteHelper(list, new ArrayList<>(), soldiers);
        return list;
    }
    private static void permuteHelper(List<List<Integer>> list, List<Integer> resultList, int [] arr){
        if(resultList.size() == arr.length){
            list.add(new ArrayList<>(resultList));
        }
        else{
            for(int i = 0; i < arr.length; i++){
                if(resultList.contains(arr[i]))
                {
                    continue;
                }
                resultList.add(arr[i]);
                permuteHelper(list, resultList, arr);
                resultList.remove(resultList.size() - 1);
            }
        }
    }
}
