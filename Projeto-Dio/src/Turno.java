import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

System.out.println("Em que turno você estuda?");


        char turno = leitor.next().toUpperCase().charAt(0);
        

        if (turno =='M') {System.out.println("Bom Dia!");

        }else if(turno == 'V'){System.out.println("Boa Tarde!");


        }else if(turno == 'N'){System.out.println("Boa Noite!");

        }else{System.out.println("Valor Inválido");

        }
      
        }
    }
