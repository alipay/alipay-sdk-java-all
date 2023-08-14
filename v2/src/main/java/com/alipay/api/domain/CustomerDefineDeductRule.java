package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义优惠规则
 *
 * @author auto create
 * @since 1.0, 2023-07-21 11:25:47
 */
public class CustomerDefineDeductRule extends AlipayObject {

	private static final long serialVersionUID = 2149426277444886186L;

	/**
	 * 自定义优惠规则描述
	 */
	@ApiField("customer_define_deduct_rule_desc")
	private String customerDefineDeductRuleDesc;

	public String getCustomerDefineDeductRuleDesc() {
		return this.customerDefineDeductRuleDesc;
	}
	public void setCustomerDefineDeductRuleDesc(String customerDefineDeductRuleDesc) {
		this.customerDefineDeductRuleDesc = customerDefineDeductRuleDesc;
	}

}
