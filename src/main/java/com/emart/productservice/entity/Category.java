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
@Table(name = "category")
public class Category extends DateAndOperation {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "categoryId", updatable = false, nullable = false)
	@Type(type = "uuid-char")
	private UUID categoryId;
	private String categoryName;

	@ManyToOne
	@JoinColumn(name = "parentId")
	private Category category;

	@OneToMany(mappedBy = "category")
	Set<ProductCategory> productCategories;

}
