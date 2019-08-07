import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        System.out.println(Arrays.equals(SequenceFinder.findSequence( new int[] {0,0,0,0,0}),(new Integer[] {1,2,3,4,5}))? "PASS":"FAIL");
        System.out.println(Arrays.equals(SequenceFinder.findSequence( new int[] {5,4,3,2,1,0}),(new Integer [] {6,5,4,3,2,1}))? "PASS":"FAIL");
        System.out.println(Arrays.equals(SequenceFinder.findSequence( new int[] {6,1,1,1,2,0,0}),(new Integer [] {6,2,3,4,7,5,1}))? "PASS":"FAIL");
        System.out.println(Arrays.equals(SequenceFinder.findSequence( new int[] {2,1,1,0}),(new Integer [] {4,2,1,3}))? "PASS":"FAIL");
    }
}