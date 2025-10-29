def sum_unique(nums):
   
    total = 0
    num_count = {}

    for num in nums:
       
        if num in num_count:
            total -= num_count[num]
            del num_count[num]  
        else:
            total += num
            num_count[num] = 1

    return total



print(sum_unique([1,2,3,2]))  
print(sum_unique([1,1,1,1])) 
