num = 600851475143
large = 0

count = 2
while count ** 2 <= num:
	if num % count == 0:
		num /= count
	else:
		count += 1
if num > large:
	large = num

print "Largest Prime Factor: ", large
