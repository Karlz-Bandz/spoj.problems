# spoj.problems
The Spoj problems and solutions

----------------------------------------------------------------------------------------------------------------

Module L_Jasiek

Input
Ten test cases (given one under another, you have to process all!). Each of the test cases is a series of lines. Each line consists of only one character. 
The letter P means the beginning of the description. The letter K means the end of the desription (and the test case). All other lines (if any) contain one
of the letters N, W, S or E (N meaning North, W - West, S - South and E - East). Every line of the description corresponds to the relative position of the 
centre of some square on the boundary of the picture. The first and the last line correspond to the same square. A letter in a line other than the first 
or the last tells you which way you have to go in order to get to the next boundary square when going around the picture anti-clockwise. Jasiek's description
finishes after going around the picture once. The length of the description doesn't exceed 20000 letters.

Output
For every testcase your program should write (to the standard output) only one line with one integer, equal to the number of coloured squares in Jasiek's
picture.

-----------------------------------------------------------------------------------------------------------------

Module M_Sum

In the first line, the number of tests t. In each of the following t lines, there is only one number 1 ≤ n ≤ 20

For each test, on separate lines, all possible sets of natural numbers whose elements add up to n. Strings should be given in lexicographical order, each string on one line.

Example
Input:
2
1
5

Output:
1

1 1 1 1 1 
1 1 1 2 
1 1 3 
1 2 2 
1 4 
2 3 
5 
----------------------------------------------------------------------------------------------------------------------


