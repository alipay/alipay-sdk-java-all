package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 退已打款计划明细
 *
 * @author auto create
 * @since 1.0, 2022-10-13 17:21:18
 */
public class RefundPaidDetail extends AlipayObject {

	private static final long serialVersionUID = 2453857132932337788L;

	/**
	 * 退已打款计划编号
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 退已打款金额，单位元，如果不传，就默认全退
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退分账信息
	 */
	@ApiListField("refund_royalty_info_list")
	@ApiField("tuition_refund_royalty_info")
	private List<TuitionRefundRoyaltyInfo> refundRoyaltyInfoList;

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public List<TuitionRefundRoyaltyInfo> getRefundRoyaltyInfoList() {
		return this.refundRoyaltyInfoList;
	}
	public void setRefundRoyaltyInfoList(List<TuitionRefundRoyaltyInfo> refundRoyaltyInfoList) {
		this.refundRoyaltyInfoList = refundRoyaltyInfoList;
	}

}
