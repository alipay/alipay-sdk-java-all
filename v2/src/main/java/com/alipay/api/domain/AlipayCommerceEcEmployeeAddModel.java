package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 添加员工
 *
 * @author auto create
 * @since 1.0, 2023-03-17 14:43:50
 */
public class AlipayCommerceEcEmployeeAddModel extends AlipayObject {

	private static final long serialVersionUID = 7248365942421497871L;

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
	 * 证件类型，用于企业人脸库员工刷脸开通时的核验，
枚举支持：IDENTITY_CARD身份证，PASS_PORT护照，STU_NUM学生学号，COMPANY_NUM工号，TAIWAN_CARD台胞证，HK_MC_CARD港澳证件
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
1.和identity二选一
	 */
	@ApiField("employee_mobile")
	private String employeeMobile;

	/**
	 * 员工姓名
	 */
	@ApiField("employee_name")
	private String employeeName;

	/**
	 * 员工编号
	 */
	@ApiField("employee_no")
	private String employeeNo;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 身份
1.和employee_mobile二选一
2.对应身份类型进行传参，企业支付宝登录账号(支持手机号或者邮箱)或企业支付宝会员id(对应2088开头的支付宝会员id)
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
ALIPAY_LOGON_ID(企业支付宝登录账号)
ALIPAY_USER_ID(企业支付宝会员id)
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 员工刷脸加入企业人脸库时的核验方式，如果设置为business_facepay_checkall，则employee_name、employee_cert_type、employee_cert_no必传，如果不传则默认不核验。
	 */
	@ApiField("iot_check_type")
	private String iotCheckType;

	/**
	 * 员工在企业人脸库的人脸唯一标识，支持自定义传入，如果未传入则会默认生成
	 */
	@ApiField("iot_vid")
	private String iotVid;

	/**
	 * 角色列表，目前只支持填一种角色，默认为USER
USER：普通员工
ADMIN：管理员
	 */
	@ApiListField("role_list")
	@ApiField("string")
	private List<String> roleList;

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

}
