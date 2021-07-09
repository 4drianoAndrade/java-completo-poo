package entities;

public class Employee {

	// ATRIBUTOS (DADOS)
	public String nome;
	public double valorPorHora;
	public int horas;

	// MÉTODOS (FUNÇÕES) (COMPORTAMENTO)
	public double total() {

		return valorPorHora * horas;
	}
	
	/*
	Dados do primeiro funcionário:
	Ana
	80.00
	10
	Dados do segundo funcionário:
	Joao
	50.00
	12
	Total = 1400.00
	*/
}
