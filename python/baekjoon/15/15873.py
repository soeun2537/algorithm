input_data = input()

if len(input_data) == 3:
    if input_data[-1] == '0':
        a = int(input_data[0])
        b = int(input_data[1:]) 
    else:
        a = int(input_data[:-1])
        b = int(input_data[-1])
elif len(input_data) == 4:
    a = int(input_data[0:2])
    b = int(input_data[2:])
else:
    a = int(input_data[0])
    b = int(input_data[1:])

print(a+b)