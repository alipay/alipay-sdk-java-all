package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取 H5 活动洞察信息
 *
 * @author auto create
 * @since 1.0, 2019-05-22 14:30:20
 */
public class AlipayMarketingDataDeerInsightQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6847768935781922725L;

	/**
	 * 洞察名称，只能是数字、英文字母、横线或下划线
	 */
	@ApiField("alias")
	private String alias;

	/**
	 * 应用唯一标识
	 */
	@ApiField("app")
	private String app;

	/**
	 * 权限类型
	 */
	@ApiField("auth")
	private String auth;

	/**
	 * 如果未查询到洞察，是否强制新建一个返回
	 */
	@ApiField("force")
	private Boolean force;

	/**
	 * 是否强制更新该洞察为最新版洞察
	 */
	@ApiField("force_update")
	private Boolean forceUpdate;

	/**
	 * 业务空间唯一标识
	 */
	@ApiField("group_domain")
	private String groupDomain;

	/**
	 * 洞察唯一标识
	 */
	@ApiField("insight_domain")
	private String insightDomain;

	/**
	 * 业务指定的额外参数
	 */
	@ApiField("params")
	private String params;

	/**
	 * 调用服务的业务系统
	 */
	@ApiField("system")
	private String system;

	public String getAlias() {
		return this.alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getApp() {
		return this.app;
	}
	public void setApp(String app) {
		this.app = app;
	}

	public String getAuth() {
		return this.auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}

	public Boolean getForce() {
		return this.force;
	}
	public void setForce(Boolean force) {
		this.force = force;
	}

	public Boolean getForceUpdate() {
		return this.forceUpdate;
	}
	public void setForceUpdate(Boolean forceUpdate) {
		this.forceUpdate = forceUpdate;
	}

	public String getGroupDomain() {
		return this.groupDomain;
	}
	public void setGroupDomain(String groupDomain) {
		this.groupDomain = groupDomain;
	}

	public String getInsightDomain() {
		return this.insightDomain;
	}
	public void setInsightDomain(String insightDomain) {
		this.insightDomain = insightDomain;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

	public String getSystem() {
		return this.system;
	}
	public void setSystem(String system) {
		this.system = system;
	}

}
