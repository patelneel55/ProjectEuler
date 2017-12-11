max = 0
for i in xrange(1000, 100, -1):
	for j in xrange(1000, 100, -1):
		num = i*j
		if str(num) == str(num)[::-1]:
			if num > max:
				max = num
print "Largest Palindrome: ", max
