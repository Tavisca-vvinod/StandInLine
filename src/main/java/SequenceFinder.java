public class SequenceFinder {
    public static Integer[] findSequence(int[] left){
        Integer [] soldierSequene=new Integer[left.length];
        for(int i=0;i<left.length;i++)
        {
            soldierSequene[i]=-1;
        }
        for(int i=0;i<left.length;i++)
        {
            int numberOfBlanksNeeded=left[i];
            int availBlanks=0;
            for(int j=0;j<soldierSequene.length;j++)
            {
                if(soldierSequene[j]==-1)
                {
                    availBlanks++;
                    if(availBlanks==numberOfBlanksNeeded+1){
                        soldierSequene[j]=i+1;
                        break;
                    }
                }
            }
        }
        return soldierSequene;
    }
}
