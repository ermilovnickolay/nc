# -*- coding: utf-8 -*-
from bs4 import BeautifulSoup
from urllib2 import urlopen
import psycopg2
import re
import uuid

conn = psycopg2.connect("host='localhost' dbname='postgres' user='postgres' password='1899'")
cur = conn.cursor()


# c=cur.execute("Select league from teams group by league  ")
# rows = cur.fetchall()
# for s in rows:
#     id=str(uuid.uuid4())
#     cur.execute("INSERT INTO public.league (id,name,rank,country_id) VALUES (%s, %s,%s,%s)",(id,s[0],1,'1'))
#
#     cur.execute("update public.teams  set league=%s where league=%s",(id,s[0]))


# c=cur.execute("Select country from players group by country  ")
# rows = cur.fetchall()
# for s in rows:
#     id=str(uuid.uuid4())
#     cur.execute("INSERT INTO public.country VALUES (%s, %s)",(id,s[0]))
#
#     cur.execute("update public.players  set country=%s where country=%s",(id,s[0]))
#     cur.execute("update public.league  set country_id=%s where country_id=%s",(id,s[0]))



# c=cur.execute("Select  attack, defence, midfield, name, rating, stadium, league, picture from teams ")
# rows = cur.fetchall()
# for s in rows:
#     id=str(uuid.uuid4())
#     cur.execute("INSERT INTO public.team (id, attack, coach, defence, midfield, name, rating,"
#                 "stadium, league_id, image) VALUES (%s, %s,%s,%s,%s, %s,%s,%s,%s, %s)",(id,s[0],'coach',s[1],s[2],s[3],s[4],s[5],s[6],s[7]))
#
#     cur.execute("update public.players  set team=%s where team=%s",(id,s[3]))



# c=cur.execute("Select  name, age, position, country, overall, foot, team, player_number, "
#               "crossing, finishing, heading_accuracy, short_passing, volleys, "
#               "dribbling, curve, free_kick_accuracy, long_passing, ball_control, "
#               "acceleration, sprint_speed, agility, reactions, balance, shot_power, "
#               "jumping, stamina, strength, long_shots, aggression, interceptions, "
#               "positioning, vision, penalties, markin, standing_tackle, sliding_tackle, "
#               "gk_diving, gk_handling, gk_kicking, gk_positioning, gk_reflexes, "
#               "image from players")
# rows = cur.fetchall()
# for s in rows:
#     id=str(uuid.uuid4())
#     cur.execute("INSERT INTO public.player_attributes (id, crossing, finishing, headingaccuracy, shortpassing, volleys,"
#                 "dribbling, curve, freekickaccuracy, longpassing, ballcontrol,"
#                 "acceleration, sprintspeed, agility, reactions, balance, shotpower,"
#                 "jumping, stamina, strength, longshots, agression, interceptions,"
#                 "positioning, vision, penalties, markin, standingtackle, slidingtackle,"
#                 "gkdiving, gkhandling, gkkicking, gkpositioning, gkreflexes ) VALUES (%s, %s,%s,%s,%s, %s,%s,%s,%s, %s,%s"
#                 ",%s, %s,%s,%s,%s, %s,%s,%s,%s, %s,%s,%s, %s,%s,%s,%s, %s,%s,%s,%s, %s,%s,%s)",(id,s[8],s[9],s[10],s[11],s[12],s[13],s[14],s[15],s[16],s[17],s[18],s[19],
#                 s[20],s[21],s[22],s[23],s[24],s[25],s[26],s[27],s[28],s[29],s[30],s[31],s[32],s[33],s[34],s[35],s[36],s[37],s[38],s[39],s[40]))
#
#     idplayer=str(uuid.uuid4())
#     data1={'id':id,'age':s[1],'foot':s[5],'name':s[0],'player_number':s[7],'overall':s[4],'position':s[2],'country_id':s[3],'attribute_id':id,'team_id':s[6]}
#
#     cur.execute("INSERT INTO public.player (id, age, foot, name, player_number, overall, position, country_id,"
#                 "atribute_id, team_id) VALUES (%(id)s, %(age)s,%(foot)s,%(name)s,%(player_number)s, %(overall)s,%(position)s,%(country_id)s,%(attribute_id)s, "
#                 "%(team_id)s)",(data1))







# c=cur.execute("Select player_number, team , image from players")
# rows = cur.fetchall()
# for s in rows:
#     cur.execute("update public.player set image='"+s[2]+"' where player_number='"+str(s[0])+"' and team_id='"+s[1]+"' ")
#     conn.commit()



cur.close()

