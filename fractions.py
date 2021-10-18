n = int(input("enter a positive numerator :"))
d = int(input("enter a positive denominator :"))

if n < 1 :
    n = int(input("re-enter a positive numerator :"))
if d < 1 :
    d = int(input("re-enter a positive denominator :"))

import math

x = math.gcd(n,d)

if n > d :
    print ("{}/{} is an improper fraction".format(n,d))
    if x != 1 :    
        n = n/x
        d = d/x
        print ("This improper fraction can be reduced to: {:.0f}/{:.0f}".format(n,d))
    else : 
        print ("This improper fraction cannot be reduced any further")
    
    y = n%d
    m = n//d
    if y > 0 :
        print ("The mixed number is {:.0f} and {:.0f}/{:.0f}".format(m,y,d))
    else :
        print ("The whole number is",'%.0f'%m)
else :
    print ("{}/{} is an proper fraction".format(n,d))
    if x != 1 :
        n = n/x   
        d = d/x
        print ("This proper fraction can be reduced to: {:.0f}/{:.0f}".format(n,d))
    else :
        print ("This proper fraction cannot be reduced any further")




# print("This improper fraction cannot be reduced any further")
# print("{:.0f}/{:.0f}".format(n,d))