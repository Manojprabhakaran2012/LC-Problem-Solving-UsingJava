Select w1.id
From Weather w1
Join Weather w2
ON DATE_SUB(w1.recordDate,Interval 1 DAY)= w2.recordDate
where w1.temperature > w2.temperature;
