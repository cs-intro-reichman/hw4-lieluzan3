public class Primes {
    public static void main(String[] args) {
        int n= Integer.parseInt(args[0]);
       int count2=0;
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
        count2++;
    
    }
    int pres=count2/n*100;
    System.out.println("There are "+ count2 + " primes between 2 and "+n +" ("+pres+"% are primes)");
    
}
}
