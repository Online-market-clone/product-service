package com.emart.productservice.entity;

import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import com.emart.productservice.model.DateAndOperation;

import lombok.Data;

@Data
@Entity
@Table(name = "product")
public class Product extends DateAndOperation {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "productId", updatable = false, nullable = false)
	@Type(type = "uuid-char")
	private UUID productId;

	private String productName;
	private String description;

	@ManyToOne
	@JoinColumn(name = "productStatusId")
	private ProductStatus productStatus;

	private double regularPrice;
	private double discount;

	private int quantity;
	private boolean taxable = false;

	@OneToMany(mappedBy = "product")
	Set<ProductCategory> productCategories;

	@OneToMany(mappedBy = "product")
	private Set<ProductTag> productTags;

}
