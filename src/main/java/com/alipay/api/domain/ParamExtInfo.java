package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运单参数扩展信息
 *
 * @author auto create
 * @since 1.0, 2020-03-17 10:47:05
 */
public class ParamExtInfo extends AlipayObject {

	private static final long serialVersionUID = 5549993346645919572L;

	/**
	 * 小程序地址中的参数名称，具体详见接口开发文档
	 */
	@ApiField("param_name")
	private String paramName;

	/**
	 * 小程序地址中的参数值，具体详见接口开发文档
	 */
	@ApiField("param_value")
	private String paramValue;

	/**
	 * 小程序地址中的参数类型, start：小程序的启动参数；page：小程序的页面参数。具体详见接口开发文档
	 */
	@ApiField("type")
	private String type;

	public String getParamName() {
		return this.paramName;
	}
	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public String getParamValue() {
		return this.paramValue;
	}
	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
