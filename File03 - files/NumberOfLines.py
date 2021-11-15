import os

os.chdir("C:\\Users\\FILBERT\\Documents\\Filbert 2\\Python\\File03 - files")

finput = open("Text.txt","r")
output = open("NewText.txt","w")

count = 0
for line in finput:
    count += 1
    output.write("{:2d} {}".format(count,line))
output.close()