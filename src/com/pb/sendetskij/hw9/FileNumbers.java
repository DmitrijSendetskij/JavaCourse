package com.pb.sendetskij.hw9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class FileNumbers {

    public static void main(String[] args) throws Exception {
        String fileName = "D:\\test.txt";
        if ((new File(fileName)).exists()) {
            System.out.println("!!!! Файл test.txt вже існує");
            System.out.println("!!!! Ви дійсно бажаєте перезаписати файл? (Y\\N)");
            Scanner scan = new Scanner(System.in);
            String answerIn = scan.nextLine();
            if(answerIn.equals("Y") || answerIn.equals("y")){
                //удаление файла
                Files.delete(Paths.get("D:\\test.txt"));
                System.out.println(createNumbersFile());
            }
        } else {
            System.out.println(createNumbersFile());
        }
        System.out.println(createOddNumbersFile());
    }

    ;

    private static Object createNumbersFile() throws IOException {
        Path testFile1 = Files.createFile(Paths.get("D:\\test.txt"));
        try (Writer file = new FileWriter("D:\\test.txt")) {
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
        String fileName = "D:\\test.txt";
        if ((new File(fileName)).exists()) {
            try (Scanner file = new Scanner(new BufferedReader(new FileReader("D:\\test.txt")))) {
                int [][] Array = new int[10][10];
                while(file.hasNextLine()) {
                    for (int i=0; i<Array.length; i++) {
                        String[] line = file.nextLine().trim().split(" ");
                        for (int j=0; j<line.length; j++) {
                            if (Array[i][j]%2 == 0) {
                                Array[i][j] = 0;
                            }else{
                                Array[i][j] = Integer.parseInt(line[j]);
                            }
                        }
                    }
                }
                return Arrays.deepToString(Array);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
