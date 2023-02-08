package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Contracts;
import entities.Installment;
import services.ContractService;
import services.PayPalServices;

public class Aplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Numero: ");
		int num = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double total = sc.nextDouble();
		
		Contracts contrat = new Contracts(num, date, total);
		
		System.out.print("Entre com o numero de pardelas: ");
		int n = sc.nextInt();
		
		ContractService contractService = new ContractService(new PayPalServices());
		
		contractService.processContract(contrat, n);
		
		System.out.println("Parcelas");
		for (Installment installment : contrat.getInstallments()) {
			System.out.println(installment);
		}
		sc.close();
	}

}
