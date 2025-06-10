package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收解决方案估价信息
 *
 * @author auto create
 * @since 1.0, 2025-02-07 10:25:33
 */
public class RecycleSolAssessInfo extends AlipayObject {

	private static final long serialVersionUID = 5787941932465884284L;

	/**
	 * 预估价格，单位元
	 */
	@ApiField("assess_amount")
	private String assessAmount;

	/**
	 * 预估最高金额，单位元
	 */
	@ApiField("assess_amount_max")
	private String assessAmountMax;

	/**
	 * 预估最低金额，单位元
	 */
	@ApiField("assess_amount_min")
	private String assessAmountMin;

	/**
	 * 估价结果ID
	 */
	@ApiField("estimate_result_id")
	private String estimateResultId;

	/**
	 * 订单来源appId
	 */
	@ApiField("order_source_app_id")
	private String orderSourceAppId;

	/**
	 * 可预付金额，单位元
	 */
	@ApiField("pre_assess_amount")
	private String preAssessAmount;

	/**
	 * 产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getAssessAmount() {
		return this.assessAmount;
	}
	public void setAssessAmount(String assessAmount) {
		this.assessAmount = assessAmount;
	}

	public String getAssessAmountMax() {
		return this.assessAmountMax;
	}
	public void setAssessAmountMax(String assessAmountMax) {
		this.assessAmountMax = assessAmountMax;
	}

	public String getAssessAmountMin() {
		return this.assessAmountMin;
	}
	public void setAssessAmountMin(String assessAmountMin) {
		this.assessAmountMin = assessAmountMin;
	}

	public String getEstimateResultId() {
		return this.estimateResultId;
	}
	public void setEstimateResultId(String estimateResultId) {
		this.estimateResultId = estimateResultId;
	}

	public String getOrderSourceAppId() {
		return this.orderSourceAppId;
	}
	public void setOrderSourceAppId(String orderSourceAppId) {
		this.orderSourceAppId = orderSourceAppId;
	}

	public String getPreAssessAmount() {
		return this.preAssessAmount;
	}
	public void setPreAssessAmount(String preAssessAmount) {
		this.preAssessAmount = preAssessAmount;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
