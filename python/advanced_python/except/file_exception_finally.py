try:
    file = open("demo_file_1.txt", "r")
    content = file.read()
    print(content)

except FileNotFoundError:
    print("Error: File not found")

except IOError:
    print("Error: File cannot be read")

finally:
    try:
        file.close()
        print("File closed")
    except:
        pass
