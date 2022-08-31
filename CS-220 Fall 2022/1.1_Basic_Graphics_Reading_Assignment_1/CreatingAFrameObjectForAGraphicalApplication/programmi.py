"""

This works.  Canvas example from youTube:
        
    https://www.youtube.com/watch?v=cx_2egCZn0E
    Python tkinter and canvas 1: draw rectangles

    PythonProgrammi

20220828  -  JLF


"""

"""
import tkinter

root = tkinter.Tk()
canvas = tkinter.Canvas()
canvas.create_rectangle(0,0,100,100, fill='red')
canvas['bg'] = 'green'
canvas.pack()

root.mainloop()
"""

import tkinter

other = tkinter.Tk()
pad = tkinter.Canvas()
pad.create_rectangle(0,0,100,100, fill='red')
pad.create_rectangle(200,200,100,100, fill='red')

pad['bg'] = 'green'
pad.pack()

other.mainloop()


