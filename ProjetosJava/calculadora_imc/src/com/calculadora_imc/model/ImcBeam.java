package com.calculadora_imc.model;

import java.text.DecimalFormat;

public class ImcBeam {
	private float peso;
	private float altura;
	public ImcBeam() {
		
	}
	
	public ImcBeam(String peso, String altura) {
		setPeso(peso);
		setAltura(altura);
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public void setPeso(String peso) {
		this.peso = (peso.matches("[0-9.]+")==false ? 0f:Float.parseFloat(peso));
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public void setAltura(String altura) {
		this.altura = (altura.matches("[0-9.]+")==false ? 0f:Float.parseFloat(altura));
	}

	public String getResult() {
		Float imc = peso / (altura * 2);
		if(imc.isNaN())
			   return "Não deu";
		
		StringBuilder result = new StringBuilder("IMC = "+ new DecimalFormat("#,#").format(imc));
		
		if(imc  < 17) {
			result.append(" Baixo Peso");
		}else if (imc >= 17  && imc  < 18.5) {
			result.append(" Peso Normal");
		}else if(imc >= 18.5 && imc < 24.9) {
			result.append(" Acima do Peso");
		}else if(imc >= 25 && imc < 29.9) {
			result.append(" Obesidade I");
		}else if(imc >= 30 && imc < 34.9) {
			result.append(" Obesidade II");
		}else {
			result.append(" Obesidade III");
		}
		return result.toString();
		
		
	}
	@Override
	public String toString() {
		return "ImcBeam [peso=" + peso + ", altura=" + altura + ", getResult()=" + getResult() + "]";
	}

	
}
