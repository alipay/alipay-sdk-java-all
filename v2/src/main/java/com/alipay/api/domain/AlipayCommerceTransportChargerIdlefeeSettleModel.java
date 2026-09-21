package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结算超时占位费订单
 *
 * @author auto create
 * @since 1.0, 2026-08-20 11:52:48
 */
public class AlipayCommerceTransportChargerIdlefeeSettleModel extends AlipayObject {

	private static final long serialVersionUID = 1668293596235416371L;

	/**
	 * 占位费结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 订单包含的免费占位时长，单位：分钟，整数
	 */
	@ApiField("free_duration")
	private Long freeDuration;

	/**
	 * 是否使用支付宝支付渠道
true: 待用户使用支付宝付款
false: 用户已使用其他渠道完成支付
	 */
	@ApiField("need_pay")
	private Boolean needPay;

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
	 * 占位费订单待支付金额，单位：元，两位小数
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 占位费开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 占位费订单总金额，单位：元，两位小数
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Long getFreeDuration() {
		return this.freeDuration;
	}
	public void setFreeDuration(Long freeDuration) {
		this.freeDuration = freeDuration;
	}

	public Boolean getNeedPay() {
		return this.needPay;
	}
	public void setNeedPay(Boolean needPay) {
		this.needPay = needPay;
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

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
