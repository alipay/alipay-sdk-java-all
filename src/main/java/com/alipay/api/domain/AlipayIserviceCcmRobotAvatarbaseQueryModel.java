package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 虚拟数字人开放接口调用
 *
 * @author auto create
 * @since 1.0, 2022-08-09 19:59:12
 */
public class AlipayIserviceCcmRobotAvatarbaseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5531469835443798737L;

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
