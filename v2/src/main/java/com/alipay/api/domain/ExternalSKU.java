package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * SKU
 *
 * @author auto create
 * @since 1.0, 2026-08-07 11:21:41
 */
public class ExternalSKU extends AlipayObject {

	private static final long serialVersionUID = 1445889918945367142L;

	/**
	 * 商家SKU编码
	 */
	@ApiField("merchant_sku_bar_code")
	private String merchantSkuBarCode;

	/**
	 * 商家SKU编码
	 */
	@ApiField("merchant_sku_code")
	private String merchantSkuCode;

	/**
	 * 划线价
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * SKU图片列表
	 */
	@ApiListField("pic_list")
	@ApiField("external_item_pic")
	private List<ExternalItemPic> picList;

	/**
	 * 售卖价
	 */
	@ApiField("sale_price")
	private Long salePrice;

	/**
	 * 销售属性列表
	 */
	@ApiListField("sale_property_list")
	@ApiField("external_item_propery")
	private List<ExternalItemPropery> salePropertyList;

	/**
	 * 蚂蚁侧skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * sku名称
	 */
	@ApiField("sku_name")
	private String skuName;

	/**
	 * sku供应状态，录入或者更新商品信息时不填
更新请走更新sku状态接口
	 */
	@ApiField("status")
	private String status;

	public String getMerchantSkuBarCode() {
		return this.merchantSkuBarCode;
	}
	public void setMerchantSkuBarCode(String merchantSkuBarCode) {
		this.merchantSkuBarCode = merchantSkuBarCode;
	}

	public String getMerchantSkuCode() {
		return this.merchantSkuCode;
	}
	public void setMerchantSkuCode(String merchantSkuCode) {
		this.merchantSkuCode = merchantSkuCode;
	}

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public List<ExternalItemPic> getPicList() {
		return this.picList;
	}
	public void setPicList(List<ExternalItemPic> picList) {
		this.picList = picList;
	}

	public Long getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}

	public List<ExternalItemPropery> getSalePropertyList() {
		return this.salePropertyList;
	}
	public void setSalePropertyList(List<ExternalItemPropery> salePropertyList) {
		this.salePropertyList = salePropertyList;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSkuName() {
		return this.skuName;
	}
	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
