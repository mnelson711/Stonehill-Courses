# this program will determine the remanding change value of an input

#define the monetary value with an input
initial_value = input("What is the value?\n")
#change the input value to a float
value = float(initial_value)
#this will change the value from a float to an integer
new_value = value // 1

#this will determine the change left over by subtracting the new integer
#from the old float and multiplying that by 100 so its no longer a decimal
cents = (value - new_value) * 100
#this makes sure that the cent amount will never be rounded down or up
cents = round(cents)
#this prints out the cent
print(cents)
