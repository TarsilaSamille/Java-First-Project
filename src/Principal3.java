import java.util.Scanner;

public class Principal3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Casa casaDeTijolo = new Casa();

		System.out.println("                --------CASA--------");
		System.out.println("           _._._                       _._._\n"
				+ "          _|   |_                     _|   |_\n" + "          | ... |_._._._._._._._._._._| ... |\n"
				+ "          | ||| |  o  CASA PORTAS  o  | ||| |\n" + "          | *** |  ***    ***    ***  | *** |\n"
				+ "     ())  |[-|-]| [-|-]  [-|-]  [-|-] |[-|-]|  ())\n"
				+ "    (())) |     |---------------------|     | (()))\n"
				+ "   (())())| *** |  ***    ***    ***  | *** |(())())\n"
				+ "   (()))()|[-|-]|  :::   ..*..   :::  |[-|-]|(()))()\n"
				+ "   ()))(()|     | |~|~|  |_|_|  |~|~| |     |()))(()\n"
				+ "      []  |_____|_|_|_|__|_|_|__|_|_|_|_____|  []\n"
				+ "   ~ ~^^ @@@@@@@@@@@@@@/=======/@@@@@@@@@@@@@@ ^^~ ~\n");

		int x = 0;

		while (x != 4) {
			System.out.println(
					"\nDigite:\n*1-Adicionar Porta \n*2-Pintar Casa\n*3-Abrir ou Fechar Porta\n*4-Contar Portas");
			x = sc.nextInt();
			if (x == 1) {
				casaDeTijolo.adicionarPorta();
			} else if (x == 2) {
				System.out.print("Digite a cor:");
				String cC = sc.nextLine();
				casaDeTijolo.pintar(cC);
			} else if (x == 3) {
				System.out.print("Digite o número da porta:");
				int nP = sc.nextInt();
				System.out.print("Digite 1 para a abrir e 2 para fechar:");
				int fa = sc.nextInt();
				if (fa == 1) {
					casaDeTijolo.abrir(nP);
				} else if (fa == 2) {
					casaDeTijolo.fechar(nP);
				} 
			} else if (x == 4) {
					int pA = casaDeTijolo.contarPortasAbertas();
					System.out.print("Abertas:"+pA);
					int pF = casaDeTijolo.contarPortasFechadas();
					System.out.print("Fechadas:"+pF);

			}
		}

	}
}
