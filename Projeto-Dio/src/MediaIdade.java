import java.util.Scanner;

class Main {
public static void main(String[] args) {
     Scanner leitor = new Scanner(System.in);
       
     int idade1 = leitor.nextInt();
     int idade2 = leitor.nextInt();
     int idade3 = leitor.nextInt();

      double  m = (idade1 + idade2 + idade3)/3;

        
        if (m<=26) {System.out.printf("Jovem!");
          
        } 
         else if (m<=60) {System.out.printf("Adulta!");
          
        }
        else  {System.out.printf("Idosa!");
      
      }
    }
  }

    