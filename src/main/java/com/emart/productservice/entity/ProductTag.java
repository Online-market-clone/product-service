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
@Table(name = "productTag")
public class ProductTag extends DateAndOperation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productTagId;

	@ManyToOne
	@JoinColumn(name = "productId")
	private Product product;

	@ManyToOne
	@JoinColumn(name = "tagId")
	private Tag tag;
}
