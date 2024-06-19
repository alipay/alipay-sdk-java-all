package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义优惠规则
 *
 * @author auto create
 * @since 1.0, 2023-11-01 19:38:07
 */
public class CustomerDefineDeductRule extends AlipayObject {

	private static final long serialVersionUID = 3845352111496662588L;

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
