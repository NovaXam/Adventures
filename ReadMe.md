## Name: Adventures

## Description: 
The environment of the game is base on “Jumanji”  game was released in theatres on December 15, 1995. “Adventures” is a board game. Game starts at the Start point and stop at the Finish point. Number of players is up to five. The goal is to get the finish, first. During the game players throw dice and take quizzes. Each right answer gives a player a right to make an next step. Wrong answer hold a player at the current position and a right to move passes to another player. Moreover, there are other challenges waiting for player during the game depends on the dices and his luck. Total game time is about 30 minutes.

## Main logic: 
In order to reach to Finish a player should make a number of steps. Before to make a step a player has to roll a dice. Steps a player has to make depend on the digit on the dice rolled.

There are two categories of a cell on the board.

   - regular / questions
   - magic / bad or good may happen to you stranger.

Getting to a regular cell a player is provided with a choice / question. Depends of this choice / response he moves forward or stay at the same cell. At this stage for the version 1 of the game the functionality could be extended on base of the player’s choice he is redirected to one path or another(Faster or slower). For the MVP it’s only one path. If the answer is right he makes next step. Player has a right to move until he gives a wrong answer or magic interrupts him.

In case if the choice is wrong, the right to move passes to another player in a queue. More right answers and luck player has, faster he get to the finish line. There is a limited time for each answer up to 60 seconds.

Winner get everything, loser will stuck in the game forever.

## Features: 
  ### Interface:
   1. Front page: 
        #### Section:
            - number of players section 
            - option to choose the number of player from 1 to 5. 
            - level of complexity 
            - option to choose a complexity level from 0 to 2 
            - topic of the game 
            - option to choose between 3 different topics #### Play button 
            - interactive button 
        #### Instructions field:
            - text block
   2. Game page 
        #### Score:
            - header with players names and their total score. 
        #### Menu: 
            - history 
            - on click display users history during the open session of the game 
            - hints 
            - on click randomly display a funny tips for a users 
            - instructions 
            - on click show a text block with instructions of the game 
        #### Board: 
            - playground 
            - start cell 
            - finish cell 
            - path curve 
            - magic cell 
            - bad magic 
            - good magic 
            - challenge cell 
            - death bog 
            - wizard forest 
            - players chip 
        #### Stop button 
        #### Navigation menu on the bottom:
            - stop / resume button 
            - timer for a questions 
            - goes backwards from 60 to 0. 
            - roll dice buttons display a random dice 
        #### Pop up windows:
            - test 
            - dark magic 
            - white magic 
            - start of the game 
            - end of the game 
            - stop / resume game 
  ### Back-end: 
   1. Storage: / Class (Model) 
        #### Questions: / hashMap<String, ArrayList> 
            - easy level 
            - hashMap<String, boolean> 
            - medium level 
            - hashMap<String, boolean> 
            - hard level 
            - hashMap<String, boolean> 
        #### Hints / ArrayList<>()
        #### History: / hashMap<Integer, ArrayList> 
        ##### Game: ArrayList<>() 
            - data and time 
            - number of player 
            - score of each player 
            - topic - level 
            - name of the winner if the game finished or “no finished” if the game wasn’t finished. (No one player reached the finish) 
            - time scope of the game 
        #### Instructions / String 
    2. Computing: / Class (Controller) 
        - Timer for the test (Navigation class) 
        - Generator of random numbers for hints (Many class) 
        - Generator of random number for dice (Navigation class) 
        -  Change the position of the player’s chip according to the dice indication and the result of the move (Board class) 
        - Extend menu (Manu class) 
        - Freeze the game (Game class) 
        - Store the result of the game in IO File (View class) 
    3. Processing: / (View) 
        - Ability to explicitly move objects on the board by mouse 
        - Listen all user's events 
        - Represent the changes in the game according to users behavior on the screen

## Program flow:

![alt text](https://github.com/NovaXam/Adventures/blob/master/Planning/Adventures.png "Flow chart")

## Schedule:

   1. Day1 - planning, UX and mockups. Game class structure. - 8 human / hours. (2 planning, 1 UX, 2 Mockups, 3 Game class structure);
   2. Day2 - coding game logic and testing - 12 human / hours . (Back-end)
   3. Day3 - making game graphics and coding front-end part of the game and testing - 12 human / hours
   4. Day4 - presentations - 2 human / hours.

## UX: 
  ### Personas: 
   1. Children at the age up to 10, who likes a board game and familiar with a computer and the main logic flow of the board game. 
   2. Parents who would like to spend a time with their children in a fun and educations manner.

   ### Epic: Persona wants to have fun with his friends/relatives in digital world in old fashion way. 

   ### User story:
        - He wants to interact with a computer during the game. 
        - He is interesting to compete.
        - He wants to track a progress in the game and evaluate his chances to win in any stage of the game.
        - He want to have an access for the hints and instructions of the game at any time.
        - He want to be able to stop the game and resume.
        - He want to choose different topic of adventure.

## Mockups

   #### Front page
![alt text] (https://github.com/NovaXam/Adventures/blob/master/Planning/Mockups/Front_page.JPG "Front page")
   
   #### Game page
![alt text] (https://github.com/NovaXam/Adventures/blob/master/Planning/Mockups/Game_page.JPG "Game page")
   
   #### Dark magic
![alt text] (https://github.com/NovaXam/Adventures/blob/master/Planning/Mockups/Dark_magic.JPG "Dark magic")

   #### White magic
![alt text] (https://github.com/NovaXam/Adventures/blob/master/Planning/Mockups/Bright_magic.JPG "White magic")

   #### Menu slide
![alt text] (https://github.com/NovaXam/Adventures/blob/master/Planning/Mockups/Menu_slide.JPG "Menu slide")

   #### Start popup
![alt text] (https://github.com/NovaXam/Adventures/blob/master/Planning/Mockups/Start_popup.JPG "Start popup")

   #### Test challenge
![alt text] (https://github.com/NovaXam/Adventures/blob/master/Planning/Mockups/Test_challenge.JPG "Test challenge")

   #### Winner popup
![alt text] (https://github.com/NovaXam/Adventures/blob/master/Planning/Mockups/Winner_popup.JPG "Winner popup")








