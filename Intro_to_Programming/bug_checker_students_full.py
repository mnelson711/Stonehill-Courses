import re

#This is our testing function to check regular expressions
def checkRegEx(lines,func,bugged = False):
    correct = True
    try:
        clean_lines = [line.strip() for line in lines]
        clean_lines = [l for l in clean_lines if len(l) > 0]
        split_lines = [(" ".join(line.split(" ")[:len(line.split(" "))-1]),int(line.split(" ")[-1])) for line in clean_lines]
        for line in split_lines:
            test_val = func(line[0])
            #print(test_val,line[1],test_val != line[1])
            if test_val != line[1]:
                correct = False
        if bugged:
            if correct:
                correct = False
            else:
                correct = True
    except Exception as e:
        print(e)
        
        return "Something went wrong"

    if correct:
        return "Correct"
    return "Incorrect"

#These are all our unit tests
def correctRegEx(word):
    expression = "^(http://)?www\.[A-Z|a-z]+\.(com|edu|gov)$"

    if re.match(expression,word) != None:
        return True
    return False

def bug1(word):
    expression = "^(http://)www\.[A-Z|a-z]+\.(com|edu|gov)$"

    if re.match(expression,word) != None:
        return True
    return False

def bug2(word):
    expression = "^(.)*://www\.[A-Z|a-z]+\.(com|edu|gov)$"

    if re.match(expression,word) != None:
        return True
    return False

def bug3(word):
    expression = "^www\.[A-Z|a-z]+\.(com|edu|gov)$"

    if re.match(expression,word) != None:
        return True
    return False

def bug4(word):
    expression = "^(http://)?(w){1,3}\.[A-Z|a-z]+\.(com|edu|gov)$"

    if re.match(expression,word) != None:
        return True
    return False

def bug5(word):
    expression = "^(http://)?(w){3,}\.[A-Z|a-z]+\.(com|edu|gov)$"

    if re.match(expression,word) != None:
        return True
    return False


def bug6(word):
    expression = "^(http://)?(www)?\.[A-Z|a-z]+\.(com|edu|gov)$"

    if re.match(expression,word) != None:
        return True
    return False

def bug7(word):
    expression = "^(http://)?www\.(.)+\.(com|edu|gov)$"

    if re.match(expression,word) != None:
        return True
    return False

def bug8(word):
    expression = "^(http://)?www\.[A-Z|a-z]*\.(com|edu|gov)$"

    if re.match(expression,word) != None:
        return True
    return False

def bug9(word):
    expression = "^(http://)?www\.[a-z]+\.(com|edu|gov)$"

    if re.match(expression,word) != None:
        return True
    return False

def bug10(word):
    expression = "^(http://)?www\.[A-Z]+\.(com|edu|gov)$"

    if re.match(expression,word) != None:
        return True
    return False

def bug11(word):
    expression = "^(http://)?www\.[A-Z|a-z]+(.)(com|edu|gov)$"

    if re.match(expression,word) != None:
        return True
    return False

def bug12(word):
    expression = "^(http://)?www\.[A-Z|a-z]+\.?(com|edu|gov)$"

    if re.match(expression,word) != None:
        return True
    return False

def bug13(word):
    expression = "^(http://)?www\.[A-Z|a-z]+\.(edu|gov)$"

    if re.match(expression,word) != None:
        return True
    return False

def bug14(word):
    expression = "^(http://)?www\.[A-Z|a-z]+\.(com|gov)$"

    if re.match(expression,word) != None:
        return True
    return False

def bug15(word):
    expression = "^(http://)?www\.[A-Z|a-z]+\.(com|edu)$"

    if re.match(expression,word) != None:
        return True
    return False

def bug16(word):
    expression = "^(http://)?www\.[A-Z|a-z]+\.^(com|edu|gov)$"

    if re.match(expression,word) != None:
        return True
    return False

def bug17(word):
    expression = "^(http://)?www\.[A-Z|a-z]+\.(com|edu|gov)?$"

    if re.match(expression,word) != None:
        return True
    return False

#Writes out our matrix
def writeFile(row_names,col_names,data):
    f = open("results.csv",'w')
    f.write(","+",".join(col_names)+'\n')
    for i in range(len(row_names)):
        f.write(row_names[i]+","+",".join([str(d) for d in data[i]])+'\n')
    f.close()

if __name__ == "__main__":
    from os import listdir
    from os.path import isfile, join
    import sys

    test_cases = {"Your test cases are {}":correctRegEx,
                  "Bug one was {}":bug1,
                  "Bug two was {}":bug2,
                  "Bug three was {}":bug3,
                  "Bug four was {}":bug4,
                  "Bug five was {}":bug5,
                  "Bug six was {}":bug6,
                  "Bug seven was {}":bug7,
                  "Bug eight was {}":bug8,
                  "Bug nine was {}":bug9,
                  "Bug ten was {}":bug10,
                  "Bug eleven was {}":bug11,
                  "Bug twelve was {}":bug12,
                  "Bug thirteen was {}":bug13,
                  "Bug fourteen was {}":bug14,
                  "Bug fifteen was {}": bug15,
                  "Bug sixteen was {}":bug16,
                  "Bug seventeen was {}":bug17
                  }
    lines = open("test_cases_problem_2.txt",'r').readlines()
    #print(lines)
    progress = []
    cor_case = False
    for case in test_cases:
        progress.append(checkRegEx(lines,test_cases[case],cor_case))
        cor_case = True #And switch to bugged = =True after the first one because the rest are bugged
    for i in range(len(progress)):
        string = list(test_cases.keys())[i]
        print(string.format(progress[i]))        

    
