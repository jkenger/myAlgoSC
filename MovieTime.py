from collections import deque
movies = deque()
snacks = deque()

for i in range(1, 4):
    userResponse = input("Enter movie " + str(i) + " of " + str(3) + "\n")
    movies.append(str(userResponse))

for i in range(1, 4):
    userResponse = input("Enter snacks " + str(i) + " of " + str(3) + "\n")
    snacks.append(str(userResponse))

print("Movies to watch are: deque(" + str(movies) + ")" )
print("Snacks available are: deque(" + str(snacks) + ")\n")

while snacks:
    userResponse = input("Press S each time you finish a snack.\n")
    if userResponse.upper() == "S":
        snacks.popleft()
        if not snacks:
            print("No more snacks.")
        else:
            print("Snacks available are: deque(" + str(snacks) + ")\n")
    else:
        print("Invalid input")