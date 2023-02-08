package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contracts {
	private Integer number;
	private LocalDate date;
	private Double totValue;
	
	private List<Installment> installments = new ArrayList<>();
	
	public Contracts(Integer number, LocalDate date, Double totValue) {
		this.number = number;
		this.date = date;
		this.totValue = totValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotValue() {
		return totValue;
	}

	public void setTotValue(Double totValue) {
		this.totValue = totValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}	
}
