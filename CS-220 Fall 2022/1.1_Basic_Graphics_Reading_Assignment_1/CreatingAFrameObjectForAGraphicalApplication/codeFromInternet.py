from tkinter import *


ws = Tk()
ws.title('PythonGuides')
ws.geometry('900x900')
ws.config(bg='#345')


def close_win(e):
    win.destroy()

"""
canvas = Canvas(
    ws,
    height=200,
    width=200,
    bg="#fff"
    )
    
canvas.pack()

canvas.create_rectangle(
    30, 30, 180, 120,
    outline="#fb0",
    fill="#fb0")
"""

canvas = Canvas(
    ws,
    height=900,
    width=900,
    bg="#fff"
    )
    
canvas.pack()

canvas.create_rectangle(
    30, 30, 180, 120,
    outline="#fb0",
    fill="#fb0")


canvas.create_rectangle(
    200, 200, 100, 100,
    outline="blue",
    fill="blue")
    
win.bin('<Escape>', lambda e: close_win(e))


ws.mainloop()
