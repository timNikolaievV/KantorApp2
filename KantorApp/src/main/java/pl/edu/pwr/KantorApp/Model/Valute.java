package pl.edu.pwr.KantorApp.Model;

public class Valute {
	protected String valuteID;
	protected String valuteName;
	
	/**
	 * @param valuteID
	 * @param valuteName
	 */
	public Valute(String valuteID, String valuteName) {
		super();
		this.valuteID = valuteID;
		this.valuteName = valuteName;
	}
	
	@Override
	public String toString() {
		return "Valute [valuteID=" + valuteID + ", valuteName=" + valuteName + "]";
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
	 * @return the valuteName
	 */
	public String getValuteName() {
		return valuteName;
	}

	/**
	 * @param valuteName the valuteName to set
	 */
	public void setValuteName(String valuteName) {
		this.valuteName = valuteName;
	} 	
}
