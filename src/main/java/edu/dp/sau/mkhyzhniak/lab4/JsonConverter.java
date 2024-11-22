package edu.dp.sau.mkhyzhniak.lab4;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import edu.dp.sau.mkhyzhniak.lab3.model.University;


public class JsonConverter {
    private static final Gson gson = new Gson();
    public static void writeToFile(String filePath, University university) {
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(university, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static University readFromFile(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            return gson.fromJson(reader, University.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
