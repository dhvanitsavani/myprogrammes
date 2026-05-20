try:
    a = int(input("Enter a number : "))
    b = int(input("Enter another number : "))

    result = a / b
    print(f"Result : {result}")

    list1 = [1, 2, 3, 4]
    index = int(input("Enter index (0-3) : "))
    print("Element : ", list1[index])

except ZeroDivisionError:
    print("Error: Cannot divide by zero")

except ValueError:
    print("Error: Invalid input, please enter numbers only")

except IndexError:
    print("Error: Index out of range")

except Exception as e:
    print("Unexpected error: ", e)
