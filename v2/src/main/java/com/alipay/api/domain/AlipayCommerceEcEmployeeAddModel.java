package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 添加员工
 *
 * @author auto create
 * @since 1.0, 2023-10-30 14:33:17
 */
public class AlipayCommerceEcEmployeeAddModel extends AlipayObject {

	private static final long serialVersionUID = 3235777622686487191L;

	/**
	 * 员工所属部门
	 */
	@ApiListField("department_ids")
	@ApiField("string")
	private List<String> departmentIds;

	/**
	 * 证件号码，根据employee_cert_type指定的证件类型，传入对应的证件号码，用于企业人脸库员工刷脸开通时的核验。
	 */
	@ApiField("employee_cert_no")
	private String employeeCertNo;

	/**
	 * 证件类型，用于企业人脸库员工刷脸开通时的核验
	 */
	@ApiField("employee_cert_type")
	private String employeeCertType;

	/**
	 * 员工邮箱
	 */
	@ApiField("employee_email")
	private String employeeEmail;

	/**
	 * 员工手机号
	 */
	@ApiField("employee_mobile")
	private String employeeMobile;

	/**
	 * 员工姓名
	 */
	@ApiField("employee_name")
	private String employeeName;

	/**
	 * 员工工号
	 */
	@ApiField("employee_no")
	private String employeeNo;

	/**
	 * 加密证件号（默认转大写后用SHA256加密）与证件类型搭配使用，不可与证件号同时存在
	 */
	@ApiField("encrypt_cert_no")
	private String encryptCertNo;

	/**
	 * 加密手机号（默认使用SHA256加密，不可与手机号同时存在）
	 */
	@ApiField("encrypt_mobile")
	private String encryptMobile;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 员工身份标识
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 当identity_type为ALIPAY_USER_ID时，此字段传入open_id
	 */
	@ApiField("identity_open_id")
	private String identityOpenId;

	/**
	 * 身份类型
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 员工刷脸加入企业人脸库时的核验方式
	 */
	@ApiField("iot_check_type")
	private String iotCheckType;

	/**
	 * 员工在企业人脸库的人脸唯一标识（该字段已作废，不支持自定义传入） 当前字段已废弃(iot不支持自定义传入)
	 */
	@ApiField("iot_vid")
	@Deprecated
	private String iotVid;

	/**
	 * 角色列表，目前只支持填一种角色，默认为USER
	 */
	@ApiListField("role_list")
	@ApiField("string")
	private List<String> roleList;

	/**
	 * 员工签约后回跳地址
	 */
	@ApiField("sign_return_url")
	private String signReturnUrl;

	/**
	 * 签约链接是否需要携带员工身份信息(手机/邮箱)
	 */
	@ApiField("sign_url_carry_info")
	private Boolean signUrlCarryInfo;

	public List<String> getDepartmentIds() {
		return this.departmentIds;
	}
	public void setDepartmentIds(List<String> departmentIds) {
		this.departmentIds = departmentIds;
	}

	public String getEmployeeCertNo() {
		return this.employeeCertNo;
	}
	public void setEmployeeCertNo(String employeeCertNo) {
		this.employeeCertNo = employeeCertNo;
	}

	public String getEmployeeCertType() {
		return this.employeeCertType;
	}
	public void setEmployeeCertType(String employeeCertType) {
		this.employeeCertType = employeeCertType;
	}

	public String getEmployeeEmail() {
		return this.employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getEmployeeMobile() {
		return this.employeeMobile;
	}
	public void setEmployeeMobile(String employeeMobile) {
		this.employeeMobile = employeeMobile;
	}

	public String getEmployeeName() {
		return this.employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeNo() {
		return this.employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getEncryptCertNo() {
		return this.encryptCertNo;
	}
	public void setEncryptCertNo(String encryptCertNo) {
		this.encryptCertNo = encryptCertNo;
	}

	public String getEncryptMobile() {
		return this.encryptMobile;
	}
	public void setEncryptMobile(String encryptMobile) {
		this.encryptMobile = encryptMobile;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityOpenId() {
		return this.identityOpenId;
	}
	public void setIdentityOpenId(String identityOpenId) {
		this.identityOpenId = identityOpenId;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getIotCheckType() {
		return this.iotCheckType;
	}
	public void setIotCheckType(String iotCheckType) {
		this.iotCheckType = iotCheckType;
	}

	public String getIotVid() {
		return this.iotVid;
	}
	public void setIotVid(String iotVid) {
		this.iotVid = iotVid;
	}

	public List<String> getRoleList() {
		return this.roleList;
	}
	public void setRoleList(List<String> roleList) {
		this.roleList = roleList;
	}

	public String getSignReturnUrl() {
		return this.signReturnUrl;
	}
	public void setSignReturnUrl(String signReturnUrl) {
		this.signReturnUrl = signReturnUrl;
	}

	public Boolean getSignUrlCarryInfo() {
		return this.signUrlCarryInfo;
	}
	public void setSignUrlCarryInfo(Boolean signUrlCarryInfo) {
		this.signUrlCarryInfo = signUrlCarryInfo;
	}

}
