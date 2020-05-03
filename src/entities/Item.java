package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="items")
public class Item {
	
	@Id
	@Column
	private int ID;
	private String category;
	private String itemName;
	private int availableAmount;
	//add firms that provide the items

	public Item() {

	}
	
	public Item(String category, String itemName, int amount) {
		
		this.category = category;
		this.itemName = itemName;
		this.availableAmount = amount;
	}
	
}
