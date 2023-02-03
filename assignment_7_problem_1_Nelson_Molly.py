#Assignment 7 problem number 1

#this defines the fucntion that takes in two values
def summedPairs(values, summed):
    counter = 0
    li = [] #creates a new list
    for num in values: #cycles through each value and each index
        for index in list(range(0,len(values),1)):
            if num + counter == summed:
                li.append(values[index])
                #if the number plus the counter adds up to the summed value,
                #then it will add that number to the li list
            counter = values[index]
            #each cycle the counter will be set to whatever the value is
    result = len(li) #this will return the amount of pairs
    return result

example1 = summedPairs([1,9,7,2,3],10)
print(example1)
