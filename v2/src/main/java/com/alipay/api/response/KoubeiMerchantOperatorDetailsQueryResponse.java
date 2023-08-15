package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.details.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 04:08:53
 */
public class KoubeiMerchantOperatorDetailsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1437371137667583571L;

	/** 
	 * 操作员所属的部门id
	 */
	@ApiField("department_id")
	private String departmentId;

	/** 
	 * 操作员所属的组织部门名称
	 */
	@ApiField("department_name")
	private String departmentName;

	/** 
	 * 折让限额单位长度不合法
	 */
	@ApiField("discount_limit_unit")
	private String discountLimitUnit;

	/** 
	 * 折让限额
	 */
	@ApiField("discount_limit_value")
	private String discountLimitValue;

	/** 
	 * 30
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
	 * 操作员关联的部门类型
5-部门
6-门店
	 */
	@ApiField("job_type")
	private String jobType;

	/** 
	 * 操作员登录账号
	 */
	@ApiField("login_id")
	private String loginId;

	/** 
	 * 管理的门店数量
	 */
	@ApiField("manage_shops")
	private String manageShops;

	/** 
	 * 操作员绑定的手机号，会用于接收短信校验码和短信通知
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * 操作员ID
	 */
	@ApiField("operator_id")
	private String operatorId;

	/** 
	 * 操作员真实姓名
	 */
	@ApiField("operator_name")
	private String operatorName;

	/** 
	 * 操作员激活码
	 */
	@ApiField("qr_code_url")
	private String qrCodeUrl;

	/** 
	 * 角色代码
	 */
	@ApiField("role_code")
	private String roleCode;

	/** 
	 * 操作员关联的角色id
	 */
	@ApiField("role_id")
	private String roleId;

	/** 
	 * 操作员关联的角色名称
	 */
	@ApiField("role_name")
	private String roleName;

	/** 
	 * 操作员状态： 未激活-W，锁定-U，正常-T
	 */
	@ApiField("status")
	private String status;

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentId( ) {
		return this.departmentId;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentName( ) {
		return this.departmentName;
	}

	public void setDiscountLimitUnit(String discountLimitUnit) {
		this.discountLimitUnit = discountLimitUnit;
	}
	public String getDiscountLimitUnit( ) {
		return this.discountLimitUnit;
	}

	public void setDiscountLimitValue(String discountLimitValue) {
		this.discountLimitValue = discountLimitValue;
	}
	public String getDiscountLimitValue( ) {
		return this.discountLimitValue;
	}

	public void setFreeLimitUnit(String freeLimitUnit) {
		this.freeLimitUnit = freeLimitUnit;
	}
	public String getFreeLimitUnit( ) {
		return this.freeLimitUnit;
	}

	public void setFreeLimitValue(String freeLimitValue) {
		this.freeLimitValue = freeLimitValue;
	}
	public String getFreeLimitValue( ) {
		return this.freeLimitValue;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender( ) {
		return this.gender;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public String getJobType( ) {
		return this.jobType;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginId( ) {
		return this.loginId;
	}

	public void setManageShops(String manageShops) {
		this.manageShops = manageShops;
	}
	public String getManageShops( ) {
		return this.manageShops;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile( ) {
		return this.mobile;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	public String getOperatorId( ) {
		return this.operatorId;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	public String getOperatorName( ) {
		return this.operatorName;
	}

	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}
	public String getQrCodeUrl( ) {
		return this.qrCodeUrl;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public String getRoleCode( ) {
		return this.roleCode;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getRoleId( ) {
		return this.roleId;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleName( ) {
		return this.roleName;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
