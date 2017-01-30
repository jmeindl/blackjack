/**
 * Binary search is more efficiant for finding an element than linear search.
 */
public class BinarySearch {
  
  
  public static void main(String[] args) { 
    int [] arr = {3,5,6,7,8,9};
    System.out.println(binarySearch(arr, 5));
  }
  //Uses binary search to find a number
  public static int binarySearch(int [] array, int target){
    int lo = 0;
    int hi = array.length - 1;
    int mid = (lo + hi)/2;
    while(lo <= hi){
      mid = (lo + hi)/2;
      if(array[mid] == target)
        return mid;
      else if(array[mid] < target)
        lo = mid + 1;
      else
        hi = mid - 1;
    }
    return -1;
      
  }
  
}
