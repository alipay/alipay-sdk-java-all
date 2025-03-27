package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 学费码打款请求
 *
 * @author auto create
 * @since 1.0, 2023-04-12 10:50:29
 */
public class AlipayCommerceEducateTuitioncodePlanDisburseModel extends AlipayObject {

	private static final long serialVersionUID = 5874977411753983468L;

	/**
	 * 订单支付人支付宝用户编号
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * ISV订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 外部请求唯一编号，重复申请打款时不能相同。直连银行模式必填
	 */
	@ApiField("out_request_id")
	private String outRequestId;

	/**
	 * 学费码打款计划编号。优先使用plan_ids，如果是打款一个任务，传递一个编号即可
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 批量打款的打款任务编号列表。建议不超过3个
	 */
	@ApiListField("plan_ids")
	@ApiField("string")
	private List<String> planIds;

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

	public String getOutRequestId() {
		return this.outRequestId;
	}
	public void setOutRequestId(String outRequestId) {
		this.outRequestId = outRequestId;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public List<String> getPlanIds() {
		return this.planIds;
	}
	public void setPlanIds(List<String> planIds) {
		this.planIds = planIds;
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
