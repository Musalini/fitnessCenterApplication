package com.company;

import java.io.*;
import java.security.spec.RSAOtherPrimeInfo;
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
                if (splitLine[0].equals("S")) {
                    mem = new SingleClubMember('S',
                            Integer.parseInt(splitLine[1]), splitLine[2],
                            Double.parseDouble(splitLine[3]),
                            Integer.parseInt(splitLine[4]));
                } else {
                    mem = new MultiClubMember('M',
                            Integer.parseInt(splitLine[1]), splitLine[2],
                            Double.parseDouble(splitLine[3]),
                            Integer.parseInt(splitLine[4]));
                }
                m.add(mem);
                lineRead = reader.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error!");
        }

        return m;
    }

    public void appendFile(String mem) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("members.csv", true))){
            writer.write(mem + "\n");
        } catch (IOException e) {
            System.out.println("Error!");
        }
    }

    public void overWriteFile(LinkedList<Member> m) {
        String s;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("members.temp", false))){
            for (Member member : m) {
                s = member.toString();
                writer.write(s + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error!");
        }
    }
}
