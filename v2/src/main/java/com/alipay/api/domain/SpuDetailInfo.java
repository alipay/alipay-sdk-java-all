package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品信息
 *
 * @author auto create
 * @since 1.0, 2025-01-08 17:28:34
 */
public class SpuDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 7817732966441358256L;

	/**
	 * 商品分类
	 */
	@ApiField("category")
	private String category;

	/**
	 * 商品分类id
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 商品描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 商品goods id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 商品图片
	 */
	@ApiField("image")
	private String image;

	/**
	 * 商品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商品可售状态
	 */
	@ApiField("sales_status")
	private String salesStatus;

	/**
	 * 商品可售状态
	 */
	@ApiField("sales_status_desc")
	private String salesStatusDesc;

	/**
	 * 商品spuid
	 */
	@ApiField("spu_id")
	private String spuId;

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getImage() {
		return this.image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSalesStatus() {
		return this.salesStatus;
	}
	public void setSalesStatus(String salesStatus) {
		this.salesStatus = salesStatus;
	}

	public String getSalesStatusDesc() {
		return this.salesStatusDesc;
	}
	public void setSalesStatusDesc(String salesStatusDesc) {
		this.salesStatusDesc = salesStatusDesc;
	}

	public String getSpuId() {
		return this.spuId;
	}
	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}

}
