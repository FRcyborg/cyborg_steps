"""
    We learned a new thing in class.  Not sure what it's called but
    it truncates or not depending on which symbol you use.

    20220827  -  JLF
"""
def makeLine():
    print("\n------------------------------------------\n")


makeLine()

# using the // vs / thing:
print("2/5 => ", 2/5)
print("n2//5 => ", 2//5)
print("n5/2 => ", 5/2)
print("n5//2 => ", 5//2)


makeLine()

# for x in range(i), turns out you can do this:
y = 5
x = range(y)
for i in x:
    print("i => ", i)


makeLine()

