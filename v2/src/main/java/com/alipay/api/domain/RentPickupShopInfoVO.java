package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁订单自提门店信息
 *
 * @author auto create
 * @since 1.0, 2026-09-16 19:51:31
 */
public class RentPickupShopInfoVO extends AlipayObject {

	private static final long serialVersionUID = 4348768582931531988L;

	/**
	 * 门店地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 蚂蚁侧门店ID
	 */
	@ApiField("alipay_shop_id")
	private String alipayShopId;

	/**
	 * 门店免费时长，单位：分钟，整数
	 */
	@ApiField("free_duration_minutes")
	private Long freeDurationMinutes;

	/**
	 * 商家侧门店ID
	 */
	@ApiField("merchant_shop_id")
	private String merchantShopId;

	/**
	 * 门店名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 门店联系电话
	 */
	@ApiField("tel_number")
	private String telNumber;

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

	public Long getFreeDurationMinutes() {
		return this.freeDurationMinutes;
	}
	public void setFreeDurationMinutes(Long freeDurationMinutes) {
		this.freeDurationMinutes = freeDurationMinutes;
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

	public String getTelNumber() {
		return this.telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

}
