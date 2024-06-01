# 2024 FRQ Question 4
---
 # This question was about...
- A method giving a row and col for the next location, which can be either right or bottom, with conditons of the location being a lower value after checking grid or if it is at max row or max col then return the other neighbor.
- A method that creates a path and sums up the value of each block in the path by going to the neighbor that is given by the method above until it reaches `grid[grid.length - 1][grid[0].length -  1]`.
---
 # Struggles with this question...
- Creating the conditions for assessing the location that should be returned through if, else if, and else nested with an if and else.
- Recognizing a while loop has to be used and broken when reaching the end of the path then adding that value into the counted value. 
---
 # Prior experience that helped...
- The loop exercise with the while loop helped a lot since it helped with creating the while loop condition.
---
 # What I learned by doing this question...
- Tracking how the first method will be used in second method. The design of these two method can actually be used in games to accumulate energy usage for traveling certain paths.
