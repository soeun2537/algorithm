science_list = []
society_list = []

for _ in range(4):
    science_list.append(int(input()))

for _ in range(2):
    society_list.append(int(input()))

science_list.remove(min(science_list))
society_list.remove(min(society_list))

print(sum(science_list) + sum(society_list))