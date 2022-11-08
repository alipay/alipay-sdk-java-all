package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品库-商品信息同步
 *
 * @author auto create
 * @since 1.0, 2022-10-26 15:54:13
 */
public class AlipayIserviceCcmSwSpuSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8118571714284977418L;

	/**
	 * 商品属性列表
	 */
	@ApiListField("attribute")
	@ApiField("spu_attribute")
	private List<SpuAttribute> attribute;

	/**
	 * 商品品牌
	 */
	@ApiField("brand")
	private String brand;

	/**
	 * 商品类目，用于商品库中分类
	 */
	@ApiField("category")
	private String category;

	/**
	 * 商品描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 商品图片链接
特殊可选规则：is_delete=false的情况下必填
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 默认为false，为true，表示删除知识点
	 */
	@ApiField("is_delete")
	private String isDelete;

	/**
	 * 知识库id
	 */
	@ApiField("library_id")
	private Long libraryId;

	/**
	 * 知识库名称
	 */
	@ApiField("library_name")
	private String libraryName;

	/**
	 * 商品链接
特殊可选规则：is_delete=false的情况下必填
	 */
	@ApiField("link_url")
	private String linkUrl;

	/**
	 * 商品原价
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 商品售价
特殊可选规则：is_delete=false的情况下必填
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商品ID
	 */
	@ApiField("spu_id")
	private String spuId;

	/**
	 * 商品状态：AVAILABLE 表示可售卖,SOLD_OUT为售罄/不可卖，默认可售卖
	 */
	@ApiField("status")
	private String status;

	/**
	 * 商品名称
特殊可选规则：is_delete=false的情况下必填
	 */
	@ApiField("title")
	private String title;

	public List<SpuAttribute> getAttribute() {
		return this.attribute;
	}
	public void setAttribute(List<SpuAttribute> attribute) {
		this.attribute = attribute;
	}

	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getIsDelete() {
		return this.isDelete;
	}
	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

	public Long getLibraryId() {
		return this.libraryId;
	}
	public void setLibraryId(Long libraryId) {
		this.libraryId = libraryId;
	}

	public String getLibraryName() {
		return this.libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getLinkUrl() {
		return this.linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getSpuId() {
		return this.spuId;
	}
	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
