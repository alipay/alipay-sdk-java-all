package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 环境信息
 *
 * @author auto create
 * @since 1.0, 2023-08-08 22:27:06
 */
public class Env extends AlipayObject {

	private static final long serialVersionUID = 5466417943277915151L;

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

	public String getCloudbaseApiGatewayAk() {
		return this.cloudbaseApiGatewayAk;
	}
	public void setCloudbaseApiGatewayAk(String cloudbaseApiGatewayAk) {
		this.cloudbaseApiGatewayAk = cloudbaseApiGatewayAk;
	}

	public String getCloudbaseApiGatewaySk() {
		return this.cloudbaseApiGatewaySk;
	}
	public void setCloudbaseApiGatewaySk(String cloudbaseApiGatewaySk) {
		this.cloudbaseApiGatewaySk = cloudbaseApiGatewaySk;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getEnvId() {
		return this.envId;
	}
	public void setEnvId(String envId) {
		this.envId = envId;
	}

	public List<EnvVar> getEnvVars() {
		return this.envVars;
	}
	public void setEnvVars(List<EnvVar> envVars) {
		this.envVars = envVars;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPkgExpirationTime() {
		return this.pkgExpirationTime;
	}
	public void setPkgExpirationTime(String pkgExpirationTime) {
		this.pkgExpirationTime = pkgExpirationTime;
	}

	public String getRegion() {
		return this.region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getWorkspacePkgName() {
		return this.workspacePkgName;
	}
	public void setWorkspacePkgName(String workspacePkgName) {
		this.workspacePkgName = workspacePkgName;
	}

}
