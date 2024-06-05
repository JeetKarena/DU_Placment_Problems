# HayStack And Needle : input
# Output : Int : index Of needle
def IsHeystack(haystack:str,needle:str):
    result=haystack.find(needle)
    return result


haystack,needle=list(map(str,input("Enter HayStack and Needle Space Sperated : ").split(" ")))

print(IsHeystack(haystack,needle))
