package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

public class FileHandler {
    public LinkedList<Member> readFile() {
        LinkedList<Member> m = new LinkedList<>();
        String lineRead;
        String[] splitLine;
        Member mem;

        try (BufferedReader reader = new BufferedReader(new FileReader("members.csv"))) {

            lineRead = reader.readLine();
            while (lineRead != null) {
                splitLine = lineRead.split(", ");
            }

        } catch (Exception e) {

        }

        return m;
    }

    public void appendFile() {

    }

    public void overWriteFile() {

    }
}
