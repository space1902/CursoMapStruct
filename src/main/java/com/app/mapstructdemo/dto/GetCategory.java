package com.app.mapstructdemo.dto;

import com.app.mapstructdemo.entity.Category;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetCategory {

	@Id
	private Long categoryId;
	
	private String categoryName;
}
