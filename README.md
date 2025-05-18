# <center>HackerRank</center> 

## <center>Java 1D Array</center>

&nbsp;`[Java 1D Array](https://www.hackerrank.com/challenges/java-1d-array-introduction)`

An array is a simple data structure used to store a collection of data in a contiguous block of memory. Each element in the collection is accessed using an index, and the elements are easy to find because they're stored sequentially in memory.

Because the collection of elements in an array is stored as a big block of data, we typically use arrays when we know exactly how many pieces of data we're going to have. For example, you might use an array to store a list of student ID numbers, or the names of state capitals. To create an array of integers named *myArray* that can hold four integer values, you would write the following code:

    int[] myArray = new int[4]

This sets aside a block of memory that's capable of storing 4 integers. Each integer storage cell is assigned a unique index ranging from 0 to one less than the size of the array, and each cell initially contains a 0. In the case of *myArray*, we can store integers at indices 0, 1, 2, and 3. Let's say we wanted the last cell to store the number 12; to do this, we write:

    myArray[3] = 12;

Similiarly, we can print the contents of the last cell with the following:

    System.out.println(myArray[3]);

The code above prints the value stored at index 3 of *myArray*, which is 12 (the value we previously stored there). It's important to note that while Java initializes each cell of an array of integers with a 0, not all languages do this.


## <center>Java Date and Time</center> ##

<p>The Calendar class is an abstract class that provides methods for converting from a specific instance in time and a set of calendar fields such as YEAR, MONTH, DAY, HOUR, etc. for maninipulating the calendar fields such as getting the day of the week.</p>


<p>You are given a date. You need to write a method <i>getDay</i>, which returns the day of that date.</p>

<h5>Example</h5>
month = 8</br>
day = 14</br>
year = 2017</br>
returns MONDAY</br> 

`![Calendar for August 2017](https://s3.amazonaws.com/hr-assets/0/1514458312-c097047ed4-calendar_class.png)`

<center><img src='https://s3.amazonaws.com/hr-assets/0/1514458312-c097047ed4-calendar_class.png'></center>