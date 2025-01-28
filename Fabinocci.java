import java.util.Scanner;
public class Fabinocci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("how many terms");
        int num=scanner.nextInt();
        int a=0;
        int b=1;
        int count=0;
        if(num<0){
            System.err.println("enter positive number");
        }else if (num ==1){
            System.out.println(a);
        }else{
            System.out.println("fibonocci sequence:");
            while (count<num){
                System.out.println(a);
                int nth=a+b;
                a=b;
                b=nth;
                count+=1;
            }
        }
    scanner.close();    
    }   
}
