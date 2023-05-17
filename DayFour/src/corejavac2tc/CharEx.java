package corejavac2tc;

public class CharEx {
    public static void main(String[] args) {
        char myChar = 'A'; 
        System.out.println("myChar = " + myChar);

        myChar++; 
        
        System.out.println("After incrementing, myChar = " + myChar);
        int asciiCode = (int) myChar;
        System.out.println("The ASCII code for myChar is " + asciiCode);
    }
}

