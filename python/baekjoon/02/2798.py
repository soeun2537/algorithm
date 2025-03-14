num, target = map(int, input().split())
card = list(map(int, input().split()))
max_select = [0 for _ in range(3)]
select = [0 for _ in range(3)]

for i in range(num):
    select[0] = card[i]
    for j in range(i + 1, num):
        select[1] = card[j]
        for k in range(j + 1, num):
            select[2] = card[k]
            if (sum(max_select) <= sum(select) and sum(select) < target + 1):
                max_select[0] = select[0]
                max_select[1] = select[1]
                max_select[2] = select[2]

print(sum(max_select))