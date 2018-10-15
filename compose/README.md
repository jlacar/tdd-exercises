Compose Method Example
======================

Scenario
--------

Your teammate, Dwight, is out with the flu and is expected to be unavailable for the next three to four days. In the meantime, you have volunteered to pick up the work he was doing before he got sick. 

Before he got sick, Dwight was working on a class that was intended to hold a variable number of objects. (Note: For this example, assume there is a valid reason to not use any standard library classes from the java.util package for this functionality).

Dwight had some code written. You need to understand what Dwight has written and add some functionality to it. 

The requirements for this class:

1. This is going to be an expandable list. It starts out with 10 elements when first instantiated, then gets an additional 10 elements each time it gets full.
2. You can add one element at a time or you can add multiple elements at a time.
3. You can make the list read only at any time. 
4. You can make the list writeable at any time.
5. If the list is read only, you will not be able to add new elements to it.