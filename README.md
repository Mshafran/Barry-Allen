# Barry-Allen

##**How it Works**

The quick sort algorithm works by running the partition method on an array, breaking the array into subarrays on either side of the now-correctly-placed number, and running partition on each of the subarrays. This process is repeated with each subarray acting as a new array, until all of the subarrays consist of only one element, at which point the array is sorted.

The partition method takes an input pivot index, which contains the pivot value. This pivot value is put into its final resting position after partition is called, and the position of the final resting position is returned.

##**Procedure**

Our timing mechanism works by going through an array of specificed n-values, recording the average time of the sorts on randomly-generated arrays of each n-value, and printing the n-values and their corresponding times in a neat format once all the sorts are finished. We used a batch size of 100 in order to ensure that outliers don't affect the time of the sort, and we made sure to eliminate as much "noise" from the results as possible by only measuring the time it takes to run the ```qsort``` method. Additionally, the O(n) and O(n^2) methods that were written for reference simply perform O(1) operations on randomly-generated arrays n and n^2 times, correspondingly.

##**Pivot Arrangement and Data Arrangement**
(maybe move the explanations for Big O Classification here)

##**Big O Classification (abstract)**

The best case runtime is O(nlogn), which is when the chosen pivot value is always swapped to the middle of the (sub)array.

The average case runtime is also O(nlogn), because assuming that the pivot value is not swapped to the two extremes or the middle, which means that it would be somewhere in between the extremes and the middle. In that case, we do not have to swap it n^2 times, since that is the runtime for the worst case scenario, and the average runtime would lie somewhere in between nlogn and n^2. Mathematically speaking, the runtime for the best case scenario would be n * log base 2 of n, since the pivot position would split the array into 2 subarrays of half the length, but since the average case does not always account for the best case scenario, the average case runtime would be n * log of some other base smaller than 2 of n, therefore would result in more splits in order to sort the array, but not as extreme as the worst case scenario, therefore it is still O(nlogn) runtime even if the base for logn is different. 

However, the worst case scenario is O(n^2), which is when the chosen pivot value is always swapped to the two extremes of the (sub)array.

##**Data Gathered**
Mean execution times for dataset of size n:

Batch size: 100

  n        | time (ms)
  -------- | ---------
  1        | 0.00
  10       | 0.01
  100      | 0.04
  1000     | 0.11
  5000     | 0.21
  10000    | 0.61
  50000    | 3.59
  100000   | 7.50
  500000   | 41.69
  1000000  | 87.33
  2500000  | 230.48
  5000000  | 480.11
  7500000  | 737.52
  10000000 | 1001.56
  
Refer to sheet 2 [here](https://docs.google.com/spreadsheets/d/1cPhpooQ144SA3srdUaYbCKzZDRhlfPsNmp4NApKldMg/pubhtml) for all the sets of data.

##**Analysis**
On [this spreadsheet](https://docs.google.com/spreadsheets/d/1cPhpooQ144SA3srdUaYbCKzZDRhlfPsNmp4NApKldMg/pubhtml), we have graphed a O(n) and O(nlogn) run times. It is clear from the expected runtime graph that a linear runtime is faster than a loglinear one, which is much faster than a quadratic runtime. Therefore, we expected a similar result from our tests. When graphed, our results matched what we expected: quadratic by far the slowest with loglinear next, and linear runtime the fastest. One interesting idea to note from the graph of our results is that the linear runtime appears to be a constant of 0. However, when multiplied by a constant, a more linear graph is seen (we can do this because O(n) times O(1) = O(n) ). 

##**Conclusion**##
Our results show clearly that the graph of the quick sort runtime is a translation of a loglinear graph, and therefore the algorithm is O(nlogn).
