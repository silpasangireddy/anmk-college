public class prime
{
public static void main(String[] args) 
{
System.out.println("Prime numbers between 1 and 100 are:");
for (int i = 2; i <= 100; i++) 
{
if(isPrime(i)) 
{
System.out.println(i + " ");
}
}
}
public static boolean isPrime(int num) 
{
if (num<2) 
{
return false;
}
for (int i = 2; i <= Math.sqrt(num); i++) {
if (num % i == 0) 
return false;
}
return true; 
}
}