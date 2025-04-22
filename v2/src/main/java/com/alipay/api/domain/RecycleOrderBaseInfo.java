package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单基础信息
 *
 * @author auto create
 * @since 1.0, 2023-08-22 17:47:27
 */
public class RecycleOrderBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 2578184719961843469L;

	/**
	 * 单位元
	 */
	@ApiField("assess_amount")
	private String assessAmount;

	/**
	 * 估价结果ID
	 */
	@ApiField("estimate_result_id")
	private String estimateResultId;

	/**
	 * 回收商订单ID
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 订单创建时间
	 */
	@ApiField("order_create_time")
	private String orderCreateTime;

	/**
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 单位元
	 */
	@ApiField("pre_assess_amount")
	private String preAssessAmount;

	public String getAssessAmount() {
		return this.assessAmount;
	}
	public void setAssessAmount(String assessAmount) {
		this.assessAmount = assessAmount;
	}

	public String getEstimateResultId() {
		return this.estimateResultId;
	}
	public void setEstimateResultId(String estimateResultId) {
		this.estimateResultId = estimateResultId;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(String orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPreAssessAmount() {
		return this.preAssessAmount;
	}
	public void setPreAssessAmount(String preAssessAmount) {
		this.preAssessAmount = preAssessAmount;
	}

}
