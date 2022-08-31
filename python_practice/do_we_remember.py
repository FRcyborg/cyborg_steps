"""
      This is python practice just to see what we remember.


      20220823  -  JLF

"""
import sys

def checkForCommandLineArguments():
      n = len(sys.argv)
      print("in checkForCommandLineArguments, n => ", n)


      
def makeLine():
      print("\n******************************************************\n")

def fibNumbers(endNumber):
      
      print("endNumber => ", endNumber)
      a = 1
      b = 1
      c = 0
      while b<endNumber:
            c = b
            b = b+a
            a = c
            print("fib => ", b)




def main():
      makeLine()

      checkForCommandLineArguments()
      fibNumbers(25)  
            
      makeLine()

main()








