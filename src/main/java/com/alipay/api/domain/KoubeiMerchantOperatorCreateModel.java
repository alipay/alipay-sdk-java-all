package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建操作员
 *
 * @author auto create
 * @since 1.0, 2021-10-26 11:59:07
 */
public class KoubeiMerchantOperatorCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4864354242695271241L;

	/**
	 * 授权码
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 部门ID
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
	 * 免单限额单位
	 */
	@ApiField("free_limit_unit")
	private String freeLimitUnit;

	/**
	 * 免单限额
	 */
	@ApiField("free_limit_value")
	private String freeLimitValue;

	/**
	 * 性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 操作员绑定的部门类型 5-部门，6-门店
	 */
	@ApiField("job_type")
	private String jobType;

	/**
	 * 登录名
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 操作员名字
	 */
	@ApiField("operator_name")
	private String operatorName;

	/**
	 * 角色ID, 示例值角色为店长
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

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
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
