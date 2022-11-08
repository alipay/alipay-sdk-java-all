package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券核销规则结果
 *
 * @author auto create
 * @since 1.0, 2022-08-24 16:23:01
 */
public class OrderVoucherUseRuleResult extends AlipayObject {

	private static final long serialVersionUID = 5272453477885798566L;

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
