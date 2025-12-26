package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核身可用性查询接口
 *
 * @author auto create
 * @since 1.0, 2019-06-28 10:50:06
 */
public class AlipaySecurityRiskVerifyidentityApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4344294258721339264L;

	/**
	 * 用户帐号
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 用户姓名
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 帐号类型：ALIPAY_USERID,CERT
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 接入业务方业务唯一性id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务信息上下文，JSON结构
	 */
	@ApiField("biz_params")
	private String bizParams;

	/**
	 * 身份核验场景CODE，商务谈判基础上，由支付宝来分配。
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 待校验的核身产品集合
	 */
	@ApiField("validate_product_group")
	private String validateProductGroup;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizParams() {
		return this.bizParams;
	}
	public void setBizParams(String bizParams) {
		this.bizParams = bizParams;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getValidateProductGroup() {
		return this.validateProductGroup;
	}
	public void setValidateProductGroup(String validateProductGroup) {
		this.validateProductGroup = validateProductGroup;
	}

}
