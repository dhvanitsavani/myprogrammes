nums = []

for i in range (20):
    nums.append(i)

even_numbers = list(filter(lambda x: x % 2 == 0, nums))

print(even_numbers)
