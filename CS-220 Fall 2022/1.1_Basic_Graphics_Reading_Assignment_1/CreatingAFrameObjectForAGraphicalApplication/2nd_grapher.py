"""

Drawing graphical objects

A Frame can be used to draw graphical objects, such as rectangles, circles, and lines. 
To display graphical objects, a programmer can add a Canvas object to a frame. A Canvas 
is a graphical component that a programmer can use to draw basic shapes.

The following program demonstrates how to build a class that creates a Canvas to draw 
2D graphics.

20220827  -  JLF

"""

import tkinter as tk
from tkinter import Canvas, Frame, BOTH


class Application(tk.Frame):
    def __init__(self, master=None):
        super().__init__(master)
        self.master = master
        self.pack(fill=BOTH, expand=1)

        canvas = Canvas(self)
        # Write your drawing instructions



"""
Canvas's create_rectangle() takes the following arguments:

    Arguments 1 and 2: coordinate for the top left corner (x0, y0) of the rectangle
    Arguments 3 and 4: coordinate for the bottom right corner (x1, y1)
    Argument 5 (optional): rectangle outline color (if not set, the outline will be black)
    Argument 6 (optional): rectangle fill color
"""




def main():
    app_frame = tk.Tk()
    app_frame.geometry('400x250')
    app = Application(master=app_frame)
    app.mainloop()


if __name__ == '__main__':
    main()




