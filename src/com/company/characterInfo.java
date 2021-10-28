package com.company;
import java.util.Scanner;
//You've just encountered a new ally. Please provide their information
public class characterInfo {
    private String name;
    private static String gender;
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

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static String getGender() {
        String weapon;
        String description;
        String[] characterClass = {"Paladin","Knight","Demon Slayer","God","Grief Cleric"};
        for (int i=0; i < characterClass.length; i++)
            if (characterClass[0] == "Paladin"){
                weapon = "Holy Blade";
                description = "The bold paladin from the lands of Holy Terra stunts the growth of corruption where" +
                        "it is found and dashes it with the glory of it's deity";
                System.out.println(weapon + " " +description );
            }
            else if (characterClass[1] == "Knight"){
                weapon = "Jaded Blade";
                description ="The battle-strain and blood-stained knight of old dead-set on defending queen and country" +
                        "from does that may seek out it's heart";
            }
        return gender;
    }

}
