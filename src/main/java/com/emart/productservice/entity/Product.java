package com.emart.productservice.entity;

import org.springframework.data.mongodb.core.mapping.Document;


//pretty sloppy set up just so we can get a basic template for products set up
@Document(collection = "productCollection")
public class Product {

	/*@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "productId", updatable = false, nullable = false)
	@Type(type = "uuid-char")
	private UUID productId;*/

	private String name;
	private String desc;
	private String id;
	private int price;
	private int amount;
	private float rating;

	public Product(String name, String id) {
		this.name = name;
		//this.desc = desc;
		this.id = id;
		/*this.price = price;
		this.amount = amount;
		this.rating = rating;*/
	}

	public String toString() {
		return String.format(
				"Product[id=%s, name='%s']",
				id, name);
	}

	//private String productName;
	//private String description;

	//@ManyToOne
	//@JoinColumn(name = "productStatusId")
	//private ProductStatus productStatus;

	//private double regularPrice;
	//private double discount;

	//private int quantity;
	//private boolean taxable = false;

	//@OneToMany(mappedBy = "product")
	//Set<ProductCategory> productCategories;

	//@OneToMany(mappedBy = "product")
	//private Set<ProductTag> productTags;

}
