package com.company;
import java.util.Scanner;
import java.util.Random;
//You've just encountered a new ally. Please provide their information
public class characterInfo {
    private String name;
    private static String characterSpecs;
    private String bodyType;

    public void setName(String nam) {
        this.name = nam;
    }

    public static String getName() {
        Scanner characterName = new Scanner(System.in);
        System.out.println("Enter the name of your valiant savior!");
        String name = characterName.nextLine();
        return name;
    }

    public void setCharacterSpecs(String characterSpecs) {
        this.characterSpecs = characterSpecs;
    }


    public static String getCharacterSpecs() {
        String weapon;
        String weaponIntro = "The weapon that this hero specializes in is the: ";
        String description;
        String[] characterClass = {"Paladin","Knight","Demon Slayer","God","Grief Cleric"};

        for (int i = 0; i < characterClass.length; )//Solve infinite issue

            if (characterClass[0] == "Paladin"){
                weapon = "Holy Blade";
                description = "The bold paladin from the lands of Holy Terra stunts the growth of corruption where" +
                        "it is found and dashes it with the glory of it's deity";
                System.out.println(weaponIntro + weapon);
                System.out.println(description);

            }
            else if (characterClass[1] == "Knight"){
                weapon = "Jaded Blade";
                description ="The battle-strain and blood-stained knight of old dead-set on defending queen and country" +
                        "from does that may seek out it's heart";
                System.out.println(weaponIntro + weapon);
                System.out.println(description);
            }
            else if(characterClass[2] == "Demon Slayer"){
                weapon = "Rinamusashi, The Void Katana";
                description = "The creeping chaos is vast and cold and there are those who need to be protected." +
                        "That's where you come in. You are the looker and the lurker of the abyss";
                System.out.println(weaponIntro + weapon);
                System.out.println(description);
            }
            else if (characterClass[3] == "God"){
                weapon = "The Entropy Chalice";
                description = "To call them a God in any mystical sense is incorrect. They have reached the ultimate human understanding of entropy and are able to grow from it" +
                        ", reaching the greatest possible path of their ilk";
                System.out.println(weaponIntro +weapon);
                System.out.println(description);
            }
            else if (characterClass[4] == "Grief Cleric"){
                weapon = "N/A";
                description = "Not a fighter in a physical sense but a fighter for the beautiful and decent. Set to access the others in you charge to fight again";
                System.out.println(weaponIntro + weapon);
                System.out.println(description);

            }
            else    {
                System.out.println("The heroes, while valiant and graceful, do not take kindly to having their time wasted. Journey on and continue you path!");
            }
        return characterSpecs;
    }

}
