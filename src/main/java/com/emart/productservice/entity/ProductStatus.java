package com.emart.productservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.emart.productservice.model.DateAndOperation;

import lombok.Data;

@Data
@Entity
@Table(name = "productStatus")
public class ProductStatus extends DateAndOperation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productStatusId;
	private String productStatus;

}
