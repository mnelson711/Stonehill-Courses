#assignment 8 problem number 2
#this program will return the slope and y intercept ofthe line of
#best fit for the given points

def sumX(li_values):
    #this function is the sum of all the x values
    result = 0
    for sublist in li_values:
        result += sublist[0]
    return result

def sumY(li_values):
    #this function is the sum of all the y values
    result = 0
    for sublist in li_values:
        result += sublist[1]
    return result

def sumXY(li_values):
    #this function multiples each x value by its y value and adds them together
    result = 0
    for sublist in li_values:
        result += sublist[0] * sublist[1]
    return result

def denominator(li_values):
    #this fucntion represents the denominator for both the slope and
    #intercept functions
    n = len(li_values)
    result = n*xSquared(li_values) - sumX(li_values)**2
    return result

def xSquared(li_values):
    #this function sqaured each x value and then adds those products
    x_squared = 0
    for sublist in li_values:
        x_squared += sublist[0]**2
    return x_squared

def slope(li_values):
    #this function calculates the slope
    n = len(li_values)
    #the numerator multiples the amount of values
    #by the sumXy then subtracts sumX multipled by sumY
    numerator = n*sumXY(li_values)-sumX(li_values)*sumY(li_values)
    #then the function returns the numerator divided by the denominator function
    return numerator / denominator(li_values)

def yIntercept(li_values):
    #this function calculus the y intercept
    n = len(li_values)
    #te numerator multiplies the sumY by the xSqaured and then
    #subtracts the sumX times the sumXY
    numerator = sumY(li_values)*xSquared(li_values) - sumX(li_values)*sumXY(li_values)
    #then the function again returns this numerator divided by the denominator function
    return numerator / denominator(li_values)

def regression(li):
    #main function that returns the slope and y intercept
    return (slope(li),yIntercept(li))


if __name__ == "__main__":
    print(regression([(1,2.1),(2,3.2),(3,3.9),(4,4.8),(5,6)]))
