package com.georgyarzhancev.javacore.chapter18;

import java.io.*;
import java.util.Properties;

public class PhoneBook {
    public static void main(String[] args) throws IOException {
        Properties phoneNumbers = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name, number;
        FileInputStream phoneBookIn = null;
        boolean changed = false;

        try {
            phoneBookIn = new FileInputStream("phonebook.dat");
        } catch (FileNotFoundException ignoreMissingFile) {
        }

        try {
            if (phoneBookIn != null) {
                phoneNumbers.load(phoneBookIn);
                phoneBookIn.close();
            }
        } catch (IOException e) {
            System.out.println("Error reading a file.");
        }

        do {
            System.out.println("Input name + " +
                    " ('exit' for ending): ");
            name = br.readLine();
            if (name.equals("exit")) continue;
            System.out.println("Input the number: ");
            number = br.readLine();
            phoneNumbers.put(name, number);
            changed = true;
        } while (!name.equals("exit"));
        // save phone book, if it is changed
        if (changed) {
            FileOutputStream fout = new FileOutputStream("phonebook.dat");
            phoneNumbers.store(fout, "Phone Book");
            fout.close();
        }
        // search number by name of user
        do {
            System.out.println("Put the name for search" +
                    " ('exit' for stop): ");
            name = br.readLine();
            if (name.equals("exit")) continue;
            number = (String) phoneNumbers.get(name);
            System.out.println(number);
        } while (!name.equals("exit"));
    }
}
