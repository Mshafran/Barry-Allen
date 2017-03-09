// Ryan Siu
// APCS2 pd5
// HW15 -- So So Quick
// 2017-03-08

/*****************************************************
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr): Run partition on an array, break the array into subarrays on
 *             either side of the number placed in the correct index, and 
 *             run partition on each of the subarrays. Repeat.
 *
 * 2a. Worst pivot choice / array state and associated runtime: 
 *     When the chosen pivot value is moved to either extreme of the array.
 *     O(n^2)
 *
 * 2b. Best pivot choice / array state and associated runtime: 
 *     When the chosen pivot value is moved to the middle of the array.
 *     O(nlogn)
 *
 * 3. Approach to handling duplicate values in array: 
 *    Duplicates are already handled by the partition method; they are put to
 *     the left of the partitioned array.
 *
 *****************************************************/

public class QuickSort 
{
    //--------------v  HELPER METHODS  v--------------
    //swap values at indices x, y in array o
    public static void swap( int x, int y, int[] o ) {
	int tmp = o[x];
	o[x] = o[y];
	o[y] = tmp;
    }
    //--------------^  HELPER METHODS  ^--------------



    /*****************************************************
     * void qsort(int[])
     * @param d -- array of ints to be sorted in place
     *****************************************************/
    public static void qsort( int[] d ) 
    { 
	qsort( d, 0, d.length - 1);
    }

    // Thinkers are encouraged to roll their own subroutines.
    // Insert your auxiliary helper methods here.


    // Helper method for wrapper
    public static void qsort( int[] d, int left, int right ) 
    { 
	if (left < right) {
	    int pvtPos = partition( d, left, right, left); // last param doesn't matter
	    qsort( d, left, pvtPos - 1);
	    qsort( d, pvtPos + 1, right);
	}
    }


    // Partition method
    public static int partition( int arr[], int left, int right, int pivPos)
    {
	int pivVal = arr[pivPos];

	swap( pivPos, right, arr );
	int s = left;

	for( int i = left; i < right; i++ ) {
	    if ( arr[i] <= pivVal) {
		swap( i, s, arr );
		s++;}
	}
	swap( s, right, arr);

	return s;
    }

}//end class QuickSort
