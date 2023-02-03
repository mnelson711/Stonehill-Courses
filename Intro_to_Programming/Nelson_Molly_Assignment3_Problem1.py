#this program will rewrite each word backwards

#takes the input string
string = input("Enter your string here:\n")

#makes the input a list
new_list = string.split(" ")

#make an empty list
reversed_list = []

#this loop will add the letters to the reversed_list
for letter in new_list:
    reversed_list.append(letter[::-1]) #use splice

#this will turn the reversed list into a string
output_string = " ".join(reversed_list)


print(output_string)
