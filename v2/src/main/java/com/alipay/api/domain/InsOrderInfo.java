package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险订单相关信息(当前主要用于饿了么外卖订单场景)
 *
 * @author auto create
 * @since 1.0, 2020-07-08 09:46:46
 */
public class InsOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 3862898599986164453L;

	/**
	 * 业务字段
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 卖家接单时间
	 */
	@ApiField("order_accept_time")
	private Date orderAcceptTime;

	/**
	 * 订单实付金额(单位:分)
	 */
	@ApiField("order_actual_fee")
	private Long orderActualFee;

	/**
	 * 1593329026000
	 */
	@ApiField("order_expected_time")
	private Date orderExpectedTime;

	/**
	 * 订单完结时间
	 */
	@ApiField("order_finish_time")
	private Date orderFinishTime;

	/**
	 * 饿了么订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 订单状态
INIT:初始化 
FINSHED:已完结
备注:枚举非强制，可以使用外部枚举
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单下单时间
	 */
	@ApiField("order_time")
	private Date orderTime;

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public Date getOrderAcceptTime() {
		return this.orderAcceptTime;
	}
	public void setOrderAcceptTime(Date orderAcceptTime) {
		this.orderAcceptTime = orderAcceptTime;
	}

	public Long getOrderActualFee() {
		return this.orderActualFee;
	}
	public void setOrderActualFee(Long orderActualFee) {
		this.orderActualFee = orderActualFee;
	}

	public Date getOrderExpectedTime() {
		return this.orderExpectedTime;
	}
	public void setOrderExpectedTime(Date orderExpectedTime) {
		this.orderExpectedTime = orderExpectedTime;
	}

	public Date getOrderFinishTime() {
		return this.orderFinishTime;
	}
	public void setOrderFinishTime(Date orderFinishTime) {
		this.orderFinishTime = orderFinishTime;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

}
