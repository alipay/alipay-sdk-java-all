package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ape创建project
 *
 * @author auto create
 * @since 1.0, 2022-09-29 10:44:54
 */
public class AlipayDigitalopUcdpApeprojectCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2749118254286995713L;

	/**
	 * 实际接入推荐项目的商家PID
	 */
	@ApiField("actual_merchant_id")
	private String actualMerchantId;

	/**
	 * 代商户操作的调用者(ISV)信息，如果是商家自身操作，就填商家ID，如果ISV代为操作，就填ISV ID
	 */
	@ApiField("invoker_id")
	private String invokerId;

	/**
	 * 商家的PID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 实际接入推荐项目的小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * apemng分配的租户ID（使用前需要和apemng系统对接，由apemng系统人员分配租户ID）
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 将要创建project的项目名字（中英文都可以）
	 */
	@ApiField("project_name")
	private String projectName;

	/**
	 * 创建project的模版，如果是测试项目，填test，如果是正式项目，填normal，如果有特殊需要，和apemng系统人员确认
	 */
	@ApiField("template_code")
	private String templateCode;

	public String getActualMerchantId() {
		return this.actualMerchantId;
	}
	public void setActualMerchantId(String actualMerchantId) {
		this.actualMerchantId = actualMerchantId;
	}

	public String getInvokerId() {
		return this.invokerId;
	}
	public void setInvokerId(String invokerId) {
		this.invokerId = invokerId;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getProjectName() {
		return this.projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

}
