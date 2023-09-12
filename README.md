# HogwartsJTT
A text based adventure game, I created for my software design semester project 



AMERICAN UNIVERSITY OF SHARJAH
College of Engineering
Spring 2023
COE 312 Semester Project - Group 6
Hogwarts: A Journey Through Time
Name 
ID
Warda Ul Hasan 
g00090299
Harsh Surana 
b00088424
Aadib Kohinoor 
b00087778
Fatima Almarashda 
g00085415
Instructor names: 
Dr. Omar Arif & Mr. Ali Reza Sajun
Submission date: 
May 8th, 2023

Overview of the Game
Provide a clear description of how the game works. Justify why you think it is a good game 
and why people would love to play it. Please include the YouTube video link in this section 
showing how the game works. 
This game would be a fun choice to play as it seamlessly combines multiple captivating 
elements. With its time traveling concept set in the magical world of Harry Potter, players are 
immersed in an RPG experience that allows them to explore different historical periods and 
engage in thrilling battles. From the founding members' clash to the epic confrontations 
against Grindelwald and Voldemort, the diverse scenes ensure a sense of progression and 
keep the gameplay engaging. Alongside an array of objects, potions, weapons, relics, and 
battle items, players can strategize and customize their approach, adding depth to their 
adventure. Furthermore, the integration of design patterns, including Observer/Singleton, 
Template Method, Strategy, State, and Command, contributes to the game's structure, 
flexibility, and maintainability. The incorporation of sensors, such as gyroscope, 
accelerometer, and sound sensor, for spell casting and environmental interaction adds an 
immersive and dynamic element. With its combination of a compelling storyline, strategic 
gameplay, interactive features, and the enchanting world of Harry Potter, this game promises 
an enjoyable and captivating experience for players.
https://www.youtube.com/playlist?list=PLa33B7Q7GDot3L961OvjiXvq9no3395br
Description of Game Components
Provide a description of the components of the game. Each subsection should describe in 
detail each component of the game. 

Objective
The objective of this game was to cohesively integrate various design patterns and 
software design strategies to build a fun little RPG based on a time traveling concept 
within the Harry Potter wizarding world.
Scenes

Intro: 
We are introduced to the main characters. They wander in the library and discover a 
time travel spell which sends the main character (player) back in time.

Act I: 
The player finds themselves in the midst of the battle among the founding members 
of Hogwarts. The battle takes place and upon the player’s victory, they are 
transported to the next point in time.

Act II:
The player is transported to the great Grindelwald battle. Here they must aid in 
defeating Grindelwald, else risk permanently being trapped in this part of time. Upon 
the player's victory they are transported to the final point in time explored in this 
game.

Act III
The player is transported to perhaps the greatest ever battle at Hogwarts; that against 
Voldermort and the death eaters. The player must aid in defeating Voldermort, which 
in turn rewards them with a relic enabling them to return to their own timeline.

Objects
Potions: Wolfsbane, Veritaserum
Weapons: Wand
Relics: Time Turner
Battle Items: Snake Skin, Wolf Elixir

Characters
The Player, Lucius (friend), Eve (friend)
Godrick Gryffindor, Salazar Slytherin, Rowena Ravenclaw, Helga Hufflepuff
Newt Scammander, Dumbeldore, Grindelwald
Harry Potter, Ron Weasly, Heroine Granger, Voldermort 

Sensors
Sensors were used primarily to cast special spells - two of these sensors were used as 
battle spells (Expelliarmus and Avada Kedavra) and one to light up the player’s 
surroundings when prompted (Lumos). The three types of sensors used were 
Gyroscope, Accelerometer, and Sound Sensor

Observer/Singleton 
Each battle is timed. The player must complete the battle in a finite amount of time or
else the game is lost. A clock (subject) counts the “time” and passes this information 
to a Battle class (Observer) which keeps track of the time and is in charge of 
conducting the battle. Also, the “Player” class is a Singleton class.

Template Method
The template method was used to develop potions that can increase either 40% or 
80% of a player’s health. These potions are made in the exact same manner, except 
the difference in the ingredients which are picked up after battles.

