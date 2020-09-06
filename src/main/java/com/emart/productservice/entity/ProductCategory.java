package com.emart.productservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.emart.productservice.model.DateAndOperation;

import lombok.Data;

@Entity
@Data
@Table(name = "productCategory")
public class ProductCategory extends DateAndOperation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productCategoryId;

	@ManyToOne
	@JoinColumn(name = "productId")
	private Product product;

	@ManyToOne
	@JoinColumn(name = "categoryId")
	private Category category;

}
