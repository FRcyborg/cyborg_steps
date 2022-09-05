"""
    lists, tuples, sets, etc

"""

# Create a set using the set() function.
nums1 = set([1, 2, 3])

# Create a set using a set literal.
nums2 = { 7, 8, 9 }

list1 = [1, 2, 3, 3, 4, 4, 5, 5, 2]

# Print the contents of the sets.
print(nums1)
print(nums2)

set1 = set(list1)

print("\n\nconverting a list to a set gets rid of the duplicates automatically")

print("List1 => ", list1)
print("set1  => ", set1)
