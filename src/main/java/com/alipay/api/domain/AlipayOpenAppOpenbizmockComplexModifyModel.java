package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放基础模拟业务复杂参数接口
 *
 * @author auto create
 * @since 1.0, 2019-11-27 10:48:08
 */
public class AlipayOpenAppOpenbizmockComplexModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3577791242972971546L;

	/**
	 * 复杂入参
	 */
	@ApiField("complex_lable_rule")
	private ComplexLabelRule complexLableRule;

	public ComplexLabelRule getComplexLableRule() {
		return this.complexLableRule;
	}
	public void setComplexLableRule(ComplexLabelRule complexLableRule) {
		this.complexLableRule = complexLableRule;
	}

}
