import os
os.chdir("C:\\Users\\FILBERT\\Documents\\Filbert 2\\Python\\File03 - files")
name = "Pneumonia.txt"
punct = "!()-[]{;}:'\,<>./?@#$%^&*_~"
no_punct = ""
textfile = open(name, "r")
letter_count1 = 0
letter_count2 = 0
for line in textfile:
    for word in line.split():
        for c in word:
            if c not in punct:
                no_punct = no_punct + c
                letter_count1 += 1
                letter_count2 += len(word)   

avg = float(letter_count2)/float(letter_count1)
print("Average words: ",'%.2f'% avg)

textfile.close()
