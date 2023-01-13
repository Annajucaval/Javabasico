import java.util.Scanner;

 class IdadeTurma {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        

  int i1 = 7;
  int i2 = 14;
  int i3 = 22;
  int soma = 0;
int count = 0;
  do {
System.out.printf("Idade da Turma");
i1 = leitor.nextInt();
i2 = leitor.nextInt();
i3 = leitor.nextInt();

soma = soma + i1 + i2 + i3;



  }while(count < 3);


 
       
  if (soma/3<=26) {System.out.println("Joven!");
        
}else if(soma>=60) {System.out.println("Idosa!");
}

    }
}
    