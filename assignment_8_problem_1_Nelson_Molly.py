#assignment number 8 problem #1
#this program will create a block cypher

def createGrid(height,width):

    width_indices = list(range(0, width, 1)) #create list 0-width
    msg_indices = list(range(0, height,1))#create list 0-num/width
    li= []
    for index in msg_indices:
        #iterate through msg index and add an empty list
        li.append([])
    return li

def addMsgToGrid(msg, li):
    n = 0
    height = len(msg) // width
    width_indices = list(range(0, width, 1))
    msg_indices = list(range(0, height,1))
    for sublist in li:
        #iterate through the new empty lists
        for index in width_indices:
            sublist.append(msg[n])
            n += 1
            #append the message at index n through width for each sublist
    return li
def getEncoding(li, width, height):
    width_indices = list(range(0, width, 1))
    msg_indices = list(range(0, height,1))
    encoded = []
    for index in width_indices:
        #this creates a new list in the order going down the collumns
        for sublist in li:
            encoded.append(sublist[index])
    return encoded

def transpose(msg, width, height):
    result = ""
    width_indices = list(range(0,width,1))
    msg_indices = list(range(0,height,1))

    for w_index in width_indices:
        for m_index in msg_indices:
            index = width * m_index + w_index
            result += msg[index]
    return result
            
def rectangleCypher(msg, width): #define a function with 2 attributes
    encoded = []
    height = len(msg) // width #get length of message
    width_indices = list(range(0, width, 1))
    msg_indices = list(range(0, height,1))
    
    li = createGrid(height,width)
    li = addMsgToGrid(msg, li)
    encoded = getEncoding(li,width,height)

    encoded_msg = "".join(encoded)#formats the new list as a string
    return transpose(test_string,width,height)
#encoded_msg #returns this string


if __name__ == "__main__":
    test_string = "Hello Worlds"
    width = 3
    #end_string = rectangleCypher(test_string, width)
    #print(end_string)
    print(rectangleCypher(test_string,width))
