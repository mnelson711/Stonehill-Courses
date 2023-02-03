#Assignment 6 problem number 1

#this gets the original input from the user
original_input = input("What is the input?\n")

#this separates the boxes from the input
input_list = original_input.split(";")
box_one = input_list[0].split(",")
box_two = input_list[1].split(",")

#this separates the variables for box 1
box_one_x = float(box_one[0])
box_one_y = float(box_one[1])
box_one_width = float(box_one[2])
box_one_length = float(box_one[3])

#this separates the variables for box 2
box_two_x = float(box_two[0])
box_two_y = float(box_two[1])
box_two_width = float(box_two[2])
box_two_length = float(box_two[3])

#this creates condition boolean statements based on the variables
condition_1 = box_one_x < box_two_x + box_two_width
condition_2 = box_two_x < box_one_x + box_one_width
condition_3 = box_one_y < box_two_y + box_two_length
condition_4 = box_two_y < box_one_y + box_one_length

#if all of the conditions are true, the program prints out collision detected
if condition_1 and condition_2 and condition_3 and condition_4:
    print("Collision Detected!")
else:
    print("The boxes are not colliding.")#if even 1 condition is false,
    #the program prints that the boxes arent colliding

