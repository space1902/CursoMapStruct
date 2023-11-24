package com.app.mapstructdemo.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;

import com.app.mapstructdemo.dto.GetProduct;
import com.app.mapstructdemo.entity.Product;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = {CategoryMapper.class})
public interface ProductMapper {

	@Mappings({
	@Mapping(source = "id", target = "productId"),
	@Mapping(source = "name", target = "productName"),
	@Mapping(source = "category", target = "productCategory"),
	@Mapping(source = "price", target = "price", numberFormat = "$0.00"),
	@Mapping(source = "creationData", target = "creationData",
	dateFormat = "yyyy-MM-dd HH-mm-ss")})
	GetProduct productToGetDto(Product product);
	
	@InheritInverseConfiguration
	Product dtoToProduct(GetProduct getProduct);
	
	List<GetProduct> toGetProductList(List<Product> preductList);
	
	List<Product> toProductList(List<GetProduct> getProductList);
}
