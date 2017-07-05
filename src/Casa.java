
import java.util.Scanner;

public class Casa {
	private String cor;
	Porta portas[] = new Porta[0];
	Scanner sc = new Scanner(System.in);
	private int contador = 0 ;

	public void pintar(String umaCor) {
		this.cor = umaCor;
	}

	public void abrir(int n) {
		portas[n].abrir();
	}
	
	public void fechar(int n) {
		portas[n].fechar();
	}
	
	public void adicionarPorta() {
		portas=maisUmaPorta(portas);
			float a, l;
			System.out.print("\nDigite a cor da porta:");
			String c = sc.nextLine();
			System.out.print("Digite a altura da porta:");
			a = sc.nextFloat();
			System.out.print("Digite a largura da porta:");
			l = sc.nextFloat();

			Porta portal = new Porta(c, a, l);

		for (int i = 0; i < this.portas.length; i++) {
            if(this.portas[i] == null){
                this.portas[contador]=portal;
                break;
            }
        }		
	}
	

	public static Porta[] maisUmaPorta(Porta[] umArray) {
			Porta[] temp = new Porta[umArray.length + 1];
	        umArray = temp;
	        temp = null;

        return umArray;
	}
	
	public int contarPortasAbertas() {
		int t = 0;
		for (int c = 0; c < portas.length; c++) {
			if (portas[c].isAberta()) {
				t++;
			}
		}
		return t;
	}

	public int contarPortasFechadas() {
		int t = 0;
		for (int c = 0; c < portas.length; c++) {
			if (!portas[c].isAberta()) {
				t++;
			}
		}
		return t;
	}

		
		// Getters e Setters
		
		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public Porta[] getPortas() {
			return portas;
		}

		public void setPortas(Porta[] portas) {
			this.portas = portas;
		}

}
