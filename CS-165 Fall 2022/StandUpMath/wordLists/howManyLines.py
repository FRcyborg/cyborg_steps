""" 
    practicing reading lines from text file
    20221017  -  JLF
"""

count = 0;
f = open("words1", "r")
for x in f:
    print(x.strip())
    count+=1

print("count => ", count)

f.close()



