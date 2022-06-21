package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券核销规则结果
 *
 * @author auto create
 * @since 1.0, 2022-06-10 18:57:06
 */
public class OrderVoucherUseRuleResult extends AlipayObject {

	private static final long serialVersionUID = 2811399834728258915L;

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
