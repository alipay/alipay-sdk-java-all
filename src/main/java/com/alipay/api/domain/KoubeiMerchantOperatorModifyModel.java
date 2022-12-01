package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更新操作员信息
 *
 * @author auto create
 * @since 1.0, 2022-06-17 16:38:28
 */
public class KoubeiMerchantOperatorModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3883759153233979918L;

	/**
	 * 授权码
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 组织部门ID
	 */
	@ApiField("department_id")
	private String departmentId;

	/**
	 * 折让限额单位
	 */
	@ApiField("discount_limit_unit")
	private String discountLimitUnit;

	/**
	 * 折让限额值
	 */
	@ApiField("discount_limit_value")
	private String discountLimitValue;

	/**
	 * 每天
	 */
	@ApiField("free_limit_unit")
	private String freeLimitUnit;

	/**
	 * 免单限额值
	 */
	@ApiField("free_limit_value")
	private String freeLimitValue;

	/**
	 * 性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 5-非叶子节点，6叶子节点
	 */
	@ApiField("job_type")
	private String jobType;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 操作员Id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作员姓名
	 */
	@ApiField("operator_name")
	private String operatorName;

	/**
	 * 操作员角色ID
	 */
	@ApiField("role_id")
	private String roleId;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getDepartmentId() {
		return this.departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getDiscountLimitUnit() {
		return this.discountLimitUnit;
	}
	public void setDiscountLimitUnit(String discountLimitUnit) {
		this.discountLimitUnit = discountLimitUnit;
	}

	public String getDiscountLimitValue() {
		return this.discountLimitValue;
	}
	public void setDiscountLimitValue(String discountLimitValue) {
		this.discountLimitValue = discountLimitValue;
	}

	public String getFreeLimitUnit() {
		return this.freeLimitUnit;
	}
	public void setFreeLimitUnit(String freeLimitUnit) {
		this.freeLimitUnit = freeLimitUnit;
	}

	public String getFreeLimitValue() {
		return this.freeLimitValue;
	}
	public void setFreeLimitValue(String freeLimitValue) {
		this.freeLimitValue = freeLimitValue;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getJobType() {
		return this.jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorName() {
		return this.operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getRoleId() {
		return this.roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

}
