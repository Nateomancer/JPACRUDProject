# JPACRUDProject

I learned a lot from this project, from building a srping boot/jpa website, tearing down the entire workspace, building the JPA project file, building the Spring Boot application, restoring from a previous commit, and creating a different branch to continue working from an older commit in your new workspace.  All of these lessons came from mistakes that completely broke the project.  I don't know what originally caused it to break, gradle began acting up maybe 30 minutes after class, and no matter how many refreshes or project cleans I did, it didn't come back online. Well it did for short while, and then it was gone.  The next day I decided to create  a new workspace, I learned how to build the workspace without instruction, and do some cool trouble shooting at every step. Eventually I got the project running, but then gradle decided it wasn't getting enough attention, and decided to break again.

That was when I decided I needed professional help and posted in Slack. It was past 10 PM, but i figured I should write a message and someone would get back to me hopefully tomorrow. To my surprise Will was willing to help. Thus began the most intense trouble shooting experience thus far, after an hour we got it working.  Gradle was happy and little did I know I also had another issues with my entity class. I gave my entity class a reserved MySQL word, Character. Silly Me.  What was misleading is that all my J unit tests passed with the class named Character. Oh well, some things are learned the hard way.

This project was challenging, other than the issues I faced in the beginning, I was still getting comfortable with JSPs and mapping methods to them in the controller, and passing parameters, using Get/Set requests, creating Models and Views.  It was challenging, even though studied and planned before starting, i still ran into trouble. But like i say, experience is the best teacher.  It took me longer than I'd care to admit, but I have the project running.  I plan on continuing this project on my own, as I like what i have made and think there is plenty of room to take it further. I would also like to make it look better with some CSS and Bootstrap, as i didn't get a chance to do that. I also would like to find a way to make my PC more reliable with these projects, for reasons I do not know yet, it seems to have an issue when a new workspace is created. It could be the m1 chip not working well with gradle or spring, or perhaps Tomcat, regardless whatever the issue is I'm hopeful it can be corrected.

#Description

This project is a simple character manager for the roleplaying game Dungeons and Dragons. The user can search for their character with the id, or they can search for their character with the characters name, or by entering both the characters job (fighter, wizard, etc) and race (human, elf, etc).  At the bottom of the screen they can see a table listing every character in the DB.  They can also create a new character, update a character, or delete a character.

The fields in the database are id, name, job, race, strength, dexterity, constitution, intelligence, and wisdom.  The basic stats for a Dnd character.  I had plans to add fields like alignment, character background, inventory, money, abilities, I think I will add them later on my own.

The code can be much dryer, but this was a learning experience. I decided to make my code readable for me first, making long descriptive methods and variable names, making things match, leaving comments, so that I can easily follow the flow of the program, which is the hardest part for me in JSP/Spring projects. I left a couple System.out.print statements so I can easily trouble shoot the program, and see how the program runs through each method. The code will be cleaned up soon. For now I think I had the ideal learning experience. Time to go to bed. It's very later, actually it's very early.

#technolgies
MacOS
Eclipse
MySQL
MySQL WorkBench
Git
ZSH Mac Terminal
Eclipse Sts
Java 8
JPA
JSTL
HTML
CSS
Spring Boot
Gradle
BootStrap
Atom
