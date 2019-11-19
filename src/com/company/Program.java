package com.company;

import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    Scanner input = new Scanner(System.in);
    ArrayList<String> originalArrayList = new ArrayList<>();
    ArrayList<String> modifiedArrayList = new ArrayList<>();

    public Program() {

    }

    public void run() {
        originalArrayList = loadArrayList();
        modifiedArrayList = splitArrayList(originalArrayList);
        for (String string :
                modifiedArrayList) {
            System.out.println(string);
        }

        //saveArrayList(modifiedArrayList);
        System.out.printf("" +
                "Files saved.\n" +
                "Press enter to exit");
        input.nextLine();
    }

    private ArrayList<String> loadArrayList(){
        System.out.println("Enter filename:");
        String fileName = input.nextLine();
        return (ArrayList<String>)FileUtils.loadText(fileName);
    }
    private ArrayList<String> splitArrayList(ArrayList<String> arrayList){
        ArrayList<String> newArrayList = new ArrayList<>();
        for (String string :
                arrayList) {
            String[] splitString = string.split(":");
            newArrayList.add(splitString[splitString.length - 1]);
        }
        return newArrayList;
    }
    private void saveArrayList(ArrayList<String> arrayList){
        System.out.println("Enter filename:");
        String fileName = input.nextLine();
        FileUtils.saveText(fileName, arrayList, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }
}
