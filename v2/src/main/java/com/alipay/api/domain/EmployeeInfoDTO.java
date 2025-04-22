package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 员工信息
 *
 * @author auto create
 * @since 1.0, 2025-04-09 15:57:21
 */
public class EmployeeInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6857444478886668175L;

	/**
	 * 员工所属核算主体列表
	 */
	@ApiListField("accounting_entity_list")
	@ApiField("employee_accounting_entity_d_t_o")
	private List<EmployeeAccountingEntityDTO> accountingEntityList;

	/**
	 * 是否激活
	 */
	@ApiField("activate")
	private String activate;

	/**
	 * 员工所属部门列表
	 */
	@ApiListField("department_list")
	@ApiField("employee_department_d_t_o")
	private List<EmployeeDepartmentDTO> departmentList;

	/**
	 * 员工邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 证件号
	 */
	@ApiField("employee_cert_no")
	private String employeeCertNo;

	/**
	 * 证件类型
	 */
	@ApiField("employee_cert_type")
	private String employeeCertType;

	/**
	 * 员工id
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 员工姓名
	 */
	@ApiField("employee_name")
	private String employeeName;

	/**
	 * 员工编号/工号
	 */
	@ApiField("employee_no")
	private String employeeNo;

	/**
	 * 加密证件号（证件号转大写后使用SHA256加密），搭配证件号使用
	 */
	@ApiField("encrypt_cert_no")
	private String encryptCertNo;

	/**
	 * 加密手机号（使用SHA256进行加密）
	 */
	@ApiField("encrypt_mobile")
	private String encryptMobile;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 变更时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 员工是否人脸在库
	 */
	@ApiField("iot_face_status")
	private String iotFaceStatus;

	/**
	 * IOT开通刷脸支持唯一操作流水号，此处透出用于外部服务商通过该unique_id便捷调用IOT侧接口
	 */
	@ApiField("iot_unique_id")
	private String iotUniqueId;

	/**
	 * 员工在企业人脸库的人脸唯一标识
	 */
	@ApiField("iot_vid")
	private String iotVid;

	/**
	 * 员工职级
	 */
	@ApiField("job_level_show")
	private String jobLevelShow;

	/**
	 * 员工标签
	 */
	@ApiListField("label_names")
	@ApiField("string")
	private List<String> labelNames;

	/**
	 * 手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 用户ID（绑定支付宝账号的uid）
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 个性化信息 <a href='https://opendocs.alipay.com/pre-open/0ceh47?pathHash=14fac87c'>详见文档</a>
	 */
	@ApiField("profiles")
	private String profiles;

	/**
	 * 角色列表
	 */
	@ApiListField("role_list")
	@ApiField("string")
	private List<String> roleList;

	/**
	 * 直属主管员工ID
	 */
	@ApiField("tl_employee_id")
	private String tlEmployeeId;

	/**
	 * 用户ID（绑定支付宝账号的uid）
	 */
	@ApiField("user_id")
	private String userId;

	public List<EmployeeAccountingEntityDTO> getAccountingEntityList() {
		return this.accountingEntityList;
	}
	public void setAccountingEntityList(List<EmployeeAccountingEntityDTO> accountingEntityList) {
		this.accountingEntityList = accountingEntityList;
	}

	public String getActivate() {
		return this.activate;
	}
	public void setActivate(String activate) {
		this.activate = activate;
	}

	public List<EmployeeDepartmentDTO> getDepartmentList() {
		return this.departmentList;
	}
	public void setDepartmentList(List<EmployeeDepartmentDTO> departmentList) {
		this.departmentList = departmentList;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
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

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
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

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getIotFaceStatus() {
		return this.iotFaceStatus;
	}
	public void setIotFaceStatus(String iotFaceStatus) {
		this.iotFaceStatus = iotFaceStatus;
	}

	public String getIotUniqueId() {
		return this.iotUniqueId;
	}
	public void setIotUniqueId(String iotUniqueId) {
		this.iotUniqueId = iotUniqueId;
	}

	public String getIotVid() {
		return this.iotVid;
	}
	public void setIotVid(String iotVid) {
		this.iotVid = iotVid;
	}

	public String getJobLevelShow() {
		return this.jobLevelShow;
	}
	public void setJobLevelShow(String jobLevelShow) {
		this.jobLevelShow = jobLevelShow;
	}

	public List<String> getLabelNames() {
		return this.labelNames;
	}
	public void setLabelNames(List<String> labelNames) {
		this.labelNames = labelNames;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getProfiles() {
		return this.profiles;
	}
	public void setProfiles(String profiles) {
		this.profiles = profiles;
	}

	public List<String> getRoleList() {
		return this.roleList;
	}
	public void setRoleList(List<String> roleList) {
		this.roleList = roleList;
	}

	public String getTlEmployeeId() {
		return this.tlEmployeeId;
	}
	public void setTlEmployeeId(String tlEmployeeId) {
		this.tlEmployeeId = tlEmployeeId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
