package com.emart.productservice.model;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass
public class DateAndOperation {

	private String createdBy;
	private String updateBy;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

	public DateAndOperation() {
		this.createdAt = LocalDateTime.now();
		this.updatedAt = this.createdAt;
	}
}
