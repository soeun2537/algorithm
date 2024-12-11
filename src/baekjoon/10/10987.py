string = input()

vowels = ['a', 'e', 'i', 'o', 'u']

count = 0
for vowel in vowels:
    count += string.count(vowel)

print(count)