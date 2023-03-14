package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 虚拟数字人开放接口调用
 *
 * @author auto create
 * @since 1.0, 2022-11-29 17:10:14
 */
public class AlipayIserviceCcmRobotAvatarbaseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3874869916331511124L;

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

	/**
	 * 租户code&租户id，对于子部门客户需要上传子部门id
	 */
	@ApiField("tenant_code")
	private String tenantCode;

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

	public String getTenantCode() {
		return this.tenantCode;
	}
	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}

}
