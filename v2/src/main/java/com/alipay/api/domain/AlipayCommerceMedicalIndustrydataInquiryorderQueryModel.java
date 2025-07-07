package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 问诊订单查询接口
 *
 * @author auto create
 * @since 1.0, 2023-11-09 21:23:40
 */
public class AlipayCommerceMedicalIndustrydataInquiryorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4446142732375524299L;

	/**
	 * 支付宝开放id
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝用户uid
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 支付宝行业侧订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 平台编码
	 */
	@ApiField("platform_code")
	private String platformCode;

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
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

}
