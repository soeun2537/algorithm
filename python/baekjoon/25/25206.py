chart = {
    "A+": 4.5,
    "A0": 4.0,
    "B+": 3.5,
    "B0": 3.0,
    "C+": 2.5,
    "C0": 2.0,
    "D+": 1.5,
    "D0": 1.0,
    "F": 0.0
}

total_score = 0
total_credit = 0

for _ in range(20):
    line = input().split()
    
    credit = float(line[1])
    score = line[2]

    if score != "P":
        total_score += credit * chart[score]
        total_credit += credit

print(total_score / total_credit)
