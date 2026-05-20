from functools import reduce

nums = [1, 2, 4, 5]

product = reduce(lambda x, y: x * y, nums)
print(product)
