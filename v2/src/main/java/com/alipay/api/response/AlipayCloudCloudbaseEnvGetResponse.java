package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EnvVar;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.get response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 14:32:40
 */
public class AlipayCloudCloudbaseEnvGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6628265142521711659L;

	/** 
	 * 付费方式
 - 套餐
 - 计量计费
	 */
	@ApiField("billing_model")
	private String billingModel;

	/** 
	 * api网关AK
	 */
	@ApiField("cloudbase_api_gateway_ak")
	private String cloudbaseApiGatewayAk;

	/** 
	 * api网关SK
	 */
	@ApiField("cloudbase_api_gateway_sk")
	private String cloudbaseApiGatewaySk;

	/** 
	 * 环境描述
	 */
	@ApiField("description")
	private String description;

	/** 
	 * 外部环境id
	 */
	@ApiField("env_id")
	private String envId;

	/** 
	 * 环境级别的环境变量
	 */
	@ApiListField("env_vars")
	@ApiField("env_var")
	private List<EnvVar> envVars;

	/** 
	 * 环境名称
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 资源包创建时间
	 */
	@ApiField("pkg_create_time")
	private String pkgCreateTime;

	/** 
	 * 资源包到期时间
	 */
	@ApiField("pkg_expiration_time")
	private String pkgExpirationTime;

	/** 
	 * 区域
	 */
	@ApiField("region")
	private String region;

	/** 
	 * 环境套餐资源包的状态
	 */
	@ApiField("resource_pkg_status")
	private String resourcePkgStatus;

	/** 
	 * 环境状态
   - INIT
   - ACTIVATING_UNPAY
   - ACTIVATING_PAY
   - ENABLE("正常")
   - MANUAL_DISABLE
   - USER_DISABLE
   - SYSTEM_DISABLE
   - DELETED
   - DELETING
   - SYSTEM_SUSPENDING
   - RECOVERING
   - REFUNDING
   - REFUND_SUCCESS
   - REFUND_FAILED
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 资源包名称
	 */
	@ApiField("workspace_pkg_name")
	private String workspacePkgName;

	public void setBillingModel(String billingModel) {
		this.billingModel = billingModel;
	}
	public String getBillingModel( ) {
		return this.billingModel;
	}

	public void setCloudbaseApiGatewayAk(String cloudbaseApiGatewayAk) {
		this.cloudbaseApiGatewayAk = cloudbaseApiGatewayAk;
	}
	public String getCloudbaseApiGatewayAk( ) {
		return this.cloudbaseApiGatewayAk;
	}

	public void setCloudbaseApiGatewaySk(String cloudbaseApiGatewaySk) {
		this.cloudbaseApiGatewaySk = cloudbaseApiGatewaySk;
	}
	public String getCloudbaseApiGatewaySk( ) {
		return this.cloudbaseApiGatewaySk;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription( ) {
		return this.description;
	}

	public void setEnvId(String envId) {
		this.envId = envId;
	}
	public String getEnvId( ) {
		return this.envId;
	}

	public void setEnvVars(List<EnvVar> envVars) {
		this.envVars = envVars;
	}
	public List<EnvVar> getEnvVars( ) {
		return this.envVars;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setPkgCreateTime(String pkgCreateTime) {
		this.pkgCreateTime = pkgCreateTime;
	}
	public String getPkgCreateTime( ) {
		return this.pkgCreateTime;
	}

	public void setPkgExpirationTime(String pkgExpirationTime) {
		this.pkgExpirationTime = pkgExpirationTime;
	}
	public String getPkgExpirationTime( ) {
		return this.pkgExpirationTime;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	public String getRegion( ) {
		return this.region;
	}

	public void setResourcePkgStatus(String resourcePkgStatus) {
		this.resourcePkgStatus = resourcePkgStatus;
	}
	public String getResourcePkgStatus( ) {
		return this.resourcePkgStatus;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setWorkspacePkgName(String workspacePkgName) {
		this.workspacePkgName = workspacePkgName;
	}
	public String getWorkspacePkgName( ) {
		return this.workspacePkgName;
	}

}
