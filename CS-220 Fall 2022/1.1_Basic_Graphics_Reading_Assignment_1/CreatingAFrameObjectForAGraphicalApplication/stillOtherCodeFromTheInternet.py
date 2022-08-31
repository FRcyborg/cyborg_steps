"""

https://www.geeksforgeeks.org/how-to-close-a-window-in-tkinter/

This one works but doesn't do enough.  Try adding this to an other
working program.

"""

# import required module 
from tkinter import *
  
# create object
root = Tk()
  
# create button to implement destroy()
Button(root, text="Quit", command=root.destroy).pack()
  
root.mainloop()



