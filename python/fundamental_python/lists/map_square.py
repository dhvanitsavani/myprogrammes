def square(n):
    return n * n

nums = [1, 2, 3, 4]

square_nums = list(map(square, nums))
print(square_nums)

square_nums_lambda = list(map(lambda x: x * x, nums))
print(square_nums_lambda)
