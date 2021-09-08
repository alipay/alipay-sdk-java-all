package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学费码打款请求
 *
 * @author auto create
 * @since 1.0, 2021-06-25 17:28:15
 */
public class AlipayCommerceEducateTuitioncodePlanDisburseModel extends AlipayObject {

	private static final long serialVersionUID = 8148661693434513588L;

	/**
	 * ISV订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 学费码打款计划编号
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 2088401023137175
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 订单支付人支付宝用户编号
	 */
	@ApiField("user_id")
	private String userId;

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
