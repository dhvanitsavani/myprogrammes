try:
    a = int(input("Enter a number : "))
    b = int(input("Enter another number : "))

    result = a / b
    print(f"Result : {result}")
    
except ZeroDivisionError:
    print("Error: Cannot divide by zero")

except ValueError:
    print("Error: Invalid input, please enter numbers only")

except Exception as e:
    print("Unexpected error: ", e)
