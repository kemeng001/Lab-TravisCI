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

        if (myString.equals(myString.toUpperCase()) ||
                myString.equals(myString.toLowerCase()) ||
                Character.isUpperCase(myString.charAt(0)) && myString.substring(1).equals(myString.substring(1).toLowerCase())) {
            return true;
        }

        return false;
    }
}



