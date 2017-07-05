
import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c;
		float l,a;

		c = sc.nextLine();
		System.out.print("\nDigite a altura da porta:");
		a = sc.nextFloat();
		System.out.print("\nDigite a largura da porta:");
		l = sc.nextFloat();

		Porta portal = new Porta(c, a, l);
		
		if (portal.isAberta()) {
			System.out.println("Est� aberta");
		}else{
			System.out.println("Est� fechada");
		}
		
		int fa =1;
		
		while (fa == 1 || fa ==2) {
			System.out.print("Digite 1 para a abrir, 2 para fechar, 3 para mudar a cor e outro para parar:");
			fa = sc.nextInt();
				if (fa == 1) {
					portal.abrir();
				}else if(fa==2){
					portal.fechar();
				}else if(fa==3){
					System.out.print("Digite a cor da porta:");
					c = sc.nextLine();
					portal.pintar(c);
				}
		}
		
		if (portal.isAberta()) {
			System.out.println("A porta"+portal.verCor()+"est� aberta");
		}else{
			System.out.println("A porta"+portal.verCor()+"est� fechada");
		}
	}
}