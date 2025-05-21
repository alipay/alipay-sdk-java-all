package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 函数列表
 *
 * @author auto create
 * @since 1.0, 2024-08-16 15:00:16
 */
public class FunctionInfo extends AlipayObject {

	private static final long serialVersionUID = 7311495364742369542L;

	/**
	 * 云函数描述
	 */
	@ApiField("function_description")
	private String functionDescription;

	/**
	 * 云函数名称
	 */
	@ApiField("function_name")
	private String functionName;

	/**
	 * 版本描述
	 */
	@ApiField("version_description")
	private String versionDescription;

	/**
	 * 版本名称
	 */
	@ApiField("version_name")
	private String versionName;

	public String getFunctionDescription() {
		return this.functionDescription;
	}
	public void setFunctionDescription(String functionDescription) {
		this.functionDescription = functionDescription;
	}

	public String getFunctionName() {
		return this.functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getVersionDescription() {
		return this.versionDescription;
	}
	public void setVersionDescription(String versionDescription) {
		this.versionDescription = versionDescription;
	}

	public String getVersionName() {
		return this.versionName;
	}
	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

}
