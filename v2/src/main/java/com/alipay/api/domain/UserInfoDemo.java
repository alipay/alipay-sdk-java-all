package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试
 *
 * @author auto create
 * @since 1.0, 2026-03-30 16:08:14
 */
public class UserInfoDemo extends AlipayObject {

	private static final long serialVersionUID = 6821436862332353541L;

	/**
	 * 测试
	 */
	@ApiField("second_level")
	private RainyComplexTypesTheFirstTwo secondLevel;

	public RainyComplexTypesTheFirstTwo getSecondLevel() {
		return this.secondLevel;
	}
	public void setSecondLevel(RainyComplexTypesTheFirstTwo secondLevel) {
		this.secondLevel = secondLevel;
	}

}
