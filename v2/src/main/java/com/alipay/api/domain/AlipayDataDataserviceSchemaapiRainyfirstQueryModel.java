package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新模型测试对照01
 *
 * @author auto create
 * @since 1.0, 2024-11-11 20:42:20
 */
public class AlipayDataDataserviceSchemaapiRainyfirstQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8647932248772461185L;

	/**
	 * 2
	 */
	@ApiField("string_tc_01")
	private String stringTc01;

	public String getStringTc01() {
		return this.stringTc01;
	}
	public void setStringTc01(String stringTc01) {
		this.stringTc01 = stringTc01;
	}

}
