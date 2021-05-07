package grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, List<Integer>> students = new HashMap<>();
        students.put("novice-programmer", new ArrayList<>(Arrays.asList(0, 70, 85, 100)));
        students.put("midlevel-programmer",new ArrayList<>(Arrays.asList(80, 90, 100, 100)));
        students.put("expert-programmer", new ArrayList<>(Arrays.asList(90, 90, 100, 100)));
        students.put("wizard-programmer", new ArrayList<>(Arrays.asList(100, 100, 100, 100)));
    }
}
