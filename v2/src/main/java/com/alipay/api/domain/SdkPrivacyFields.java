package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 第三方SDK信息
 *
 * @author auto create
 * @since 1.0, 2026-07-20 09:58:53
 */
public class SdkPrivacyFields extends AlipayObject {

	private static final long serialVersionUID = 4349945119817776674L;

	/**
	 * SDK所需的隐私权限
	 */
	@ApiField("code")
	private String code;

	/**
	 * SDK所需隐私字段名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 让用户理解为什么需要此权限
	 */
	@ApiField("purpose")
	private String purpose;

	/**
	 * SDK名称
	 */
	@ApiField("sdk_name")
	private String sdkName;

	/**
	 * SDK提供者名称
	 */
	@ApiField("sdk_provider_name")
	private String sdkProviderName;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

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

	public String getSdkName() {
		return this.sdkName;
	}
	public void setSdkName(String sdkName) {
		this.sdkName = sdkName;
	}

	public String getSdkProviderName() {
		return this.sdkProviderName;
	}
	public void setSdkProviderName(String sdkProviderName) {
		this.sdkProviderName = sdkProviderName;
	}

}
