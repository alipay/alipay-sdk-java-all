package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OrderVoucherUseRuleResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.ordervoucher.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-13 14:31:41
 */
public class AlipayMarketingActivityOrdervoucherCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5338948393598249966L;

	/** 
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 券核销规则请求结果
	 */
	@ApiField("voucher_use_rule_result")
	private OrderVoucherUseRuleResult voucherUseRuleResult;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

	public void setVoucherUseRuleResult(OrderVoucherUseRuleResult voucherUseRuleResult) {
		this.voucherUseRuleResult = voucherUseRuleResult;
	}
	public OrderVoucherUseRuleResult getVoucherUseRuleResult( ) {
		return this.voucherUseRuleResult;
	}

}
