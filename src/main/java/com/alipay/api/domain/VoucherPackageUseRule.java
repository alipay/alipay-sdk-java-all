package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券包使用规则
 *
 * @author auto create
 * @since 1.0, 2022-07-19 17:39:06
 */
public class VoucherPackageUseRule extends AlipayObject {

	private static final long serialVersionUID = 2452526494177256815L;

	/**
	 * 券包使用规则
	 */
	@ApiField("use_rule_desc")
	private String useRuleDesc;

	public String getUseRuleDesc() {
		return this.useRuleDesc;
	}
	public void setUseRuleDesc(String useRuleDesc) {
		this.useRuleDesc = useRuleDesc;
	}

}
