num = int(input())
cost = [list(map(int, input().split())) for _ in range(num)]

dp = [[0] * 3 for _ in range(num)]

dp[0][0] = cost[0][0]
dp[0][1] = cost[0][1]
dp[0][2] = cost[0][2]

for i in range(1, num):
    dp[i][0] = cost[i][0] + min(dp[i-1][1], dp[i-1][2])
    dp[i][1] = cost[i][1] + min(dp[i-1][0], dp[i-1][2])
    dp[i][2] = cost[i][2] + min(dp[i-1][0], dp[i-1][1])

print(min(dp[num-1][0], dp[num-1][1], dp[num-1][2]))