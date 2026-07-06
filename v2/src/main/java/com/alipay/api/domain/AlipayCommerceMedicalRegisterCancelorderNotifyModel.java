package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 号源停诊通知
 *
 * @author auto create
 * @since 1.0, 2026-03-06 10:55:11
 */
public class AlipayCommerceMedicalRegisterCancelorderNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 3549696149664959153L;

	/**
	 * 支付宝id(必填)
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 服务商code 微医
	 */
	@ApiField("isv_code")
	private String isvCode;

	/**
	 * 排版下具体号源信息id
	 */
	@ApiField("number_no")
	private String numberNo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 预约订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 号源平台编码
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 第一级排班接口中排班 id. 若有号源ID，需传该字段
	 */
	@ApiField("register_id")
	private String registerId;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getIsvCode() {
		return this.isvCode;
	}
	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}

	public String getNumberNo() {
		return this.numberNo;
	}
	public void setNumberNo(String numberNo) {
		this.numberNo = numberNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getRegisterId() {
		return this.registerId;
	}
	public void setRegisterId(String registerId) {
		this.registerId = registerId;
	}

}
