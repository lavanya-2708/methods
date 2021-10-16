package loops;

public class WhileLoop {
    public static void main(String[] args) {

        int i = 1; //initialization
        while(i<=10){ //condition
            System.out.println(i);
            i++; //incremental or decremental
        }

        System.out.println("********");

        for (int j=1;j<=10;j++){
            System.out.println(j);
        }
        //print 10 to 1
        System.out.println("********");
        for (int k=10;k>=1;k--){
            System.out.println(k);
        }

    }
}
