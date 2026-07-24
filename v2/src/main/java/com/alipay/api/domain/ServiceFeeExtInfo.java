package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务费扩展信息
 *
 * @author auto create
 * @since 1.0, 2026-06-17 14:10:36
 */
public class ServiceFeeExtInfo extends AlipayObject {

	private static final long serialVersionUID = 4526837499251591558L;

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
	 * 企业码服务id，服务商在企业码生态中展业的业务标识
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 抽佣结算失败错误码
	 */
	@ApiField("settle_failed_code")
	private String settleFailedCode;

	/**
	 * 结算失败原因
	 */
	@ApiField("settle_failed_msg")
	private String settleFailedMsg;

	/**
	 * 结算失败解决方案
	 */
	@ApiField("settle_failed_solution")
	private String settleFailedSolution;

	/**
	 * 企业码门店ID，门店代运营开放场景同蚂蚁门店ID
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

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getSettleFailedCode() {
		return this.settleFailedCode;
	}
	public void setSettleFailedCode(String settleFailedCode) {
		this.settleFailedCode = settleFailedCode;
	}

	public String getSettleFailedMsg() {
		return this.settleFailedMsg;
	}
	public void setSettleFailedMsg(String settleFailedMsg) {
		this.settleFailedMsg = settleFailedMsg;
	}

	public String getSettleFailedSolution() {
		return this.settleFailedSolution;
	}
	public void setSettleFailedSolution(String settleFailedSolution) {
		this.settleFailedSolution = settleFailedSolution;
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
