public class stringRunner {
    public static void main(String[] args) {

        String varName = "Hello how are you today?";
        int strLen = varName.length();
        System.out.println(varName.indexOf("you"));

        String varName1 = "AP CSA is awesome!";
        String aweStr = varName1.substring(10,13);
        System.out.println(aweStr);
        System.out.println(varName1);

        String awe = varName1.substring(10,17);
        System.out.println(awe);
    }
}