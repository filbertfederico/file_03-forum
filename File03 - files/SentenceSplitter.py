import os
import re
os.chdir("C:\\Users\\FILBERT\\Documents\\Filbert 2\\Python\\File03 - files")

def spliteroo():
    text = ("Mr. Miyagi bought cheapsite.com for 1.5 million dollars, i.e. he paid a lot for it. Did he mind? Adam Jones Jr. thinks he didn't. In any case, this isn't true... Well, with a probability of .9 it isn't.")
    # output = re.sub("\n", " ",text)
    output = re.split(r"\.\s*", text)
    output = re.sub(r'(^Mr)(^Mrs)(^Dr)\.\s([A-Z])', r'.\n', output)
    print(output)
spliteroo()

