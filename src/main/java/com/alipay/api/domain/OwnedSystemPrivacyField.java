package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 已经拥有权限的系统隐私字段
 *
 * @author auto create
 * @since 1.0, 2022-01-18 14:02:39
 */
public class OwnedSystemPrivacyField extends AlipayObject {

	private static final long serialVersionUID = 4133384371654374237L;

	/**
	 * 隐私字段code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 接口code
	 */
	@ApiField("interface_code")
	private String interfaceCode;

	/**
	 * 是否为必须在隐私协议中申请的隐私字段，optional=true时表示非必须申请，当前隐私字段为系统默认赋权的
	 */
	@ApiField("optional")
	private Boolean optional;

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

	public Boolean getOptional() {
		return this.optional;
	}
	public void setOptional(Boolean optional) {
		this.optional = optional;
	}

}
