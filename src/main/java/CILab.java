public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

@Override
public boolean detectCapitalUse() {
    if (myString == null) {
        return false;
    }

    if (myString.equals(myString.toUpperCase())) {
        return true;
    }

    String[] words = myString.split(" ");
    for (String word : words) {
        if (!Character.isUpperCase(word.charAt(0)) || 
            !word.substring(1).equals(word.substring(1).toLowerCase())) {
            return false;
        }
    }

    return true;
}








}



