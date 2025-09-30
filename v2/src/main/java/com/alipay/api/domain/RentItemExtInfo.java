package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁商品扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-08-20 09:30:32
 */
public class RentItemExtInfo extends AlipayObject {

	private static final long serialVersionUID = 8769167648661587666L;

	/**
	 * 券后签约价格，币种：人民币，单位：元
	 */
	@ApiField("after_coupon_price")
	private String afterCouponPrice;

	/**
	 * 商品的品牌名称
	 */
	@ApiField("item_brand")
	private String itemBrand;

	/**
	 * 商品的类目，取值：请联系支付宝租赁行业BD咨询
	 */
	@ApiField("item_category")
	private String itemCategory;

	/**
	 * 商品的颜色，例如：红色、蓝色、白色...
	 */
	@ApiField("item_color")
	private String itemColor;

	/**
	 * 商品型号，例如：iphone 12
	 */
	@ApiField("item_model")
	private String itemModel;

	/**
	 * 商品的名称，例如：iphone 16 pro max
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品的内存大小，如果是手机的时候需要设置，单位：GB/MB/KB
	 */
	@ApiField("item_ram")
	private String itemRam;

	/**
	 * 商品的成色
	 */
	@ApiField("item_state")
	private String itemState;

	/**
	 * 官网价，单位：元。
	 */
	@ApiField("official_price")
	private String officialPrice;

	/**
	 * 商品的供应商名称，例如：深圳爱租机苹果供应商
	 */
	@ApiField("provider_name")
	private String providerName;

	/**
	 * 商品的采购价格，币种：人民币，单位：元
	 */
	@ApiField("purchasing_price")
	private String purchasingPrice;

	/**
	 * 商品的设备序列号
	 */
	@ApiField("serial_no")
	private String serialNo;

	public String getAfterCouponPrice() {
		return this.afterCouponPrice;
	}
	public void setAfterCouponPrice(String afterCouponPrice) {
		this.afterCouponPrice = afterCouponPrice;
	}

	public String getItemBrand() {
		return this.itemBrand;
	}
	public void setItemBrand(String itemBrand) {
		this.itemBrand = itemBrand;
	}

	public String getItemCategory() {
		return this.itemCategory;
	}
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public String getItemColor() {
		return this.itemColor;
	}
	public void setItemColor(String itemColor) {
		this.itemColor = itemColor;
	}

	public String getItemModel() {
		return this.itemModel;
	}
	public void setItemModel(String itemModel) {
		this.itemModel = itemModel;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemRam() {
		return this.itemRam;
	}
	public void setItemRam(String itemRam) {
		this.itemRam = itemRam;
	}

	public String getItemState() {
		return this.itemState;
	}
	public void setItemState(String itemState) {
		this.itemState = itemState;
	}

	public String getOfficialPrice() {
		return this.officialPrice;
	}
	public void setOfficialPrice(String officialPrice) {
		this.officialPrice = officialPrice;
	}

	public String getProviderName() {
		return this.providerName;
	}
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getPurchasingPrice() {
		return this.purchasingPrice;
	}
	public void setPurchasingPrice(String purchasingPrice) {
		this.purchasingPrice = purchasingPrice;
	}

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

}
