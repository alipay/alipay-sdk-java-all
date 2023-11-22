package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安全策略咨询服务输出
 *
 * @author auto create
 * @since 1.0, 2023-02-23 16:02:49
 */
public class AlipaySecurityRiskPolicyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7865723796224166224L;

	/**
	 * 风险类型：表示风险处理或风险咨询——process/advice
	 */
	@ApiField("risk_type")
	private String riskType;

	/**
	 * 安全场景参数
	 */
	@ApiField("security_scene")
	private SecurityScene securityScene;

	/**
	 * 服务上下文包括环境信息和用户信息
	 */
	@ApiField("service_context")
	private ServiceContext serviceContext;

	public String getRiskType() {
		return this.riskType;
	}
	public void setRiskType(String riskType) {
		this.riskType = riskType;
	}

	public SecurityScene getSecurityScene() {
		return this.securityScene;
	}
	public void setSecurityScene(SecurityScene securityScene) {
		this.securityScene = securityScene;
	}

	public ServiceContext getServiceContext() {
		return this.serviceContext;
	}
	public void setServiceContext(ServiceContext serviceContext) {
		this.serviceContext = serviceContext;
	}

}
