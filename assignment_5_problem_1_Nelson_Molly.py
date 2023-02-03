#Assignment #5 problem number 1

#this gets the number from input
input_number = input("what is the number you want to factor?\n")

#this changes the number from a string to an integer
number = int(input_number)

#this creates a list from 1 to the number
factor_list = list(range(1, number+1, 1))

#this for loops goes through each number in the list and checks if the remainder is zero
tup = []
for factor in factor_list:
    if number % factor == 0:
        tup.append(factor)#if the remainder is zero, it adds the number to the new list

#this prints out the final answer in tuple form
print(tuple(tup))
