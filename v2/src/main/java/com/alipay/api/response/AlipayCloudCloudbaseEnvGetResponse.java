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
 * @since 1.0, 2024-05-31 17:20:14
 */
public class AlipayCloudCloudbaseEnvGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2397839775667955348L;

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
	 * 环境状态
 - INIT
 - ENABLE
 - SYSTEM_DISABLE
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 资源包名称
	 */
	@ApiField("workspace_pkg_name")
	private String workspacePkgName;

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
