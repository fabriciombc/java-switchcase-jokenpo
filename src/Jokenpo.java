import java.util.Scanner;
import java.util.Random;

public class Jokenpo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int v1;
		
		System.out.println("Escolha entre 1, 2 e 3, sendo: ");
		System.out.println("Pedra = 1 ");
		System.out.println("Papel = 2 ");
		System.out.println("Tesoura = 3 ");
		
		System.out.println("Humano: ");
		v1 = sc.nextInt();
		
		
		Random rand = new Random(); //instance of Random class;
		int v2 = rand.nextInt((3 - 1) + 1) + 1; // generate Random number by computer
		System.out.println("Computer: " + v2);
		
		switch (v1) {
			case 1:
				
				switch (v2) {
					case 1: 
						System.out.println("Empate");
						break;
					case 2:
						System.out.println("Computer vence");
						break;
					case 3:
						System.out.println("Humano vence");
						default:
							System.out.println("Opcao invalida");
				} break;
			
			case 2:
				
				switch (v2) {
					case 1:
						System.out.println("Humano vence");
						break;
					case 2:
						System.out.println("Empate");
						break;
					case 3:
						System.out.println("Computer vence");
						default:
							System.out.println("Opcao invalida");
				} break;
				
			case 3:
				
				switch (v2) {
					case 1:
						System.out.println("Computer vence");
						break;
					case 2:
						System.out.println("Humano vence");
						break;
					case 3:
						System.out.println("Empate");
						default:
							System.out.println("Opcao invalida");
				} break;
				
				default:
					System.out.println("Opcao invalida");
		}

	}

}
