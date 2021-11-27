package com.pb.sendetskij.hw9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class FileNumbers {



        public static void main(String[] args) throws Exception {
              String fileName = "D:\\numbers.txt";
            if ((new File(fileName)).exists()) {
                System.out.println("!!!! Файл numbers.txt вже існує");
                System.out.println("!!!! Ви дійсно бажаєте перезаписати файл? (Y\\N)");
                Scanner scan = new Scanner(System.in);
                String answerIn = scan.nextLine();
                if(answerIn.equals("Y") || answerIn.equals("y")){
                    //удаление файла
                    Files.delete(Paths.get("D:\\numbers.txt"));
                    System.out.println(createNumbersFile());
                }
            } else {
                System.out.println(createNumbersFile());
            }
            System.out.println(createOddNumbersFile());
        }   ;

            private static Object createNumbersFile() throws IOException {
                Path testFile1 = Files.createFile(Paths.get("D:\\numbers.txt"));
                try (Writer file = new FileWriter("D:\\numbers.txt")) {
                    int[][] array = new int[10][10];
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array.length; j++) {
                            //создадим рандомное число
                            int max = 99;
                            int min = 1;
                            Random rand = new Random();
                            int randomNum = rand.nextInt((max - min) + 1) + min;
                            array[i][j] = randomNum;
                            file.write(array[i][j] + " ");
                        }
                        file.write("\n");
                    }
                    String answer = "Файл створено";
                    return answer;
                } catch (Exception e) {
                    e.getStackTrace();
                    return null;
                }
            }


    private static Object createOddNumbersFile() throws IOException {
        int numRecords = 10;
        int numColumns = 10;
        int[][] records = new int[numRecords][numColumns];
        try {
            Scanner autoInventory = new Scanner(new File("D:\\\\numbers.txt"));
            for (int i = 0; i < numRecords && autoInventory.hasNextLine(); i++) {
                String rowData = autoInventory.nextLine();
                String[] colData = rowData.split(" ");
                for (int j = 0; j < colData.length && j < numColumns; j++) {
                    if (new Integer(colData[j])%2 == 0) {
                        records[i][j] = 0;
                    }else{
                        records[i][j] = new Integer(colData[j]);

                    }
                }
            }
            try (Writer file = new FileWriter("D:\\odd-numbers.txt")) {
                for (int i = 0; i < records.length; i++) {
                    for (int j = 0; j < records.length; j++) {
                        int array = records[i][j];
                        file.write(array + " ");
                    }
                    file.write("\n");
                }
                String answer = "Файл створено";
                return answer;
            } catch (Exception e) {
                e.getStackTrace();
                return null;
            }

        } catch (FileNotFoundException except) {
            return numRecords;
        }



    }
}
