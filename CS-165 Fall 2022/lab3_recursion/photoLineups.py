"""
    this is the python version of the java program we are trying to write for 
    Lab3

    20220910  -  JLF

"""
def permute(lst, f=0):
    if f >= len(lst):
        print(lst)
        return
    for s in range(f, len(lst)):
        lst[f], lst[s] = lst[s], lst[f]
        permute(lst, f+1)
        lst[f], lst[s] = lst[s], lst[f]

permute([1,2,3])


