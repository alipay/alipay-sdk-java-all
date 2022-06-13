package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OrderVoucherUseRuleResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.ordervoucher.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-13 19:51:41
 */
public class AlipayMarketingActivityOrdervoucherModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8537184348677833883L;

	/** 
	 * 核销规则请求结果
	 */
	@ApiField("voucher_use_rule_result")
	private OrderVoucherUseRuleResult voucherUseRuleResult;

	public void setVoucherUseRuleResult(OrderVoucherUseRuleResult voucherUseRuleResult) {
		this.voucherUseRuleResult = voucherUseRuleResult;
	}
	public OrderVoucherUseRuleResult getVoucherUseRuleResult( ) {
		return this.voucherUseRuleResult;
	}

}
