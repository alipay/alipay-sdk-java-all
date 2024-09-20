package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序名称校验
 *
 * @author auto create
 * @since 1.0, 2024-04-23 10:31:23
 */
public class AlipayOpenMiniInnerbaseinfoParameterVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 4417992747172355449L;

	/**
	 * 校验小程序基本信息枚举
APP_NAME 小程序名称
APP_ENGLISH_NAME 小程序英文名
	 */
	@ApiField("verify_type")
	private String verifyType;

	/**
	 * 小程序基本参数校验数据
	 */
	@ApiField("verify_value")
	private String verifyValue;

	public String getVerifyType() {
		return this.verifyType;
	}
	public void setVerifyType(String verifyType) {
		this.verifyType = verifyType;
	}

	public String getVerifyValue() {
		return this.verifyValue;
	}
	public void setVerifyValue(String verifyValue) {
		this.verifyValue = verifyValue;
	}

}
