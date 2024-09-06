package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店信息
 *
 * @author auto create
 * @since 1.0, 2023-11-24 17:47:42
 */
public class ShopInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4577718676116855426L;

	/**
	 * 门店地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 蚂蚁侧门店id
	 */
	@ApiField("alipay_shop_id")
	private String alipayShopId;

	/**
	 * 商家侧门店id
	 */
	@ApiField("merchant_shop_id")
	private String merchantShopId;

	/**
	 * 门店名称
	 */
	@ApiField("name")
	private String name;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAlipayShopId() {
		return this.alipayShopId;
	}
	public void setAlipayShopId(String alipayShopId) {
		this.alipayShopId = alipayShopId;
	}

	public String getMerchantShopId() {
		return this.merchantShopId;
	}
	public void setMerchantShopId(String merchantShopId) {
		this.merchantShopId = merchantShopId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
