package edu.dp.sau.mkhyzhniak.lab3;

import edu.dp.sau.mkhyzhniak.lab3.model.*;
import edu.dp.sau.mkhyzhniak.lab3.controller.*;

    public class Run {

        public static void main(String[] args) {
            University university = UniversityCreator.createTypicalUniversity();
            UniversityCreator.printUniversityInfo(university);
        }
    }