package pl.edu.pwr.KantorApp.Model;

public class BaseEntity {
	protected int id;

	
	/**
	 * @param id
	 */
	public BaseEntity(int id) {
		super();
		this.id = id;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

}
