package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灵工授权结果查询
 *
 * @author auto create
 * @since 1.0, 2023-01-16 10:38:37
 */
public class AlipayFundFlexiblestaffingAuthorizeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3351982537112351121L;

	/**
	 * 灵工授权业务场景码，默认：DEFAULT。使用独立授权资产产品时，传递AUTHORIZE
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 【已废弃字段】灵工授权成功的用户支付宝登录号
	 */
	@ApiField("principal_account_no")
	private String principalAccountNo;

	/**
	 * 授权用户的主体Id，与pirincipal_type组合使用。
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 授权人名称
	 */
	@ApiField("principal_name")
	private String principalName;

	/**
	 * 授权主体类型
	 */
	@ApiField("principal_type")
	private String principalType;

	/**
	 * 灵工授权产品码，固定值：FLEXIBLE_STAFFING
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getPrincipalAccountNo() {
		return this.principalAccountNo;
	}
	public void setPrincipalAccountNo(String principalAccountNo) {
		this.principalAccountNo = principalAccountNo;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public String getPrincipalName() {
		return this.principalName;
	}
	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}

	public String getPrincipalType() {
		return this.principalType;
	}
	public void setPrincipalType(String principalType) {
		this.principalType = principalType;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
