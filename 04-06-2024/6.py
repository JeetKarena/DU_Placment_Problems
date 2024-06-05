def find_distance(num1,num2):
    xor_result=num1^num2
    dis=0
    while xor_result:
        dis+=xor_result&1
        xor_result=xor_result>>1
    return dis
num1,num2=list(map(int,input("Enter Two Number space seprated ").split(" ")))
print(find_distance(num1,num2))