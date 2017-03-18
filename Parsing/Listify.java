package com.listify;

import java.util.List;
import java.util.LinkedList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Consumer;

public class Listify {
    public static String[] readToArray(String filename) {
        List<String> contents = new LinkedList<>();
        try{
            contents = read(filename);
        }catch(IOException e){
            e.printStackTrace();
            return null;
        }
        return contents.toArray(new String[contents.size()]);
    }

    private static List<String> read(String filename) throws java.io.IOException {
        return Files.readAllLines(Paths.get(filename));
    }
}