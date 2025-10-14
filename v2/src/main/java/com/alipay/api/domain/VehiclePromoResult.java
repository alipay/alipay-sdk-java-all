package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-07-24 12:57:34
 */
public class VehiclePromoResult extends AlipayObject {

	private static final long serialVersionUID = 5598466547354655974L;

	/**
	 * 业务发生时间，格式为yyyy-MM-dd hh:mm:ss
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 订单核销车企优惠金额，精度两位小数，单位元；当退款时，金额为负数；当金额为零时，本订单未核销使用车企优惠
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 订单唯一编码
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 退款订单流水号，当发生退款时，返回该字段信息
	 */
	@ApiField("request_no")
	private String requestNo;

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

}
