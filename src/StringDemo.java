public class StringDemo {
    public String str1 = "";
    public String str2 = "";

    public StringDemo(String str1, String str2){
        this.str1 = str1;
        this.str2 = str2;
    }
    public StringDemo(){
        System.out.println("This is a string demo.");
    }

    public void ConcatString(){
        System.out.println(str1 + str2);
    }

    public String FormatString(int a, float b, String str){
        String fs = String.format("%d" + "%f" + "%s", a, b, str);
        return fs;
    }
}
