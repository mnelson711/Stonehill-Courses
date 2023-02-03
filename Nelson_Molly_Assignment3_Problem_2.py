#Assignment #3 Problem #2

str_ducks = input("Enter the duck names here:")

input_list = str_ducks.split(",")

list_of_duck_names = ["Jack", "Kack", "Lack", "Mack", "Nack", "Ouack", "Pack", "Quack"]

outfile = open("outfile.txt", "w")

for duckname in list_of_duck_names:
    outfile.write(duckname + input_list.count(duckname))

quack_index = input_list.index("Quack")

moves = list(range(0,quack_index,1))
for move_times in moves:
    move_times = input_list.pop(0)
    input_list.append(move_times)
    
outfile.write(", ".join(input_list))
        
outfile.close()

