package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of tax payers");
		int n = sc.nextInt();
		
		List<Pessoa> list = new ArrayList<>();
		
		for(int i = 1;i <= n; i++) {
			System.out.print("individual or company? ");
			char ch = sc.next().charAt(0);
			
			sc.nextLine();
			
			if(ch == 'i') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Yearly income: ");
				Double yearlyIncome = sc.nextDouble();
				System.out.print("Health expenditures: ");
				Double healthCare = sc.nextDouble();
				list.add(new PessoaFisica(name, yearlyIncome, healthCare));
			}else{
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Yearly income: ");
				Double yearlyIncome = sc.nextDouble();
				System.out.print("Number of employees: ");
				Integer numberOfWorkers = sc.nextInt();
				list.add(new PessoaJuridica(name, yearlyIncome, numberOfWorkers));
			}
		}
		
		System.out.println("Taxes Paid");
		for(Pessoa p : list) {
			System.out.println(p.getName() + ": " + "$" + String.format("%.2f", p.tax()));
		}
		
		sc.close();
	}
}

	
