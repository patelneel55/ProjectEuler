result = 2
second = 1
sum = 0
while result <= 4000000:
	if result % 2 == 0:
		sum += result
	temp = result
	result += second
	second = temp
print "Sum: ", sum
