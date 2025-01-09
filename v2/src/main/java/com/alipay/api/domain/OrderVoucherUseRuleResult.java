package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券核销规则结果
 *
 * @author auto create
 * @since 1.0, 2023-09-19 13:43:35
 */
public class OrderVoucherUseRuleResult extends AlipayObject {

	private static final long serialVersionUID = 6855977812871972962L;

	/**
	 * 商家券可用范围请求结果
	 */
	@ApiField("voucher_available_scope_result")
	private OrderVoucherAvailableScopeResult voucherAvailableScopeResult;

	public OrderVoucherAvailableScopeResult getVoucherAvailableScopeResult() {
		return this.voucherAvailableScopeResult;
	}
	public void setVoucherAvailableScopeResult(OrderVoucherAvailableScopeResult voucherAvailableScopeResult) {
		this.voucherAvailableScopeResult = voucherAvailableScopeResult;
	}

}
