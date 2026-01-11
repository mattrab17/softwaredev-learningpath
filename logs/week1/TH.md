Warmup: find duplicate ints in an array

Brute Force Method:
-> I used two for-loops to traverse the array
Since there are n elements in the array, and for every 1 element we have to check every n element in the array, 
our time complexity is n x n = O(n^2)
->Much better to use for a small memory size

HashMap Method:
-> The Hashmap.containsKey and Hashmap.get() operations both take constant time because it uses a hash function quick index lookup
-> We are using a for-loop, which means that the n actions is determined by n array items
-> O(1) + O(n) = an overall time complexity of O(n)
->Much better to use for a large memory size

