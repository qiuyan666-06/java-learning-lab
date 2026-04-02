import java.util.Random;
import java.util.Scanner;

  public class Demo03exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("请猜一个1到100以内的数字");
        System.out.println("只有6次机会");
        int attempts = 0;
        int Max_attempts = 6;
        int rdNumber = rand.nextInt(100)+1;
        while(attempts < Max_attempts){
            int scNumber = sc.nextInt();
            attempts++;
            if(scNumber == rdNumber){
                System.out.println("猜对了✔");
                break;
            }else if(scNumber > rdNumber){
                System.out.println("猜大了");
            } else if (scNumber < rdNumber) {
                System.out.println("猜小了");
            }
            if(attempts < Max_attempts){
            System.out.println("机会还有"+(Max_attempts - attempts)+"次");}
            if(attempts == Max_attempts&&rdNumber != scNumber ){
                System.out.println("你这个废物,这都猜不中,正确答案是"+rdNumber);
            }
        }
    }
