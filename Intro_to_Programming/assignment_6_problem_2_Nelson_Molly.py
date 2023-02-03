#Assignment 6 problem 2

'''
#this gets the string and substring valuess from input
string = input("What is the string?\n")
substring = input("What is the substring?\n")

#this converts the input into a list
string_list = list(string)
substring_list = list(substring)

#goes through each value in string and substring
for character in string_list:
    for char in substring_list:
        if char == character:#if the value from substring is equal to the value from string 
            string_list.pop(string_list.index(char))#then it removes that value from the list

#this converts the list into a string for the final answer
final_answer = "".join(string_list)

#print(final_answer)
'''
def removeMain():
    string = input("What is the string?\n")
    substring = input("What is the substring?\n")
    result = ""
    for test_char in string:
        found = test_char in substring
        '''found = False
        for s_char in substring:
            test = test_char == s_char
            if test:
                found = True'''
        if not found:
            result += test_char
    print(result)

removeMain()
