package entities;

public class Lanchonete {

	private final Integer valorCarne = 20;
	private final Integer valorFrango = 16;
	private final Integer valorBf = 6;
	private final Integer valorRefrigerante = 4;
	private final Integer valorSalada = 2;
	private final Integer valorMaionese = 1;

	private String carneOuFrango;
	private Integer qtdTipoCarne;
	private Integer qtdBf;
	private Integer qtdRefrigerante;
	private Integer qtdSalada;
	private Integer qtdMaionese;

	public Lanchonete() {
	}

	public Lanchonete(String carneOuFrango, Integer qtdTipoCarne, Integer qtdBf, Integer qtdRefrigerante,
			Integer qtdSalada, Integer qtdMaionese) {
		this.carneOuFrango = carneOuFrango;
		this.qtdTipoCarne = qtdTipoCarne;
		this.qtdBf = qtdBf;
		this.qtdRefrigerante = qtdRefrigerante;
		this.qtdSalada = qtdSalada;
		this.qtdMaionese = qtdMaionese;
	}

	public String getCarneOuFrango() {
		return carneOuFrango;
	}

	public void setCarneOuFrango(String carneOuFrango) {
		this.carneOuFrango = carneOuFrango;
	}

	public Integer getQtdTipoCarne() {
		return qtdTipoCarne;
	}

	public void setQtdTipoCarne(Integer qtdTipoCarne) {
		this.qtdTipoCarne = qtdTipoCarne;
	}

	public Integer getQtdBf() {
		return qtdBf;
	}

	public void setQtdBf(Integer qtdBf) {
		this.qtdBf = qtdBf;
	}

	public Integer getQtdRefrigerante() {
		return qtdRefrigerante;
	}

	public void setQtdRefrigerante(Integer qtdRefrigerante) {
		this.qtdRefrigerante = qtdRefrigerante;
	}

	public Integer getQtdSalada() {
		return qtdSalada;
	}

	public void setQtdSalada(Integer qtdSalada) {
		this.qtdSalada = qtdSalada;
	}

	public Integer getQtdMaionese() {
		return qtdMaionese;
	}

	public void setQtdMaionese(Integer qtdMaionese) {
		this.qtdMaionese = qtdMaionese;
	}

	public int total() {
		int soma = 0;
		if(getCarneOuFrango().equals("carne")) {
			return soma += getQtdTipoCarne() * valorCarne + getQtdBf() * valorBf + getQtdRefrigerante() * valorRefrigerante 
					+ getQtdSalada() * valorSalada + getQtdMaionese() * valorMaionese;
		} 
		else if(getCarneOuFrango().equals("frango")) {
			return soma += getQtdTipoCarne() * valorFrango + getQtdBf() * valorBf + getQtdRefrigerante() * valorRefrigerante 
					+ getQtdSalada() * valorSalada + getQtdMaionese() * valorMaionese;
		}
		return soma;
		
	}

}
