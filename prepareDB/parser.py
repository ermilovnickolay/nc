# -*- coding: utf-8 -*-
from bs4 import BeautifulSoup
from urllib2 import urlopen
import psycopg2
import re


file = open('Players.txt', 'r')
wrong = open('Wrong.txt', 'w')

f=file.read()

number=re.compile('\d+')
links=number.findall(f)

#try:cursor.execute("Drop TABLE PLAYER_TEST")
#except:pass
conn = psycopg2.connect("host='localhost' dbname='postgres' user='postgres' password='1899'")
cur = conn.cursor()

# cur.execute("CREATE TABLE PLAYER (name varchar(50) , age varchar(50), position varchar(50), \
#                country varchar(50) , overall integer , foot varchar(50) , team varchar(50), \
#                player_Number integer , crossing integer, finishing integer, heading_Accuracy integer, short_Passing integer, volleys integer,\
#                dribbling integer, curve integer, free_Kick_Accuracy integer, long_Passing integer, ball_Control integer, acceleration integer,\
#                sprint_Speed integer, agility integer, reactions integer, balance integer, shot_Power integer, jumping integer,\
#                stamina integer, strength integer, long_Shots integer, aggression integer, interceptions integer, positioning integer,\
#                vision integer, penalties integer, markin integer, standing_Tackle integer, sliding_Tackle integer, gk_Diving integer ,\
#                gk_Handling integer, gk_Kicking integer, gk_Positioning integer , gk_Reflexes integer);")

def slice_name(name):
    n=name.find('(')
    name=name[:n-1]
    return name

def slice_age(age):
    n=age.find(')')
    age=age[:n+1]
    return age

for i in links:
    try:
        text='http://sofifa.com/player/'+str(i)
        print text

        html_doc = urlopen(text).read()
        soup = BeautifulSoup(html_doc)

        team=soup.find("article")

        head=team.find("div",{"class":"ui items"}).stripped_strings


        img=team.find("div",{"class":"ui items"}).div.div.span.img
        pict=img['data-original']

        description=[]

        for r in head:
            description.append(r)

        years=team.find("div",{"class":"description"}).p.stripped_strings

        for i in years:
            year=i

        root=team.find_all("div",{"class":"ui four cards"})
        part1=root[0]
        info=[]
        for temp in part1.stripped_strings:
            info.append(temp)

        part2=root[1]
        skill=[]
        for temp in part2.stripped_strings:
           skill.append(temp)

        c={}

        c['Name'] = slice_name(description[0])
        c['Country']=description[1]
        c['Position']=description[2]
        c['Age']=slice_age(year)
        c['Overall']=int(info[0])
        c['Foot']=info[5]
        c['Team']=info[15]
        c['Number']=int(info[20])
        c['Crossing']=int(skill[2])
        c['Finishing']=int(skill[4])
        c['Heading Accuracy']=int(skill[6])
        c['FShort Passing']=int(skill[8])
        c['Volleys']=int(skill[10])
        c['Dribbling']=int(skill[14])
        c['Curve']=int(skill[16])
        c['Free Kick Accuracy']=int(skill[18])
        c['Long Passing']=int(skill[20])
        c['Ball Control']=int(skill[22])
        c['Acceleration']=int(skill[26])
        c['Sprint Speed']=int(skill[28])
        c['Agility']=int(skill[30])
        c['Reactions']=int(skill[32])
        c['Balance']=int(skill[34])
        c['Shot Power']=int(skill[38])
        c['Jumping']=int(skill[40])
        c['Stamina']=int(skill[42])
        c['Strength']=int(skill[44])
        c['Long Shots']=int(skill[46])
        c['Aggression']=int(skill[50])
        c['Interceptions']=int(skill[52])
        c['Positioning']=int(skill[54])
        c['Vision']=int(skill[56])
        c['Penalties']=int(skill[58])
        c['Marking']=int(skill[62])
        c['Standing Tackle']=int(skill[64])
        c['Sliding Tackle']=int(skill[66])
        c['GK Diving']=int(skill[70])
        c['GK Handling']=int(skill[72])
        c['GK Kicking']=int(skill[74])
        c['GK Positioning']=int(skill[76])
        c['GK Reflexes']=int(skill[78])
        c['Picture']=pict

        try:
            cur.execute("INSERT INTO public.players VALUES (%s, %s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s\
            ,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s)",(c['Name'],c['Age'],c['Position'],c['Country'],c['Overall'],c['Foot']\
            ,c['Team'],c['Number'],c['Crossing'],c['Finishing'],c['Heading Accuracy'],c['FShort Passing'],c['Volleys'],c['Dribbling']\
            ,c['Curve'],c['Free Kick Accuracy'],c['Long Passing'],c['Ball Control'],c['Acceleration'],c['Sprint Speed'],c['Agility']\
            ,c['Reactions'],c['Balance'],c['Shot Power'],c['Jumping'],c['Stamina'],c['Strength'],c['Long Shots'],c['Aggression']\
            ,c['Interceptions'],c['Positioning'],c['Vision'],c['Penalties'],c['Marking'],c['Standing Tackle'],c['Sliding Tackle']\
            ,c['GK Diving'],c['GK Handling'],c['GK Kicking'],c['GK Positioning'],c['GK Reflexes'],c['Picture']))
            print 'yes'
        except:pass
    except:wrong.write(text)

# c=cursor.execute("Select * from PLAYER_DATA where team='FC Barcelona'  ")
# rows = cursor.fetchall()
# for s in rows:
#     print s[0]

conn.commit()
cur.close()

