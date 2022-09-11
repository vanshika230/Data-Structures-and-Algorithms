class Rotate_Array { 
    public static void reverse(int[] a, int li, int ri){
        while(li < ri){
          int temp = a[li];
          a[li]= a[ri];
          a[ri] = temp;
          
          li++;
          ri--;
        }
      }
    
    public void rotate(int[] nums, int k) {
     
        k = k % nums.length;
        if(k < 0){
          k += nums.length;
        }
    
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
      }

    }

/*
 * Time Complexity: O(n)

This is because we have to traverse the array and its parts to reverse it. 
So, the time complexity for reversing the array and its parts will be O(n) + O(n) + O(n)=O(n).


SPACE COMPLEXITY: O(1)
as we have not used any extra space
 */
        
        