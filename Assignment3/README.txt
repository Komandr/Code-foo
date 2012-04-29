
The first thing I did was to draw a tree with the relevant values:

			0
		       / \
		     10   26
		    /  \ /  \
		  100  260  676
		 /  \ /  \ /   \
	      1000 2600  6760  17576
			...
			etc.


What is the best way to get through this tree and find the best value?

The population is the input, given by the user.

The next step is, to go into the methode calculate(int number, int letter), where:
	number = #num-patterns needed for one plate
	letter = #letter-patterns

In calculate, I calculate all possibilities that are greater than my given population.
I've got a tree structure, where I go through the tree and stop with that branch,
when I found all values that are greater than my given population.


One example with 25 to make clear what I do:

The user gives me the input 25. Let's have a look at the tree:
			0
		       / \
		     10   26
		    /  \ /  \
		  100  260  676

I go through the tree, first left.
Is 10 > 25?
No, so I go to the next level.

Is 100 > 25?
Yes! So write it in an array. Stop this branch.

Next branch:
Is 260 > 25?
Yes! Write in array, stop branch.

Let's go back to the root and take a look at the right branch.
Is 26 > 25?
Yes! Write in array, stop branch.

Next, I compare all values in the branch and return the one that's the smallest,
because that's the one that produces the least excess plates.


Back to the array:
I don't actually store values in the array, because how would I know how many number- and how many letter-patterns
I would need for this one value?
I store the number of number- and letter-plates in my array. For our example from above (25) this would be:

Store value 100 -> [2 | 0] because there are 2 number-, but no name-plates used.
store 260 -> [1 | 1] and store 26 -> [0 | 1]

The End :)