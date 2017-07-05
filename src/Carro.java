
public class Carro {
	
	private String placa;
	private String cor;
	private String modelo;
	private int qtdPortas;
	private boolean ligado;
	private float velocidadeMaxima;
	private float velocidadeAtual;
	
	
	public Carro(String p,String c,String m, int qP, float vM){
		this.placa = p;
		this.cor = c;
		this.modelo = m;
		this.qtdPortas = qP;
		this.velocidadeMaxima = vM;
	}
	
	
	public void acelerar(float umaQuantidade){
		if(isLigado()){
			this.velocidadeAtual +=umaQuantidade; 
			if(this.velocidadeAtual>=this.velocidadeMaxima){
				this.velocidadeAtual =this.velocidadeMaxima; 
			}
		}
		
	}
	
	public void frear(float umaQuantidade){
		if(isLigado()){
			this.velocidadeAtual -=umaQuantidade;
			if(this.velocidadeAtual<=0){
				this.velocidadeAtual = 0; 
			}
		}
	}
	
	public void ligar(){
		this.ligado = true ;
	}
	public void desligar(){
		this.ligado = false ;
	}

	
	
	// Getters e Setters
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getQtdPortas() {
		return qtdPortas;
	}
	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public float getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(float velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public float getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(float velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

}
