package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建部门升级
 *
 * @author auto create
 * @since 1.0, 2024-03-14 15:51:51
 */
public class AlipayCommerceEcDepartmentUpgradeSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 6898996639483256545L;

	/**
	 * 待升级的部门id
	 */
	@ApiField("department_id")
	private String departmentId;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 部门升级为子企业后的企业名称
	 */
	@ApiField("sub_enterprise_name")
	private String subEnterpriseName;

	/**
	 * 子企业企业支付宝身份标识，对应identity_type进行传参： 1. 手机号或者邮箱（当身份类型传ALIPAY_LOGON_ID时） 2. 支付宝会员id（当身份类型传ALIPAY_USER_ID时）
	 */
	@ApiField("sub_identity")
	private String subIdentity;

	/**
	 * open_id
	 */
	@ApiField("sub_identity_open_id")
	private String subIdentityOpenId;

	/**
	 * 子企业企业支付宝身份类型，支持支付宝会员id和登录账号
	 */
	@ApiField("sub_identity_type")
	private String subIdentityType;

	public String getDepartmentId() {
		return this.departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getSubEnterpriseName() {
		return this.subEnterpriseName;
	}
	public void setSubEnterpriseName(String subEnterpriseName) {
		this.subEnterpriseName = subEnterpriseName;
	}

	public String getSubIdentity() {
		return this.subIdentity;
	}
	public void setSubIdentity(String subIdentity) {
		this.subIdentity = subIdentity;
	}

	public String getSubIdentityOpenId() {
		return this.subIdentityOpenId;
	}
	public void setSubIdentityOpenId(String subIdentityOpenId) {
		this.subIdentityOpenId = subIdentityOpenId;
	}

	public String getSubIdentityType() {
		return this.subIdentityType;
	}
	public void setSubIdentityType(String subIdentityType) {
		this.subIdentityType = subIdentityType;
	}

}
