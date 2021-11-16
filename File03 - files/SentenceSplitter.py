import re

def split():
    text = ("Mr. Miyagi bought cheapsite.com for 1.5 million dollars, i.e. he paid a lot for it. Did he mind? Adam Jones Jr. thinks he didn't. In any case, this isn't true... Well, with a probability of .9 it isn't.")
    output = re.split(r"(?<=[^A-Z].[.?]) +(?=[A-Z])", text)
    for g in output :
        print(g)
split()


#
