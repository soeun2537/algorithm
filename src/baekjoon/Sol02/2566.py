max_value = 0
row = 1
col = 1

for i in range(1, 10):
    nums = list(map(int, input().split()))
    for j in range(1, 10):
        if max_value < nums[j - 1]:
            max_value = nums[j - 1]
            row = i
            col = j

print(max_value)
print(row, col)