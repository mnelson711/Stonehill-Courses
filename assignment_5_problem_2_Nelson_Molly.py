#Assignment #5 problem number 2

#these take the input to get the orignal string and the start and end letters
encoded_string = input("What is the string to decode:\n")
start_letter = input("What is the first letter:\n")
end_letter = input("What is the last letter:\n")

#this changes the original string into a list
encoded_list = []
for character in encoded_string:
    encoded_list.append(character)
    
#this creates two alphabets
alphabet = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " "]
alphabet2 = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " "]

#this is the final list
decoded_list = []

#this shifts the first alphabet so it starts with the start letter
end_letter_index = alphabet.index(end_letter)
moves = list(range(0, end_letter_index,1))
for move_times in moves:
    move_times = alphabet.pop(0)
    alphabet.append(move_times)

#this shifts the second one so it starts with the end letter
start_letter_index = alphabet2.index(start_letter)
moves2 = list(range(0, start_letter_index,1))
for movetimes2 in moves2:
    move_times2 = alphabet2.pop(0)
    alphabet2.append(move_times2)

#this goes through each letter in the encoded list and the alphabet
index = 0
for letter in encoded_list:
    for let in alphabet:
        equal = let == letter
        if equal:#when the letter matches the one in the alphabet it grabs that index
            index = alphabet.index(let)
            decoded_list.append(alphabet2[index])#then it appends the letter from the second alphabet at the same index
            
#finally, this changes it from a list to a string and prints it out
final_answer = "".join(decoded_list)
print(final_answer)


