'''
From zyBooks CS220 reading

1.1 Basic graphics
Creating a graphics frame

Python supports a set of objects for developing graphical applications. A graphical application
is a program that displays drawings and other graphical objects. TKinter is a standard Python
package for graphical applications. TKinter displays contents inside a window called a frame
using a Frame object. The following program shows how to create and configure a Frame object to
display an empty application window.

20220904  -  JLF

'''


import tkinter as tk

class Application(tk.Frame):
   def __init__(self, master=None):
       super().__init__(master)
       self.master = master

       # Set the frame's title
       self.master.title('An Empty Frame')
       self.pack()

def main():
    app_frame = tk.Tk()

    # Set the frame's width (400) and height (250) in pixels
    app_frame.geometry('400x250')

    # Make the frame visible to the user
    app = Application(master=app_frame)
    app.mainloop()



if __name__ == '__main__':
    main()

