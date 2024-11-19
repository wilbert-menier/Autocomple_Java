In this project I had to implement 3 ADTs: Term, BinarySearchDeluxe, and Autocomplete. The main purpose for this was to determine the frequency of a certain prefix-say "java"-in a text; The prefix can also be the first n characters in a word. In the first ADT, Term, I defined two constructors that takes a query/prefix and weight and I had to sort the query by lexicographic and by reverse-weight order. In the second ADT, BinaryrSearchDeluxe, I had to modify the original binary search ADT in order to find the first and last index and frequency of a certain prefix. To make that happen I had to save the index of the first prefix found and keep on searching and update it if a new index was found. Finally, in AutoComplete I had to use the methods from Term And BinarySearchDeluxe in order to find the amount of matches and words that matches a particular prefix. For example if the prefix is "Sea" the output will be all the words that starts with "Sea" in reverse weight order.
