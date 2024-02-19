package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 异步配置目标
 *
 * @author auto create
 * @since 1.0, 2023-12-21 16:39:47
 */
public class AsyncConfigDestination extends AlipayObject {

	private static final long serialVersionUID = 7611626184471852693L;

	/**
	 * 目标类型
	 */
	@ApiField("destination_type")
	private String destinationType;

	/**
	 * 目标函数名称
	 */
	@ApiField("function_name")
	private String functionName;

	public String getDestinationType() {
		return this.destinationType;
	}
	public void setDestinationType(String destinationType) {
		this.destinationType = destinationType;
	}

	public String getFunctionName() {
		return this.functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

}
