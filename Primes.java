public class Primes {
    public static void main(String[] args) {
        int n= Integer.parseInt(args[0]);
        System.out.println("Prime numbers up to "+n+":");
       
            System.out.println(2);
            
        for (int i = 3; i < n+1; i++) {
            int count=0;
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                count++;
                
            }
        }
        if(count==0)
        System.out.println(i);
    }
    
}
}
