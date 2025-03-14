array = [0] * 16
array[0], array[1] = 2, 3

for i in range(2, len(array)):
    array[i] = array[i-1]*2 -1

num = int(input())

print((array[num-1]+array[num-1]-1)**2)