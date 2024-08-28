package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 钱包使用规则
 *
 * @author auto create
 * @since 1.0, 2024-07-30 17:24:04
 */
public class WalletUseRule extends AlipayObject {

	private static final long serialVersionUID = 8338415182462597532L;

	/**
	 * 在钱包核销时，需要指定核销范围，本字段可通过数组的方式传递商户ID指定商户核销的范围
	 */
	@ApiField("merchant_rule")
	private String merchantRule;

	public String getMerchantRule() {
		return this.merchantRule;
	}
	public void setMerchantRule(String merchantRule) {
		this.merchantRule = merchantRule;
	}

}
