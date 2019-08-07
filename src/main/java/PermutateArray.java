import java.util.ArrayList;
import java.util.List;
public class PermutateArray {
    public static void main(String[] args) {
        test( new int[]{ 5, 4, 3, 2, 1, 0   });
    }
    public static void test(int[]array){
        PermutateArray permutateArray=new PermutateArray();
        List<List<Integer>> permutations = permutateArray.permute(array);
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
                for(int k:permutation)
                {
                    System.out.print(k+" ");
                }
                System.exit(0);
            }
        }
    }
    public List<List<Integer>> permute(int[] array) {
        int [] soldiers=new int[array.length];
        for(int i=0;i<array.length;i++)
        {
            soldiers[i]=i+1;
        }
        List<List<Integer>> list = new ArrayList<>();
        permuteHelper(list, new ArrayList<>(), soldiers);
        return list;
    }
    private void permuteHelper(List<List<Integer>> list, List<Integer> resultList, int [] arr){
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