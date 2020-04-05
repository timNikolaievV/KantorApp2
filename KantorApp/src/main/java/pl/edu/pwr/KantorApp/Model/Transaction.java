package pl.edu.pwr.KantorApp.Model;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public class Transaction extends BaseEntity {
     
   protected BigDecimal amountPLN;
    protected BigDecimal amountValute;
    protected LocalDateTime dateTime;
    protected boolean isSell;
    protected ExchangeRate exchangeRate;
     
	
	
	/**
	 * @param id
	 * @param amountPLN
	 * @param amountValute
	 * @param dateTime
	 * @param isSell
	 * @param exchangeRate
	 */
	public Transaction(int id, BigDecimal amountPLN, BigDecimal amountValute, LocalDateTime dateTime, boolean isSell,
			ExchangeRate exchangeRate) {
		super(id);
		this.amountPLN = amountPLN;
		this.amountValute = amountValute;
		this.dateTime = dateTime;
		this.isSell = isSell;
		this.exchangeRate = exchangeRate;
	}
	/**
	 * @return the amountPLN
	 */
	public BigDecimal getAmountPLN() {
		return amountPLN;
	}
	/**
	 * @param amountPLN the amountPLN to set
	 */
	public void setAmountPLN(BigDecimal amountPLN) {
		this.amountPLN = amountPLN;
	}
	/**
	 * @return the amountValute
	 */
	public BigDecimal getAmountValute() {
		return amountValute;
	}
	/**
	 * @param amountValute the amountValute to set
	 */
	public void setAmountValute(BigDecimal amountValute) {
		this.amountValute = amountValute;
	}
	/**
	 * @return the dateTime
	 */
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	/**
	 * @param dateTime the dateTime to set
	 */
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	/**
	 * @return the isSell
	 */
	public boolean isSell() {
		return isSell;
	}
	/**
	 * @param isSell the isSell to set
	 */
	public void setSell(boolean isSell) {
		this.isSell = isSell;
	}
	/**
	 * @return the exchangeRate
	 */
	public ExchangeRate getExchangeRate() {
		return exchangeRate;
	}
	/**
	 * @param exchangeRate the exchangeRate to set
	 */
	public void setExchangeRate(ExchangeRate exchangeRate) {
		this.exchangeRate = exchangeRate;
	} 
    

}
