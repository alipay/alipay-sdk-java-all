package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新模型测试toAnt类型接口回归验证
 *
 * @author auto create
 * @since 1.0, 2024-11-15 18:38:25
 */
public class AlipayDataDataserviceReturntoantRainySyncModel extends AlipayObject {

	private static final long serialVersionUID = 3734172875856243951L;

	/**
	 * 测试而已
	 */
	@ApiField("tc_case")
	private String tcCase;

	public String getTcCase() {
		return this.tcCase;
	}
	public void setTcCase(String tcCase) {
		this.tcCase = tcCase;
	}

}
