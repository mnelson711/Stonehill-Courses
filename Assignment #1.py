# this program will determine the remanding change value of an input

#define the monetary value
value = 78.99
#this will change the value from a float to an integer
floor_value = value // 1

#this will determine the change left over by subtracting the new number
#from the old number and multiplying that by 100 so its no longer a decimal
cents = (value - floor_value) * 100
#this makes sure that the cent amount will never be rounded down or up
cents = round(cents)
#
print(cents)
