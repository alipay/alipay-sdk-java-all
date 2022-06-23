package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 虚拟数字人开放接口调用
 *
 * @author auto create
 * @since 1.0, 2022-06-22 14:15:39
 */
public class AlipayIserviceCcmRobotAvatarbaseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4869515149446488545L;

	/**
	 * method_params:对应target_method请求方法的具体传参值k-v map
	 */
	@ApiField("method_params")
	private String methodParams;

	/**
	 * targetMethod；数字人目标方法调用
	 */
	@ApiField("target_method")
	private String targetMethod;

	public String getMethodParams() {
		return this.methodParams;
	}
	public void setMethodParams(String methodParams) {
		this.methodParams = methodParams;
	}

	public String getTargetMethod() {
		return this.targetMethod;
	}
	public void setTargetMethod(String targetMethod) {
		this.targetMethod = targetMethod;
	}

}
