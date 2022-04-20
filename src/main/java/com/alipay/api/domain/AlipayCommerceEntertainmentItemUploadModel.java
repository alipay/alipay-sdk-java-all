package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 泛娱乐优惠商品上报
 *
 * @author auto create
 * @since 1.0, 2022-04-02 17:17:25
 */
public class AlipayCommerceEntertainmentItemUploadModel extends AlipayObject {

	private static final long serialVersionUID = 5117954976481175965L;

	/**
	 * 商品是否启用（对客展示），true/false
	 */
	@ApiField("enable")
	private Boolean enable;

	/**
	 * 商品扩展信息，具体传值根据商户及商品类型不同另行约定。
json格式，请将需要传递的key和value字段放入map中，转成json string传入。
	 */
	@ApiField("item_extended_info")
	private String itemExtendedInfo;

	/**
	 * 商品Id,用于后续spi查询时关联
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 优惠商品名，对客展示的商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 客户点击商品后跳转到商户的地址
	 */
	@ApiField("item_url")
	private String itemUrl;

	/**
	 * 商品图片地址
	 */
	@ApiField("pic_source_url")
	private String picSourceUrl;

	/**
	 * 商品计价类型:
MONTH:月卡
YEAR:年卡
CM：连续包月
CY：连续包年
	 */
	@ApiField("pricing_type")
	private String pricingType;

	/**
	 * 可选类型有：
VIDEO:影视
MUSIC:音乐
	 */
	@ApiField("service_category")
	private String serviceCategory;

	/**
	 * 商品单价，单位元（人民币）
	 */
	@ApiField("unit_price")
	private String unitPrice;

	public Boolean getEnable() {
		return this.enable;
	}
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public String getItemExtendedInfo() {
		return this.itemExtendedInfo;
	}
	public void setItemExtendedInfo(String itemExtendedInfo) {
		this.itemExtendedInfo = itemExtendedInfo;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemUrl() {
		return this.itemUrl;
	}
	public void setItemUrl(String itemUrl) {
		this.itemUrl = itemUrl;
	}

	public String getPicSourceUrl() {
		return this.picSourceUrl;
	}
	public void setPicSourceUrl(String picSourceUrl) {
		this.picSourceUrl = picSourceUrl;
	}

	public String getPricingType() {
		return this.pricingType;
	}
	public void setPricingType(String pricingType) {
		this.pricingType = pricingType;
	}

	public String getServiceCategory() {
		return this.serviceCategory;
	}
	public void setServiceCategory(String serviceCategory) {
		this.serviceCategory = serviceCategory;
	}

	public String getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

}
