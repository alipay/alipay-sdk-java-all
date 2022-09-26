package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店信息
 *
 * @author auto create
 * @since 1.0, 2020-06-20 11:00:36
 */
public class OrderShopInfoResult extends AlipayObject {

	private static final long serialVersionUID = 6824747849914836324L;

	/**
	 * 店铺地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 商户门店id 支持英文、数字的组合
	 */
	@ApiField("merchant_shop_id")
	private String merchantShopId;

	/**
	 * 门店名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 联系电话-支持固话或手机号 仅支持数字、+、-
	 */
	@ApiField("phone_num")
	private String phoneNum;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
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

	public String getPhoneNum() {
		return this.phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

}
