# StandInLine
Code Jam 

StandInLine 
     Soldiers at a training camp are ordered to stand in line each morning. They always choose their positions randomly to the displeasure of their supervisor. One evening, the soldiers learn that their strict supervisor has secretly recorded their standing positions from that morning, and that he will be checking their positions the next morning to make sure they are exactly the same.

Each soldier only remembers one thing from that morning: the number of people to his left that were taller than him. There are n soldiers, each with a different height between 1 and n, inclusive. Using this information, you must reconstruct the lineup from that morning.

You are given a int[] left, the ith element of which represents the number of taller soldiers to the left of the soldier with height i (where i is a 1-based index). Return a int[] containing the heights of the soldiers from left to right in the lineup. The input is guaranteed to produce a valid and unique output.
  
Definition 
Method signature: int[] Reconstruct(int[] left) 
  
Constraints 
- left will contain between 1 and 10 elements, inclusive. 
- left[i] will be between 0 and n-i-1, inclusive (where n is the number of elements in left, and i is a 0-based index). 
  
Examples 
1)  2, 1, 1, 0  
Returns: 4, 2, 1, 3  
The soldier of height 1 remembered there were 2 soldiers taller than him to his left. 
The soldier of height 2 remembered there was 1 soldier taller than him to his left. 
The soldier of height 3 remembered there was 1 soldier taller than him to his left. 
The soldier of height 4 remembered there was no solder taller than him to his left. 
The original order from left to right must have been 4, 2, 1, 3. 
This ordering satisfies all four conditions. For example, there are exactly two soldiers to the left of the soldier with height 1 that are taller than him (heights 4 and 2). A different ordering, like 4, 3, 1, 2, satisfies some, but not all of the four conditions. In this incorrect ordering, there are two soldiers to the left of the soldier with height 2 that are taller than him (heights 4 and 3), but the input states that there was only one.  

2)  0, 0, 0, 0, 0  
Returns: 1, 2, 3, 4, 5  
 
3)  5, 4, 3, 2, 1, 0  
Returns: 6, 5, 4, 3, 2, 1 
  
4)  6, 1, 1, 1, 2, 0, 0 
Returns: 6, 2, 3, 4, 7, 5, 1
 
 
