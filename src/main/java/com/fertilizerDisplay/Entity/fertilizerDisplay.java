package com.fertilizerDisplay.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="FERTILIZER_DIS")

public class fertilizerDisplay {
	
	@Id
	@Column(name="FERTILIZER_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int fertilizerId;
	
	  @Column(name="FERTILIZER_NAME")
	  private String fertilizerName;
	
	  @Column(name="FERTILIZER_TYPE")
	  private String fertilizerType;
	    
	  @Column(name="FERTILIZER_PRICE")
	  private float fertilizerPrice;

	  public fertilizerDisplay(int fertilizerId, String fertilizerName, String fertilizerType, float fertilizerPrice) {
			super();
			this.fertilizerId = fertilizerId;
			this.fertilizerName = fertilizerName;
			this.fertilizerType = fertilizerType;
			this.fertilizerPrice = fertilizerPrice;
		}			


	public int getFertilizerId() {
		return fertilizerId;
	}

	public void setFertilizerId(int fertilizerId) {
		this.fertilizerId = fertilizerId;
	}

	public String getFertilizerName() {
		return fertilizerName;
	}

	public void setFertilizerName(String fertilizerName) {
		this.fertilizerName = fertilizerName;
	}

	public String getFertilizerType() {
		return fertilizerType;
	}

	public void setFertilizerType(String fertilizerType) {
		this.fertilizerType = fertilizerType;
	}

	public float getFertilizerPrice() {
		return fertilizerPrice;
	}

	public void setFertilizerPrice(float fertilizerPrice) {
		this.fertilizerPrice = fertilizerPrice;
	}
}
