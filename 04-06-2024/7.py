def sum_of_rev_linklist(arr_list1,arr_list2):
    sumone=sumtwo=0
    result=0
    for value1,value2 in zip(arr_list1,arr_list2):
        sumone=sumone*10+value1
        sumtwo=sumtwo*10+value2
    else:
        result=sumone+sumtwo
        result=str(result)
        result=result[::-1]
        return [int(i) for i in result]
arr_list1=list(map(int,input("Enter Numbers for list one : ").split(" ")))
arr_list2=list(map(int,input("Enter Numbers for list two : ").split(" ")))

print(sum_of_rev_linklist(arr_list1[::-1],arr_list2[::-1]))