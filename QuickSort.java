// Team Barry-Allen -- Ryan Siu, Edwin Mok, Mark Shafran
// APCS2 pd5
// Lab 01 -- What Does the Data Say?
// 2017-03-09

/*****************************************************
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place
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
