package loops;

import com.sun.deploy.security.SelectableSecurityManager;

public class IfElse {
    public static void main(String[] args) {
        int a = 8;
        int b = 10;
        if (b > a) {
            System.out.println("b is greater than a");
        } else {
            System.out.println("a is greater than b");
        }

        //comparison operators
        int c = 3;
        int d = 6;
        if (c == d) {
            System.out.println("c and d are equal");
        }
        else{
            System.out.println("c and d are not equal");
        }

        int a1=100;
        int b1=200;
        int c1=300;
        if(a1>b1 & a1>c1){
            System.out.println("a1 is the greatest");
        }else if(b1>c1){
            System.out.println("b1 is the greatest");
        }else{
            System.out.println("c1 is the greatest");
        }

    }
}
