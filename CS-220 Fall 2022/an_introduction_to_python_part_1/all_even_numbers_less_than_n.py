"""

    Write a snippet of code that creates a list that contains all the even numbers that are less than a given number 'n'. 

    20220827  -  JLF

"""
def makeLine():
    print("\n-----------------------------------------------------------\n")

def main():
    
    n = 9
    evenNumbersLessThanN = []

    makeLine()

    i = range(2, n, 2)
    for x in i:
        evenNumbersLessThanN.append(x)

    print("And now for all the even numbers less than 'n':\n")
    print("'n' was => ", n)
    print("evenNumbersLessThanN => ", evenNumbersLessThanN)

    makeLine()


main()
