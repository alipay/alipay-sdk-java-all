package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序信息
 *
 * @author auto create
 * @since 1.0, 2025-05-12 17:40:06
 */
public class AlipayAppRes extends AlipayObject {

	private static final long serialVersionUID = 5612834712973833791L;

	/**
	 * 创意动作类型
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 风控被限制原因 appId+principalId维度
	 */
	@ApiField("app_principal_risk_memo")
	private String appPrincipalRiskMemo;

	/**
	 * 被限制原因 appId维度
	 */
	@ApiField("app_risk_memo")
	private String appRiskMemo;

	/**
	 * 小程序状态.0:有效，1无效
	 */
	@ApiField("app_status")
	private Long appStatus;

	/**
	 * 小程序说明
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 图标地址
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 该小程序是否被限制。 0不限制 1限制
	 */
	@ApiField("limitation_tag")
	private Long limitationTag;

	/**
	 * 应用标识
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 小程序名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 是否被处置。0:正常，1:处置中
	 */
	@ApiField("risk_type")
	private Long riskType;

	/**
	 * 跳转地址
	 */
	@ApiField("url")
	private String url;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getAppPrincipalRiskMemo() {
		return this.appPrincipalRiskMemo;
	}
	public void setAppPrincipalRiskMemo(String appPrincipalRiskMemo) {
		this.appPrincipalRiskMemo = appPrincipalRiskMemo;
	}

	public String getAppRiskMemo() {
		return this.appRiskMemo;
	}
	public void setAppRiskMemo(String appRiskMemo) {
		this.appRiskMemo = appRiskMemo;
	}

	public Long getAppStatus() {
		return this.appStatus;
	}
	public void setAppStatus(Long appStatus) {
		this.appStatus = appStatus;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Long getLimitationTag() {
		return this.limitationTag;
	}
	public void setLimitationTag(Long limitationTag) {
		this.limitationTag = limitationTag;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getRiskType() {
		return this.riskType;
	}
	public void setRiskType(Long riskType) {
		this.riskType = riskType;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
