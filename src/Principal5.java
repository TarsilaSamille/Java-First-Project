import java.util.Scanner;

public class Principal5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String p, c, m;
		float vM;

		System.out.println("--------CARRO--------");
		System.out.println("\n     ___________\n" + "    //   |||   \\\n" + " __//____|||____\\____ \n"
				+ "| _|      |       _  ||\n" + "|/ /_____|_____ _/ /_||\n" + "_/ /_____________/ /___ \n");

		System.out.println("");

		// IMFORMAÇÃO
		System.out.println("---Digite---");
		System.out.print("A placa do carro:");
		p = sc.nextLine();
		System.out.print("A cor do carro:");
		c = sc.nextLine();
		System.out.print("O modelo do carro:");
		m = sc.nextLine();
		System.out.print("A velocidade máxima do carro:");
		vM = sc.nextFloat();

		int qP;

		do {
			System.out.print("A quantidade de portas:");
			qP = sc.nextInt();
			if (qP < 2) {
				System.out.println("----ERROR----\nNUMERO DIGITADO MENOR QUE 2, DIGITE OUTRO");
			}
		} while (qP < 2);

		Carro carroagem = new Carro(p, c, m, qP, vM);

		while (!carroagem.isLigado()) {
			System.out.print("\nDigite:\n*1-Informação sobre o carro \n*2-Ligar o carro\n:");
			int x = sc.nextInt();
			if (x == 1) {
				System.out.println("Placa:" + carroagem.getPlaca() + "\nCor:" + carroagem.getCor() + "\nModelo:"
						+ carroagem.getModelo() + "\nQuantidade de Portas:" + carroagem.getQtdPortas()
						+ "\nVelocidade Maxima:" + carroagem.getVelocidadeMaxima() + "km/h");

			} else if (x == 2) {
				carroagem.ligar();
			}
		}

		while (carroagem.isLigado()) {
			System.out.println("\n\n---CARRO LIGADO---\n");
			System.out.println("Velocidade Atual:" + carroagem.getVelocidadeAtual() + "km/h");
			System.out.print(
					"Digite:\n*1-Informação sobre o carro \n*2-Acelerar\n*3-Frear\n*Obs:Para desligar freie até a velocidade ser 0\n:");
			int x = sc.nextInt();
			if (x == 1) {
				System.out.println("Placa:" + carroagem.getPlaca() + "\nCor:" + carroagem.getCor() + "\nModelo:"
						+ carroagem.getModelo() + "\nQuantidade de Portas:" + carroagem.getQtdPortas()
						+ "\nVelocidade Maxima:" + carroagem.getVelocidadeMaxima() + "km/h");

			} else if (x == 2) {
				System.out.print("Acelerar quantos km/h?");
				float a = sc.nextFloat();
				carroagem.acelerar(a);
				if (carroagem.getVelocidadeAtual() == carroagem.getVelocidadeMaxima()) {
					System.out.println("\n\n---Velocidade Maxima---\n");
				}
			}else if (x == 3) {
				System.out.print("Frear quantos km/h?");
				float f = sc.nextFloat();
				carroagem.frear(f);
				if (carroagem.getVelocidadeAtual()== 0) {
					System.out.println("\n\n---Velocidade = 0---\n---O CARRO FOI DESLIGADO---");
					carroagem.desligar();
				}
			} 
		}
	}
}
