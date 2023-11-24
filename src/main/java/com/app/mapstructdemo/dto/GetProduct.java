package com.app.mapstructdemo.dto;

import java.math.BigDecimal;

import com.app.mapstructdemo.entity.Category;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetProduct {

	private Long productId;
	
	private String productName;
	
	private String creationData;
	
	private String price;
	
	private GetCategory productCategory;

}
