package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 虚拟数字人开放接口调用
 *
 * @author auto create
 * @since 1.0, 2024-01-17 14:35:58
 */
public class AlipayIserviceCcmRobotAvatarbaseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3195868941191722367L;

	/**
	 * 开通的数字人的商品码
	 */
	@ApiField("commodity_code")
	private String commodityCode;

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

	public String getCommodityCode() {
		return this.commodityCode;
	}
	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}

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
