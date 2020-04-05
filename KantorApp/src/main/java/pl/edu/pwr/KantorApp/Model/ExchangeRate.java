package pl.edu.pwr.KantorApp.Model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ExchangeRate {
	protected String valuteID;
	protected BigDecimal sell;
	protected BigDecimal buy;
	protected LocalDate date;
	
	/**
	 * @param valuteID
	 * @param sell
	 * @param buy
	 * @param date
	 */
	public ExchangeRate(String valuteID, BigDecimal sell, BigDecimal buy, LocalDate date) {
		super();
		this.valuteID = valuteID;
		this.sell = sell;
		this.buy = buy;
		this.date = date;
	}
	
	/**
	 * @return the valuteID
	 */
	public String getValuteID() {
		return valuteID;
	}
	
	/**
	 * @param valuteID the valuteID to set
	 */
	public void setValuteID(String valuteID) {
		this.valuteID = valuteID;
	}
	/**
	 * @return the sell
	 */
	public BigDecimal getSell() {
		return sell;
	}
	/**
	 * @param sell the sell to set
	 */
	public void setSell(BigDecimal sell) {
		this.sell = sell;
	}
	/**
	 * @return the buy
	 */
	public BigDecimal getBuy() {
		return buy;
	}
	/**
	 * @param buy the buy to set
	 */
	public void setBuy(BigDecimal buy) {
		this.buy = buy;
	}
	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

}
