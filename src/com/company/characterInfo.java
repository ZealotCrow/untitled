package com.company;
import java.util.Scanner;
//You've just encountered a new ally. Please provide their information
public class characterInfo {
    private String name;
    private String gender;
    private String bodyType;

    public void setName(String nam) {
        this.name = nam;
    }

    public static String getName() {
        Scanner characterName = new Scanner(System.in);
        String name = characterName.nextLine();
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        String weapon;
        String description;
        String[] characterClass = {"Paladin","Knight","Demon Slayer","God","Grief Cleric"};
        for (int i=0; i < characterClass.length; i++)
            if (characterClass[0] == "Paladin"){

            }
        return gender;
    }

}
