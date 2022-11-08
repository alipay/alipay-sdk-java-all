package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 系统定义的隐私字段
 *
 * @author auto create
 * @since 1.0, 2022-01-18 14:02:46
 */
public class SystemPrivacyField extends AlipayObject {

	private static final long serialVersionUID = 4452375383476148692L;

	/**
	 * 字段的code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 接口名的code
	 */
	@ApiField("interface_code")
	private String interfaceCode;

	/**
	 * 用于用户登录
	 */
	@ApiField("purpose")
	private String purpose;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getInterfaceCode() {
		return this.interfaceCode;
	}
	public void setInterfaceCode(String interfaceCode) {
		this.interfaceCode = interfaceCode;
	}

	public String getPurpose() {
		return this.purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

}
