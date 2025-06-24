package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 号源停诊通知
 *
 * @author auto create
 * @since 1.0, 2025-06-23 15:14:24
 */
public class AlipayCommerceMedicalRegisterCancelorderNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 7115788461267942583L;

	/**
	 * 排版下具体号源信息id
	 */
	@ApiField("number_no")
	private String numberNo;

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

	public String getNumberNo() {
		return this.numberNo;
	}
	public void setNumberNo(String numberNo) {
		this.numberNo = numberNo;
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
