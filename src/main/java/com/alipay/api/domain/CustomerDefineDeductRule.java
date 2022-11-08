package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义优惠规则
 *
 * @author auto create
 * @since 1.0, 2022-11-03 16:33:13
 */
public class CustomerDefineDeductRule extends AlipayObject {

	private static final long serialVersionUID = 2251418227535753754L;

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
