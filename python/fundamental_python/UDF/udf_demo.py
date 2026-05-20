def printLine():
    print("*"*50)

def add(a, b):
    print("addition = ", a+b)

def sub(a, b):
    return a - b

printLine()
print("welcome to user defined functions demo in python")
printLine()

add(5, 10)
printLine()

ans = sub(10, 4)
print("subtraction = ", ans)
print("subtraction = ", sub(10, 4))
printLine()

