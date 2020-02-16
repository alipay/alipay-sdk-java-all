package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺商品模型结构
 *
 * @author auto create
 * @since 1.0, 2017-04-14 18:19:47
 */
public class ExtShopItem extends AlipayObject {

	private static final long serialVersionUID = 4562964698997847334L;

	/**
	 * 品牌编码
	 */
	@ApiField("brand_code")
	private String brandCode;

	/**
	 * 品类编码
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 入数，必须为整数
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 产地
	 */
	@ApiField("country")
	private String country;

	/**
	 * 产品描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 商品扩展信息
	 */
	@ApiField("ext_goods_info")
	private String extGoodsInfo;

	/**
	 * 商品id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 商品条码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 口碑门店id
	 */
	@ApiField("kb_shop_id")
	private String kbShopId;

	/**
	 * 商品图片url
	 */
	@ApiField("picture")
	private String picture;

	/**
	 * 参考价格
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 商品规格
	 */
	@ApiField("specification")
	private String specification;

	/**
	 * ISV系统提供商
	 */
	@ApiField("system_provider_id")
	private String systemProviderId;

	/**
	 * 商品名称
	 */
	@ApiField("title")
	private String title;

	public String getBrandCode() {
		return this.brandCode;
	}
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getExtGoodsInfo() {
		return this.extGoodsInfo;
	}
	public void setExtGoodsInfo(String extGoodsInfo) {
		this.extGoodsInfo = extGoodsInfo;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getKbShopId() {
		return this.kbShopId;
	}
	public void setKbShopId(String kbShopId) {
		this.kbShopId = kbShopId;
	}

	public String getPicture() {
		return this.picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public String getSpecification() {
		return this.specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getSystemProviderId() {
		return this.systemProviderId;
	}
	public void setSystemProviderId(String systemProviderId) {
		this.systemProviderId = systemProviderId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
