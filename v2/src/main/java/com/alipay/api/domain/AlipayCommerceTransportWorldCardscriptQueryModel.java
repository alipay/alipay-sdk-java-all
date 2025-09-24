package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生码脚本查询
 *
 * @author auto create
 * @since 1.0, 2024-12-09 16:05:54
 */
public class AlipayCommerceTransportWorldCardscriptQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3823137849733713492L;

	/**
	 * 脚本名称
	 */
	@ApiField("script_name")
	private String scriptName;

	/**
	 * 脚本类型
	 */
	@ApiField("script_type")
	private String scriptType;

	public String getScriptName() {
		return this.scriptName;
	}
	public void setScriptName(String scriptName) {
		this.scriptName = scriptName;
	}

	public String getScriptType() {
		return this.scriptType;
	}
	public void setScriptType(String scriptType) {
		this.scriptType = scriptType;
	}

}
