
import java.util.Scanner;

public class Principal1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n;
		int i;

		System.out.print("Digite seu nome:");
		n = sc.nextLine();
		System.out.print("Digite sua idade:");
		i = sc.nextInt();

		Pessoa humano = new Pessoa(n, i);

		int fa = 1;
		humano.verNome();
		humano.verIdade();
		while (fa == 1) {
			System.out.print("Digite 1 para fazer aniversario:");
			fa = sc.nextInt();
				if (fa == 1) {
					humano.fazAniversario();
				}
			System.out.println("\nNome:"+humano.verNome());
			System.out.println("Idade:"+humano.verIdade());
		}
	}

}
//soteste
