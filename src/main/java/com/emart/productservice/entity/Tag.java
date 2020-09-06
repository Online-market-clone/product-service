package com.emart.productservice.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.emart.productservice.model.DateAndOperation;

import lombok.Data;

@Data
@Entity
@Table(name = "tag")
public class Tag extends DateAndOperation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tagId;
	private String tagName;

	@OneToMany(mappedBy = "tag")
	private Set<ProductTag> productTags;
}
