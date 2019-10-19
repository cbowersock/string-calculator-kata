# string-calculator-kata

Create a simple StringCalculator class with a method int add(String numbers).

Step 1
The numbers variable that is passed to the add method accepts a comma-delimited list of numbers that should be added together. The string may contain 0, 1, or 2 numbers. The value returned by the add method will be the sum of the numbers provided in the string.

If an empty string is provided, 0 should be returned, if only number is provided in the string, then the number should be returned, and if two numbers are provided, the sum of the two numbers will be returned.

Step 2
Adding two numbers together is great, but it would be even better if we could add an unlimited amount of numbers together.

Modify the add method to handle an unknown amount of numbers.

Step 3
Allow the add method to handle new line characters between numbers (instead of commas).

Step 4 (Bonus)
Add support for input delimeters. To change a delimiter, the beginning of the string will contain a separate line that is prefixed with //. For example, "//delimeter\n[numbers,...]". The input delimiter is optional.
