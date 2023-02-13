package jsonoutput2;

/**
 *
 * @author ethanlemin
 */
public class PhoneNumber {
    
    private final int areaCode;
    private final int prefix;
    private final int lineNumber;
    
    public PhoneNumber(String areaCode, String prefix, String lineNumber) {
        this.areaCode = Integer.parseInt(areaCode);
        this.prefix = Integer.parseInt(prefix);
        this.lineNumber = Integer.parseInt(lineNumber);
    }
    
    @Override
    public String toString() {
        return String.format("%d-%d-%d", areaCode, prefix, lineNumber);
    }
    
}
