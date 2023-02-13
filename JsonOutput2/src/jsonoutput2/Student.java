package jsonoutput2;

import java.util.Arrays;

/**
 *
 * @author ethanlemin
 */
public class Student {
    
    private final String firstName;
    private final String lastName;
    private final double gpa;
    private final PhoneNumber phoneNumber;
    private final String[] skills;
    
    public Student(String studentInfo) {
        String[] stringParts = studentInfo.split(",\\s");
        lastName = stringParts[0];
        firstName = stringParts[1];
        gpa = Double.parseDouble(stringParts[2]);
        
        String[] phoneParts = stringParts[3].split("-");
        String areaCode = phoneParts[0];
        String prefix = phoneParts[1];
        String lineNumber = phoneParts[2];
        phoneNumber = new PhoneNumber(areaCode, prefix, lineNumber);
        
        skills = stringParts[4].split(";");
    }

    @Override
    public String toString() {
        String areaCode = String.valueOf(phoneNumber).substring(0,3);
        String prefix = String.valueOf(phoneNumber).substring(4,7);
        String lineNumber = String.valueOf(phoneNumber).substring(8);

        return String.format("[firstName: %s, lastName: %s, gpa: %.1f, phoneNumber=(%s) %s-%s, skills: %s]", 
                firstName, lastName, gpa, areaCode, 
                prefix, lineNumber, Arrays.toString(skills));
    }
    
}
