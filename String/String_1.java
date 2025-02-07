package String;

public class String_1 {
    public static void main(String[] args) {
        // String operations
        String name = new String("Amar");
        String surName = new String("Manjarathkar");
        System.out.println("My name is "+ name +" " + surName);

        name = name.concat(surName);
        System.out.print(name);
    }
    
}
