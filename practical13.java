// Write a java program to demonstrate use of “String” 
// class methods : chatAt(), contains(), format(), length(), 
// split()
class practical13{
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "World";
        String s4 = "Hello,World";
        String[] s3 = s4.split(",");
        System.out.println("\nFirst String : "+s1);
        System.out.println("Second String : "+s2);
        System.out.println("String for split is : "+s4+"\n");
        System.out.println("charAt() index 6 : "+s1.charAt(6)+"\n");
        System.out.println(String.format("%s contains() ? %s : %b",s1, s2, s1.contains(s2)));
        System.out.println("length() of "+s1+" : "+s1.length()+"\n");
        System.out.println(s1+"split() by , : ");
        for (String str : s3) {
            System.out.println(str);
        }
    }
}