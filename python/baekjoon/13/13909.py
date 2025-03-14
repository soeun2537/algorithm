def findRange(number):
    index = 1

    while True:
        start = index**2
        end = (index + 1)**2
        if start <= number < end:
            return index
        index += 1

print(findRange(int(input())))