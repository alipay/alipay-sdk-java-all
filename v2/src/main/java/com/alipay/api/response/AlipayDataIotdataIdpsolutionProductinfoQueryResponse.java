package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ProductSize;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.iotdata.idpsolution.productinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-26 17:31:46
 */
public class AlipayDataIotdataIdpsolutionProductinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8713521828266626649L;

	/** 
	 * 商品品牌名称
	 */
	@ApiField("brand")
	private String brand;

	/** 
	 * 商品一级分类
	 */
	@ApiField("category_name_1")
	private String categoryName1;

	/** 
	 * 商品二级分类
	 */
	@ApiField("category_name_2")
	private String categoryName2;

	/** 
	 * 商品三级分类
	 */
	@ApiField("category_name_3")
	private String categoryName3;

	/** 
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/** 
	 * 商品图片链接
	 */
	@ApiField("image")
	private String image;

	/** 
	 * 商品长宽高描述
	 */
	@ApiField("size")
	private ProductSize size;

	/** 
	 * 商品规格描述
	 */
	@ApiField("specification")
	private String specification;

	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand( ) {
		return this.brand;
	}

	public void setCategoryName1(String categoryName1) {
		this.categoryName1 = categoryName1;
	}
	public String getCategoryName1( ) {
		return this.categoryName1;
	}

	public void setCategoryName2(String categoryName2) {
		this.categoryName2 = categoryName2;
	}
	public String getCategoryName2( ) {
		return this.categoryName2;
	}

	public void setCategoryName3(String categoryName3) {
		this.categoryName3 = categoryName3;
	}
	public String getCategoryName3( ) {
		return this.categoryName3;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsName( ) {
		return this.goodsName;
	}

	public void setImage(String image) {
		this.image = image;
	}
	public String getImage( ) {
		return this.image;
	}

	public void setSize(ProductSize size) {
		this.size = size;
	}
	public ProductSize getSize( ) {
		return this.size;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}
	public String getSpecification( ) {
		return this.specification;
	}

}
