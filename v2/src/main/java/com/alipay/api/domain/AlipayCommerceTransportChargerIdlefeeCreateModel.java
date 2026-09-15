package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建超时占位费订单
 *
 * @author auto create
 * @since 1.0, 2026-08-20 11:47:56
 */
public class AlipayCommerceTransportChargerIdlefeeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5535922928381641819L;

	/**
	 * 占位费计费规则或者单价
	 */
	@ApiField("billing_rule")
	private String billingRule;

	/**
	 * 商户充电业务订单号
	 */
	@ApiField("charge_order_no")
	private String chargeOrderNo;

	/**
	 * 支付宝用户OPENID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户占位费订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 占位费开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBillingRule() {
		return this.billingRule;
	}
	public void setBillingRule(String billingRule) {
		this.billingRule = billingRule;
	}

	public String getChargeOrderNo() {
		return this.chargeOrderNo;
	}
	public void setChargeOrderNo(String chargeOrderNo) {
		this.chargeOrderNo = chargeOrderNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
