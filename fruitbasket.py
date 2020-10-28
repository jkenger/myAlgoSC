basket = []
print("Catch and eat any of these fruits: ",
"'Apple'"," 'Orange'"," 'Guava'"," 'Mango'")

userFruitCount = (int(input("Btw how many fruits would you like to catch? ")))

print("Choose a fruit to catch. [A] - 'Apple', [O] 'Orange', [G] - 'Guava', [M] - Mango")

for i in range(userFruitCount):
    userFruit = (input("Fruit " + str(i + 1) + " of " + str(userFruitCount) + "\n"))
    if userFruit.upper() == "A":
        basket.append("Apple")
    elif userFruit.upper() == "O":
        basket.append("Orange")
    elif userFruit.upper() == "G":
        basket.append("Guava")
    elif userFruit.upper() == "M":
        basket.append("Mango")
    
print("\nYour basket now has: " + str(basket))

for i in range (userFruitCount):
    userOpt = str(input("Press [E] to eat fruit\n"))
    if(userOpt.upper() == "E"):
        basket.pop();
        if not basket:
            print("\nNo more fruits")
        else:
            print("\nFruit(s) in the basketL: " + str(basket))