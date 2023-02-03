#Assignment #2 part 1

#get file name from user
file_name = input("What is the name of the file?\n")

#read file that was given
file_str = open(file_name, "r", encoding = "latin-1").read()
#get rid of all spaces in the given file
new_str = file_str.replace(" ", "")
#make this into a new file called outfile
final_file = open("outfile.txt", "w", encoding= "latin-1")
final_file.write(new_str)
final_file.close()


