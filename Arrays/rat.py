def rat_food(r, unit, arr, n):
    if arr is None or n == 0:
        return -1
    totalReqFood = r * unit
    foodTillNow = 0
    
    for house in range(n):
        foodTillNow += arr[house]
        if foodTillNow >= totalReqFood:
            return house + 1
        
    return 0
#Input handling
r =int(input("Enter no. of rats:"))
unit = int(input("Enter the value of units:"))
n =int(input("No. of elements in a array:"))
arr = list(map(int, input("List elements with space separeted").split()))

#calculate
print(rat_food(r, unit, arr, n))