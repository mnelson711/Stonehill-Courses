#assignment 7 problem number 2


#defining the fucntion here that takes in two tuples
def isLessThan(left,right):
    result = True #the result is originally set to true
    check = True #this variable will make sure the comparing stops
    #when a value is greater than or less than

    li = list(range(len(left)-1,-1,-1))#creates a index that starts from the end
    for index in li:
        if check == True: #wont continue to compare if the check is false
            if left[index] == right[index]: 
                result = False
                #if the values are completely equal it will return false
            elif left[index] > right[index]:
                result = False
                check = False
                #if the left tuple value is greater the result is false and
                #the check makes sure it stops comparing
            elif left[index] < right[index]:
                result = True
                check = False
                #if the left tuple is less than, the result is true and the
                #check again makes sure it stops comparing
    return result


example = isLessThan((1,2,3,4),(1,1,3,4))
print(example)
