package com.example.demo;

import com.example.model.ListLichSu;
import com.example.model.SuKien;
import com.example.model.Vua;

import java.io.IOException;

public class testjson {
    public static void main(String[] args) throws IOException {
        ListLichSu listLichSu = new ListLichSu();
        String currentDirectory = System.getProperty("user.dir");
        String nameFile = currentDirectory + "/src/main/java/com/example/lichsu.json";
        listLichSu = JsonFileParser.parseJsonFile(nameFile);
        for (SuKien vua : listLichSu.getSuKiens()) {
            System.out.println(vua.getTen());
        }
    }
}
