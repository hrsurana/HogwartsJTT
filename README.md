# Hogwarts: A Journey Through Time - ReadMe

## Overview

**Hogwarts: A Journey Through Time** is a text-based adventure game created as part of the COE 312 Software Design semester project at the American University of Sharjah. This game offers players an immersive experience in the magical world of Harry Potter, allowing them to travel through time and participate in significant historical events within the wizarding world.

Players will encounter iconic battles, engage with legendary characters, and utilize various magical objects and spells. With a focus on strategic gameplay and rich storytelling, this game aims to captivate Harry Potter fans and RPG enthusiasts alike. The game’s design incorporates several software design patterns, enhancing its structure, flexibility, and maintainability.

For a visual overview of the game, please refer to our [YouTube playlist](https://www.youtube.com/playlist?list=PLa33B7Q7GDot3L961OvjiXvq9no3395br).

## Game Components

### Objective
The primary objective of **Hogwarts: A Journey Through Time** is to integrate various software design patterns into a cohesive and enjoyable RPG experience. Set in the Harry Potter universe, the game revolves around a time-traveling concept where players participate in pivotal battles throughout wizarding history.

### Scenes

- **Intro**: The player and their friends, Lucius and Eve, discover a time travel spell in the Hogwarts library. This spell inadvertently sends the player back in time, setting the stage for their adventure.

- **Act I**: The player is transported to the era of Hogwarts' founding members, where they must engage in a battle. Upon victory, the player moves forward in time.

- **Act II**: The player finds themselves in the midst of the great battle against Grindelwald. Success in this battle is crucial, as failure would trap the player in this timeline forever.

- **Act III**: The final battle takes place at Hogwarts, where the player aids in the fight against Voldemort and the Death Eaters. Victory here allows the player to acquire a relic that enables them to return to their original timeline.

### Objects

- **Potions**: Wolfsbane, Veritaserum
- **Weapons**: Wand
- **Relics**: Time Turner
- **Battle Items**: Snake Skin, Wolf Elixir

### Characters

- **The Player**
- **Lucius** (Friend)
- **Eve** (Friend)
- **Godric Gryffindor, Salazar Slytherin, Rowena Ravenclaw, Helga Hufflepuff**
- **Newt Scamander, Dumbledore, Grindelwald**
- **Harry Potter, Ron Weasley, Hermione Granger, Voldemort**

### Sensors

Special sensors were incorporated to enhance the gameplay experience:

- **Gyroscope and Accelerometer**: Used for casting battle spells like Expelliarmus and Avada Kedavra.
- **Sound Sensor**: Used for casting Lumos to light up the player’s surroundings.

### Design Patterns

- **Observer/Singleton**: Each battle is timed. A clock (subject) counts down the time and passes this information to a Battle class (Observer), which manages the battle accordingly. The Player class is implemented as a Singleton.
  
- **Template Method**: This pattern was used to create potions that boost the player’s health by either 40% or 80%. The creation process for both types of potions is the same, differing only in the ingredients collected after battles.

## How to Play

1. **Start the Game**: Follow the instructions to begin your adventure in the Hogwarts library.
2. **Explore Scenes**: Navigate through different time periods by winning battles in each act.
3. **Use Objects and Potions**: Collect and use various magical items to aid you in battles.
4. **Cast Spells**: Utilize sensors to cast spells during battles and in other interactive moments.
5. **Complete the Game**: Defeat Voldemort in the final battle to return to your timeline and complete your journey.

Enjoy your adventure through time in the world of Hogwarts!

## Installation and Setup

1. **Requirements**: Ensure your system meets the necessary software and hardware requirements for running the game.
2. **Installation**: Follow the provided instructions to install the game on your system.
3. **Running the Game**: Execute the main file to start the game and follow on-screen instructions.

For further assistance, please refer to the game's documentation or contact the project developers.

## Credits

**Developers**:
- Warda Ul Hasan (g00090299)
- Harsh Surana (b00088424)


**Instructors**:
- Dr. Omar Arif
- Mr. Ali Reza Sajun

---

This project was developed as part of the COE 312 Software Design course at the American University of Sharjah.
