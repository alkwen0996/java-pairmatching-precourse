package pairmatching.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class Crews {
    private static List<Crew> crews;

    public boolean isEvenNumber(){
        return crews.size() % 2 == 0;
    }

}
