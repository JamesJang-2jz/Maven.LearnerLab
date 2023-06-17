package io.zipcoder.interfaces;


import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ZipCodeWilmington {
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture((Learner[]) students.toArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        instructors.findById(id).lecture((Learner[]) students.toArray(), numberOfHours);
    }

    public Map<Student, Double> getStudyMap(){
        Map<Student, Double> studyMap = new HashMap<>();
        for (Student s : students) {
            studyMap.put(s, s.getTotalStudyTime());
        }
        return studyMap;
    }

}
