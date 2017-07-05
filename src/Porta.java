
public class Porta {
	private String cor;
	private float altura;
	private float largura;
	private boolean aberta;
	
	
	public Porta(String umaCor,float umaAltura, float umaLargura) {
		this.cor = umaCor;
		this.altura = umaAltura;
		this.largura = umaLargura;
	}
	
	public void abrir(){
		aberta = true;
	}

	public void fechar(){
		aberta = false;
	}

	public String verCor(){
		return cor;
	}

	public void pintar(String umaCor){
		this.cor = umaCor;
	}
	
	
	
	// Getters e Setters
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getLargura() {
		return largura;
	}
	public void setLargura(float largura) {
		this.largura = largura;
	}
	public boolean isAberta() {
		return aberta;
	}
	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}
	
}
