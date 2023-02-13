package jsonoutput2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

/**
 *
 * @author ethanlemin
 */
public class JsonOutput {

    public static void main(String[] args) {
        ArrayList<Student> studentsList = new ArrayList<>();  
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        
        String[] studentInfo = {"Juan, Don, 3.3, 888-555-1212, snoozing;dreaming",
            "Jones, Tom, 3.5, 866-555-1212, kayaking;surfing;hiking;",
            "Woodhouse, Emma, 3.9, 860-555-1212, Java;Python;Javascript"};
        
        for(String str: studentInfo) {
            studentsList.add(new Student(str));
        }
        
        String studentsToJson = gson.toJson(studentsList);
        System.out.println("Printing to Json:");
        System.out.println(studentsToJson);
        
        
        ArrayList<Student> newStudentsList = gson.fromJson(studentsToJson,  
                new TypeToken<ArrayList<Student>>(){}.getType());
        
        System.out.println("\nPrinting to Java:");
        for(Student student: newStudentsList) {
            System.out.println(student);
        }
        
    }
    
}
