# -*- coding: utf-8 -*-
from bs4 import BeautifulSoup
from urllib2 import urlopen
import psycopg2
import re


file = open('Teams.txt', 'r')
wrongteam = open('Wrong.txt', 'w')

f=file.read()

number=re.compile('\d+')
links=number.findall(f)

conn = psycopg2.connect("host='localhost' dbname='postgres' user='postgres' password='1899'")
cur = conn.cursor()

# cur.execute("CREATE TABLE teams (name varchar(100) , league varchar(50), \
#                 stadium varchar(50), \
#                rating integer , attack integer, midfield integer, defence integer , picture varchar(100));")

for i in links:
    try:
        text='http://sofifa.com/team/'+i
        print text

        html_doc = urlopen(text).read()
        soup = BeautifulSoup(html_doc)




        seria=soup.find("article")
        root=seria.find("div",{"class":"ui items"}).div.stripped_strings
        ser=[]
        for t in root:
            ser.append(t)

        teams=soup.find("article")
        img=teams.find("div",{"class":"ui items"}).div.div.img
        pict=img['data-original']

        info=[]
        stad=teams.find("div",{"class":"team-info inline-block"}).stripped_strings
        for s in stad:
            info.append(s)

        c={}
        c['Team']=ser[0]
        c['League']=ser[1]
        c['Rating']=int(ser[2])
        c['Attack']=int(ser[3])
        c['Midfield']=int(ser[5])
        c['Defence']=int(ser[7])
        c['Stadium']=info[1]
        c['Picture']=pict

        try:

            cur.execute("INSERT INTO public.teams VALUES (%s, %s,%s,%s,%s,%s,%s,%s)",(c['Team'],c['League'],\
             c['Stadium'],c['Rating'],c['Attack'],c['Midfield'],c['Defence'],c['Picture']))
            print 'yes'
        except:pass
    except:wrongteam.write(text)


conn.commit()
cur.close()

