package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务费扩展信息
 *
 * @author auto create
 * @since 1.0, 2023-10-11 09:54:35
 */
public class ServiceFeeExtInfo extends AlipayObject {

	private static final long serialVersionUID = 4483711789588165179L;

	/**
	 * 门店所在城市
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 原账单消费金额
单位（元）
	 */
	@ApiField("origin_consume_amount")
	private String originConsumeAmount;

	/**
	 * 原账单因公付金额
单位（元）
	 */
	@ApiField("origin_peer_pay_amount")
	private String originPeerPayAmount;

	/**
	 * 企业码门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 企业码门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getOriginConsumeAmount() {
		return this.originConsumeAmount;
	}
	public void setOriginConsumeAmount(String originConsumeAmount) {
		this.originConsumeAmount = originConsumeAmount;
	}

	public String getOriginPeerPayAmount() {
		return this.originPeerPayAmount;
	}
	public void setOriginPeerPayAmount(String originPeerPayAmount) {
		this.originPeerPayAmount = originPeerPayAmount;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}
