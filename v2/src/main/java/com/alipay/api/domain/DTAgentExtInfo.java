package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务对话参数
 *
 * @author auto create
 * @since 1.0, 2024-11-05 17:25:41
 */
public class DTAgentExtInfo extends AlipayObject {

	private static final long serialVersionUID = 1395541599645179124L;

	/**
	 * 参数名称
	 */
	@ApiField("param_key")
	private String paramKey;

	/**
	 * 参数值
	 */
	@ApiField("param_value")
	private String paramValue;

	public String getParamKey() {
		return this.paramKey;
	}
	public void setParamKey(String paramKey) {
		this.paramKey = paramKey;
	}

	public String getParamValue() {
		return this.paramValue;
	}
	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}

}
