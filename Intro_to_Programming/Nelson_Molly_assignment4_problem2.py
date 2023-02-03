#Assignment #4 Problem number 2

#gets filename from user and makes it into a list
input_file_name = input("Enter the file name here:\n")
file_name = open(input_file_name, "r").readlines()

#separates the list into names and grades
new_list = []
for string in file_name:
    new_list.append(string.split(", "))
final_list = []
for row in new_list:
    for ele in row:
        final_list.append(ele)

#makes a new list of just grades without \n as integers
indices = list(range(1, len(final_list), 2))
list_of_grades = []
for index in indices:
    list_item = final_list[index].replace("\n", "")
    list_of_grades.append(int(list_item))

#finds the mean value
sum_value = 0
result = 0
for grade in list_of_grades:
    sum_value += grade
mean_value = sum_value / len(list_of_grades)

#finds the variance using the mean
list_sq_grades = []
for grade in list_of_grades:
    result = grade - mean_value
    sq_result = result ** 2
    list_sq_grades.append(sq_result)
    
result2 = 0
for sq_grade in list_sq_grades:
    result2 += sq_grade
    
variance = result2 / len(list_sq_grades)

#finds the standard variation from the variance
standard_deviation = variance ** .5

#prints out the final values
print("Mean: ",mean_value)
print("Variance: ",round(variance, 2))
print("Standard Deviation: ",round(standard_deviation, 2))

