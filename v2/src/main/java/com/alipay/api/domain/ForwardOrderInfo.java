package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 正向工单详情
 *
 * @author auto create
 * @since 1.0, 2024-01-25 10:00:16
 */
public class ForwardOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 2639242923987781864L;

	/**
	 * 问题描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 客权工单创建时间
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 工单类型：流程code
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 机构工单要求完结时间
	 */
	@ApiField("out_order_expect_time")
	private Date outOrderExpectTime;

	/**
	 * 客权工单要求完结时间
	 */
	@ApiField("self_order_expect_time")
	private Date selfOrderExpectTime;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public Date getOutOrderExpectTime() {
		return this.outOrderExpectTime;
	}
	public void setOutOrderExpectTime(Date outOrderExpectTime) {
		this.outOrderExpectTime = outOrderExpectTime;
	}

	public Date getSelfOrderExpectTime() {
		return this.selfOrderExpectTime;
	}
	public void setSelfOrderExpectTime(Date selfOrderExpectTime) {
		this.selfOrderExpectTime = selfOrderExpectTime;
	}

}
