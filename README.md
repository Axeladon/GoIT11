# TITLE

## Task1
The method takes a list of names as input. It is required to return a string in the format "1. Ivan, 3. Peter..." with only those names that are at odd indices (1, 3, etc.).

## Task2
The method takes a list of strings as input (you can use the list from Task 1). It returns a list of these strings in uppercase and sorted in descending order (from Z to A).

## Task3
There is an array:
```
["1, 2, 0", "4, 5"]
```
You need to obtain all the numbers from the array and print them in sorted order separated by a comma, for example:
```
"0, 1, 2, 4, 5"
```

## Task4
Using ```Stream.iterate```, create an infinite stream of random numbers without using ```Math.random()```.

Implement your own linear congruential generator. To do this, start with ```x[0] = seed```, and then calculate each subsequent element using a formula like ```x[n + 1] = 1 (a x[n] + c) % m``` for valid values of ```a```, ```c```, and ```m```.

You need to implement a method that takes parameters ```a```, ```c```, and ```m``` as input and returns a Stream<Long>.

For testing, use the following data:
<ul>
  <li><code>a = 25214903917</code></li>
  <li><code>c = 11</code></li>
  <li><code>m = 2^48</code></li>
</ul>

## Task5
Write a method public static ```<T> Stream<T> zip(Stream<T> first, Stream<T> second)``` that "zips" the elements from the first and second streams, stopping when one of the streams runs out of elements.
