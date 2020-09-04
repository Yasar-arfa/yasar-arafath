#question-5

import datetime as dt

import numpy as np

s = input('Starting period : ')

e = input('Ending period : ')

mon = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']

d1, m1, y1 = s.split('/')

d2, m2, y3 = e.split('/')

s = dt.date(int(y1), int(mon.index(m1)+1), int(d1))

e = dt.date(int(y2), int(mon.index(m2)+1), int(d2))

daystart = dt.datetime.strptime(d1+' '+str(mon.index(m1)+1)+' '+y1, "%d %m %Y").weekday()

cnt = 0

for item in range(daystart, np.busday_count(s, e) + daystart):

    if item%7==0:

        cnt+=1

print(cnt)