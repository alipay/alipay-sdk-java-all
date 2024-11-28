package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.VoucherAvailableScopeResultInfo;
import com.alipay.api.domain.OrderVoucherUseRuleResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.ordervoucher.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-12 10:16:13
 */
public class AlipayMarketingActivityOrdervoucherCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4399597591934953673L;

	/** 
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 可用范围结果
	 */
	@ApiField("voucher_available_scope_result_info")
	private VoucherAvailableScopeResultInfo voucherAvailableScopeResultInfo;

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

	public void setVoucherAvailableScopeResultInfo(VoucherAvailableScopeResultInfo voucherAvailableScopeResultInfo) {
		this.voucherAvailableScopeResultInfo = voucherAvailableScopeResultInfo;
	}
	public VoucherAvailableScopeResultInfo getVoucherAvailableScopeResultInfo( ) {
		return this.voucherAvailableScopeResultInfo;
	}

	public void setVoucherUseRuleResult(OrderVoucherUseRuleResult voucherUseRuleResult) {
		this.voucherUseRuleResult = voucherUseRuleResult;
	}
	public OrderVoucherUseRuleResult getVoucherUseRuleResult( ) {
		return this.voucherUseRuleResult;
	}

}
