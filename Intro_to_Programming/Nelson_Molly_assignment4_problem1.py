#Assignment #4 problem number 1

#gets the input from the user and then separates it into integers
user_input = input("What is the width and height?")
width_height = user_input.split(",")
width = int(width_height[0])
height = int(width_height[1])


#creates a grid list and then appends the right number of mini lists based on height
grid = []
for number in list(range(1, int(height)+1, 1)):
    grid.append([])
#adds the values into each mini list based on the width
row = 1
row_index = 1
for list_ele in grid:
    for num in list(range(row_index, row*width+1, 1)):
        list_ele.append(num)
    row_index += width
    row += 1

#creates an output file
output = open("outfile.txt", "w")
#adds the mini lists as a new line in the file. also removes the [,]
for list_ele in grid:
        output.write(str(list_ele).replace("[", "").replace("]", "")+"\n")
output.close()
