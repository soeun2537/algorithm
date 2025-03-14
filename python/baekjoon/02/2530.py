hour, minute, second = map(int, input().split())
inputSecond = int(input())

secondTemp = second + inputSecond
second = secondTemp % 60
minuteTemp = minute + secondTemp // 60
minute = minuteTemp % 60
hourTemp = hour + minuteTemp // 60
hour = hourTemp % 24

print(hour, minute, second, sep=" ")