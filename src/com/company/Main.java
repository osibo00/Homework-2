package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("You lay down to go to sleep one night and find yourself awoken by loud explosions, rumbling, and what sounds like the roaring of a jet engine in the distance.");
        System.out.println("While you're rubbing the sleep from your eyes you suddenly realize you're not in bed. ");
        System.out.println("You leap up and attempt to study your surroundings, but you are forcibly pulled back into the crevice from which you stood.");
        System.out.println("\"Are you trying to get us seen? You should know the Eye of Sauron can spot us here.\" Yells someone angrily.");
        System.out.println("You turn your head to look who is yelling and you see two small, human like individuals huddled beside you against a boulder.");
        System.out.println("They have the appearance of a gnome. You have a hard time coming to your senses. As you look around at the landscape, a chill goes down your spine.");
        System.out.println("It is dark, but you can't make out if it is day or night. The terrain appears to be scorched and jagged. The foul oder you've been smelling frightens you most.");
        System.out.println("With another swivel of your head you come to understand why the place is so dreary. In the not so far distance stands a volcano, menacingly looming above all else.");
        System.out.println("You panic. You look to your companions for answers and attempt to speak, but no words come out.");
        System.out.println("Then one of them says \"Mordor is a lovely place isn't it?\" in a sarcastic manner. \" Everything here seems to want to harm you, even the air.\"");
        System.out.println();
        System.out.println("The two of them stare at you, as if waiting for you to say something.");
        System.out.println("Please respond with one of the following (Option 1, 2 or 3) by typing in the corresponding number:");
        System.out.println();
        System.out.println("(1) \"Why is the dirt trying to kill me?\" (1)");
        System.out.println("(2) \"Who are the heck are you?\" (2)");
        System.out.println("(3) \"What am I doing here?\" (3)");

        int firstDialogueResponse = scanner.nextInt();
        firstDialogue(firstDialogueResponse);

        System.out.println();
        System.out.println("\"Enough questions for now. We must save what little strength we have left and head on to Mount Doom\" says Sam. Frodo groans.");
        System.out.println("Sam gets up and helps Frodo onto his feet. They start walking towards the volcano which you know understand to be Mount Doom.");
        System.out.println("They walk about ten feet before Sam says \"You too now, I can't carry the both of you.\" You quickly hop to your feet, fearing to be left behind.");
        System.out.println("The three of you make your way from boulder to boulder as if you're hiding from something or someone.");
        System.out.println("Each step that you take towards Mount Doom fills you with dread. You have never felt so exhausted. You do not understand how this could be happening.");
        System.out.println("You begin to doubt your reality and believe that this is all just a bad dream. Your head starts spinning and you drop to the ground.");
        System.out.println("You have just enough energy to lift your head up off the ground. You see that Sam and Frodo are slowly walking further out of sight.");
        System.out.println();
        System.out.println("What do you do?");
        System.out.println("Please respond with one of the following (Option 1, 2 or 3) by typing in the corresponding number:");
        System.out.println("(1) You do nothing and continue laying there. You think to yourself that this can not be real and believe that you will wake up in your bed. (1)");
        System.out.println("(2) You force yourself to stand realizing that Sam and Frodo, albeit strangers, are your only way out of this situation. You forge ahead with all of your might. (2)");
        System.out.println("(3) You feel vulnerable laying there, but don't understand why you're following them. You're not adventurous. You begin to walk in the opposite direction since that way doesn't include a volcano. (3) ");

        int secondDialogueResponse = scanner.nextInt();
        secondDialogue(secondDialogueResponse);
        stopProgram(secondDialogueResponse);

        System.out.println("You reach an opening in the volcano. It appears to be an elaborate doorway carved into the side of the volcano. You begin to understand that this is definitely no ordinary volcano.");
        System.out.println("\"What is that we must do here?\" you ask. Sam responds.\"Frodo must throw the ring into the fire from whence it came so that Sauron may never regain his full strength\".");
        System.out.println("Sauron? Orcs? Mount Doom? This is definitely no where near New York City you think to yourself.");
        System.out.println("Frodo, Samwise, and yourself enter into the heart of the mountain. The heat is overwhelming and it becomes difficult to breathe. Frodo makes his way to the end of the rocky platform.");
        System.out.println("As Frodo reaches the edge, Sam yells \"Toss into the fire and be done with it!\"Frodo lingers and then disappears. \"Oh no\" Sam says in an exasperated tone.");
        System.out.println("\" We must not let him escape!\" yells Sam. He then runs towards where Frodo stood. He grabs what seems to be air, but the air starts fighting back. \"I've got him! Help!\" yells Sam in a concerned manner.");
        System.out.println();
        System.out.println("You find yourself frozen in place. You've never realized this until now, but you're deathly afraid of volcanoes and fire.");
        System.out.println("Please respond with one of the following (Option 1 or 2) by typing in the corresponding number:");
        System.out.println("(1) You can't compel yourself to move. Its like your legs are made out of stone and you have no ability to move them. (1)");
        System.out.println("(2) You find the courage to move towards the ensuing scuffle. You make your first stride and count off the steps in your head. (2)");

        int thirdDialogueResponse = scanner.nextInt();
        thirdDialogue(thirdDialogueResponse);
        stopProgramTwo(thirdDialogueResponse);

        System.out.println("Suddenly Frodo reappears. Sam and Frodo are fumbling and fighting over a bright gold ring. You are holding onto Sam so that neither he nor Frodo fall over.");
        System.out.println("Then it happens. They both lose grip on the ring and it flys over the ledge. For a split second you are entranced by it. It falls out of sight.");
        System.out.println("Frodo seems to relax and drops to the ground. Sam sits down next to him and begins to weep. \" It's done\" he states.");
        System.out.println();
        System.out.println("You don't quite understand everything that just transpired, you're just relieved that it's over. They invite you to rest beside them.");
        System.out.println("Do you walk over to them?");
        System.out.println("Yes or No ?");

        String sit = scanner.next();
        sitDown(sit);
        finalSceneEffects();

        System.out.println("You are thrown by an explosion. The ring's destruction has caused Mount Doom to start collapsing in on itself.");
        System.out.println("You regain your composure quickly. You haven't come this far just to perish here. You grab your new friends and dash to the opening through which you came in.");
        System.out.println("Frodo, Samwise, and yourself find refuge on a outcropping that rises above the sea of molten lava that surrounds you.");
        System.out.println("Not knowing whether you will ever make it off that rock, the only thought going through your head is that \"I'm undoubtedly going to be late for work tomorrow.\"");
        System.out.println();
        System.out.println("End");


    }

    public static void firstDialogue(int firstInput) {
        if (firstInput == 1) {
            System.out.println("Well I may have been exaggerating, still very dangerous though.");
            System.out.println("We're in Mordor remember? This placed is filled with orcs. And just any orcs, but the Uruk-hai.");
        } else if (firstInput == 2) {
            System.out.println("After all this way you're going to ask us who we are, like you don't know.");
            System.out.println("Maybe you just like hearing our names so I'll entertain the notion. Why I'm Samwise and this is Frodo.");
        } else if (firstInput == 3) {
            System.out.println("That's a silly question. You know why we're here. We must destroy the ring once and for all.");
            System.out.println("Look at poor Frodo, he carries such a burden. It must be destroyed");
        }
    }

    public static void secondDialogue(int secondInput) {
        switch (secondInput) {
            case 1:
                System.out.println("You drift out of consciousness. You are suddenly jolted awake. You feel yourself being lifted up and carried somewhere.");
                System.out.println("Unfortunately you aren't being carried to safety. The orcs that picked you up are hungry. The last thing you hear is \" Meat is back on the menu boys.\"");
                break;
            case 2:
                System.out.println("Luckily Sam and Frodo's pace has slowed and you are able to catch up. The gravity of the situation has given you a burst of energy.");
                System.out.println("You may not know why you're here, but you're going to help. You reach the slopes of Mount Doom. Together, the three of you ascend up the volcano.");
                break;
            case 3:
                System.out.println("After awhile of walking, you understand that you are lost. You have had enough of this place and begin to panic.");
                System.out.println("However, it is also extremely dark and you can't see where you're running. You end up stumbling off a cliff.");
                break;
        }
    }

    public static void stopProgram(int stopInput) {
        if (stopInput == 1 || stopInput == 3) {
            System.out.println();
            System.out.println("End");
            System.exit(0);
        }
    }

    public static void thirdDialogue(int thirdInput) {
        if (thirdInput == 1) {
            System.out.println("Mount Doom begins to rumble and shake more fiercely than before. Its almost as if it feels the presence of the ring and is calling out to the ring's master.");
            System.out.println("If only you had taken even a couple of steps. While your feet were planted firmly in place, a huge gusher of lava shoots up and lands directly over the spot where you stand.");
        } else if (thirdInput == 2) {
            for (int i = 2; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println("Left foot");
                } else if (i % 2 != 0) {
                    System.out.println("Right foot");
                }
            }
            System.out.println("You make it in the nick time to grab Sam, before he and what seems to be an invisible Frodo, fall off the ledge into the glowing furnace below.");
            System.out.println();
        }
    }

    public static void stopProgramTwo(int stopInput) {
        if (stopInput == 1) {
            System.out.println();
            System.out.println("End");
            System.exit(0);
        }
    }

    public static void sitDown(String sitInput) {
        if (sitInput.equalsIgnoreCase("yes") || sitInput.equalsIgnoreCase("no")) {
            System.out.println();
        }
    }

    public static void finalSceneEffects() {
        String boom = "BOOM";
        int i = 0;
        while (i < boom.length()) {
            char letter = boom.charAt(i);
            System.out.println(letter);
            i++;
        }
        System.out.println();
    }

}
