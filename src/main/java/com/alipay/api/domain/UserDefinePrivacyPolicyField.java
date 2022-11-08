package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户自定义隐私字段
 *
 * @author auto create
 * @since 1.0, 2022-01-18 14:02:55
 */
public class UserDefinePrivacyPolicyField extends AlipayObject {

	private static final long serialVersionUID = 5495561558562161589L;

	/**
	 * 隐私接口名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 隐私字段用途
	 */
	@ApiField("purpose")
	private String purpose;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPurpose() {
		return this.purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

}
