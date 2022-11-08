package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠信息
 *
 * @author auto create
 * @since 1.0, 2022-08-29 16:11:37
 */
public class DeductInfo extends AlipayObject {

	private static final long serialVersionUID = 3787462977485365224L;

	/**
	 * 自定义优惠规则
	 */
	@ApiField("customer_define_deduct_rule")
	private CustomerDefineDeductRule customerDefineDeductRule;

	public CustomerDefineDeductRule getCustomerDefineDeductRule() {
		return this.customerDefineDeductRule;
	}
	public void setCustomerDefineDeductRule(CustomerDefineDeductRule customerDefineDeductRule) {
		this.customerDefineDeductRule = customerDefineDeductRule;
	}

}
