package pl.edu.pwr.KantorApp.Repository;

import java.util.ArrayList;
import java.util.List;

import pl.edu.pwr.KantorApp.Model.Valute;

public class ValuteRepository {
	protected List<Valute> valutes = new ArrayList<Valute>();

	public ValuteRepository() {
		valutes.add(new Valute("USD", "USAdollar"));
		valutes.add(new Valute("UAH", "Hryvnia"));
		valutes.add(new Valute("PLN", "Zloty"));
		valutes.add(new Valute("KRN", "Krony"));

	}

	/**
	 * @param valutes
	 */
	public ValuteRepository(List<Valute> valutes) {
		super();
		this.valutes = valutes;
	}

	/**
	 * @return the valutes
	 */
	public List<Valute> getValutes() {
		return valutes;
	}

	/**
	 * @param valutes the valutes to set
	 */
	public void setValutes(List<Valute> valutes) {
		this.valutes = valutes;
	}

}
