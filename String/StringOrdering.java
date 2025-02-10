package String;

public class StringOrdering {
    static String name [] = {"Madras", "Delhi", "Ahmedabad", "Culcutta", "Bombay"};
    public static void main(String[] args) {
        String temp = null;
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name.length; j++) {
                if(name[i].compareTo(name[j])< 0){
                    temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
                
            }
            
        }
        for (String name1 : name) {
            System.out.println(name1);
        }
    }
    
}
