package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 前端框架service和atomic接口信息
 *
 * @author auto create
 * @since 1.0, 2022-09-19 16:37:11
 */
public class SlmMethodInfo extends AlipayObject {

	private static final long serialVersionUID = 3318746936356367628L;

	/**
	 * 方法功能的描述
	 */
	@ApiField("method_desc")
	private String methodDesc;

	/**
	 * 方法名
	 */
	@ApiField("method_name")
	private String methodName;

	/**
	 * 参数列表
	 */
	@ApiField("param_info_list")
	private ServeParamInfo paramInfoList;

	public String getMethodDesc() {
		return this.methodDesc;
	}
	public void setMethodDesc(String methodDesc) {
		this.methodDesc = methodDesc;
	}

	public String getMethodName() {
		return this.methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public ServeParamInfo getParamInfoList() {
		return this.paramInfoList;
	}
	public void setParamInfoList(ServeParamInfo paramInfoList) {
		this.paramInfoList = paramInfoList;
	}

}
