# Barry-Allen

##**How it Works**

The quick sort algorithm

##**Prodecure**


##**Big O Classification**
From out results, on average, quick sort is O(nlogn).

Best case:
Average case:
However, the worst case scenario is <>.

Please refer to [here](https://docs.google.com/spreadsheets/d/1cPhpooQ144SA3srdUaYbCKzZDRhlfPsNmp4NApKldMg/pubhtml) for graphs showing runtimes.

##**Data Gathered**
Mean execution times for dataset of size n:

Batch size: 100

  n        | time (ms)
  -------- | ---------
  1        | 0
  10       | 0
  100      | 0
  1000     | 0
  5000     | 0
  10000    | 
  50000    | 
  100000   | 
  500000   | 
  1000000  | 
  2500000  | 
  5000000  | 
  7500000  | 
  10000000 | 

##**Analysis**
On [this spreadsheet](https://docs.google.com/spreadsheets/d/1cPhpooQ144SA3srdUaYbCKzZDRhlfPsNmp4NApKldMg/pubhtml), we have graphed a O(n) and O(nlogn) run times. It is clear from the expected runtime graph that a linear runtime is faster than a loglinear one, which is much faster than a quadratic runtime. Therefore, we expected a similar result from our tests. When graphed, our results matched what we expected: quadratic by far the slowest with loglinear next, and linear runtime the fastest. One interesting idea to note from the graph of our results is that the linear runtime appears to be a constant of 0. However, when multiplied by a constant, a more linear graph is seen (we can do this because O(n) times O(1) = O(n) ). 

##**Pivot Arrangement**

##**Conclusion**##
Our results show clearly that the graph of the quick sort reuntime is a translation of a loglinear graph, and therefore the algorithm is O(nlogn).
