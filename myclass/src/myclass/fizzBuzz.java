package myclass;

public class fizzBuzz {
    public static void main(String args[]) {
        
        int x;
        for(x=1; x<=100; x++){
            if (x%3==0){
                System.out.println("fizz" + x);
            }
            if (x%5==0){
                System.out.println("buzz" + x);
            }
           
        }
    }
}

