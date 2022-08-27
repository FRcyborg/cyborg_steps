"""
    Write a snippet of code that reverses a list. To do this, create a new list 
    that contains the elements in reverse order. There are many ways to do this. 
    One way is to take advantage of the fact that the range function can take a 
    negative step size.

    20220827  -  JLF

"""

# make a line in output so I can read it easier:
def makeLine():
    print("\n--------------------------------------------------------\n")


# reverse an array using built in reverse method:
def reverseMethod():

    frontWaysList = [ 1, 2, 3, 4, 5, 6 ]
    
    print("Reversing a list with the reverse method:")

    print("frontWaysList => ", frontWaysList)

    frontWaysList.reverse()

    print("frontWaysList => ", frontWaysList)



# reverse an array with a while loop:
def whileLoopReverser():

    newList = []

    print("reversing a list with a while loop:")

    oldList = [ "a", "b", "c", "d", "e", "f" ]
    i = len(oldList) - 1
    while i >= 0:
        newList.append(oldList[i])
        i -= 1

    print("oldList => ", oldList)
    print("newList => ", newList)

def main():


    makeLine()
    
    reverseMethod()

    makeLine()
       
    whileLoopReverser()

    makeLine()


main()

