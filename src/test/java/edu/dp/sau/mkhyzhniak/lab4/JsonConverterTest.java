package edu.dp.sau.mkhyzhniak.lab4;

import edu.dp.sau.mkhyzhniak.lab3.controller.UniversityCreator;
import edu.dp.sau.mkhyzhniak.lab3.model.University;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class JsonConverterTest {
    @Test
    public void testJsonSerialization() {
        UniversityCreator universityCreator = new UniversityCreator();
        University oldUniversity = universityCreator.createUniversity(2, 2, 2, 2);
        String filePath = "test_university.json";
        JsonConverter.writeToFile(filePath, oldUniversity);
        University newUniversity = JsonConverter.readFromFile(filePath);
        assertEquals(oldUniversity, newUniversity);
    }
}