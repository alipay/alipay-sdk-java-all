package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 添加员工
 *
 * @author auto create
 * @since 1.0, 2024-07-09 11:20:16
 */
public class AlipayCommerceEcEmployeeAddModel extends AlipayObject {

	private static final long serialVersionUID = 8151956419976215354L;

	/**
	 * 是否需要生成吱口令，默认不生成
	 */
	@ApiField("create_share_code")
	private Boolean createShareCode;

	/**
	 * 员工所属部门
	 */
	@ApiListField("department_ids")
	@ApiField("string")
	private List<String> departmentIds;

	/**
	 * 证件号码，根据employee_cert_type指定的证件类型，传入对应的证件号码，可用于企业人脸库员工刷脸开通时的核验。
	 */
	@ApiField("employee_cert_no")
	private String employeeCertNo;

	/**
	 * 证件类型，目前仅支持身份证，可用于企业人脸库员工刷脸开通时的核验
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
	 * 员工编号/工号
	 */
	@ApiField("employee_no")
	private String employeeNo;

	/**
	 * 加密证件号，需与证件类型搭配使用，可替代证件号码(employee_cert_no)字段
	 */
	@ApiField("encrypt_cert_no")
	private String encryptCertNo;

	/**
	 * 加密手机号，可替代手机号(employee_mobile)字段
	 */
	@ApiField("encrypt_mobile")
	private String encryptMobile;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 员工身份唯一标识
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 当identity_type为ALIPAY_USER_ID时，此字段传入open_id
	 */
	@ApiField("identity_open_id")
	private String identityOpenId;

	/**
	 * 员工身份类型
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
	 * 个性化信息 <a href='https://opendocs.alipay.com/pre-open/0ceh47?pathHash=14fac87c'>详见文档</a>
	 */
	@ApiField("profiles")
	private String profiles;

	/**
	 * 默认角色列表，目前只支持默认为 USER
	 */
	@ApiListField("role_list")
	@ApiField("string")
	private List<String> roleList;

	/**
	 * 员工签约后回跳地址；支持 alipay scheme 协议地址，不传默认跳转企业码小程序首页
	 */
	@ApiField("sign_return_url")
	private String signReturnUrl;

	/**
	 * 签约链接页面是否需要自动回显员工的身份信息（手机或邮箱），默认不显示
	 */
	@ApiField("sign_url_carry_info")
	private Boolean signUrlCarryInfo;

	/**
	 * 代扣签约字符串，需调支付宝个人协议页面签约接口，并按规则生成，见
<a href='https://opendocs.alipay.com/pre-open/20170601105911096277new/moiixx?pathHash=10b1fa66'>参考文档</a> 3.1.3 生成签约字符串示例
	 */
	@ApiField("withholding_sign_str")
	private String withholdingSignStr;

	public Boolean getCreateShareCode() {
		return this.createShareCode;
	}
	public void setCreateShareCode(Boolean createShareCode) {
		this.createShareCode = createShareCode;
	}

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

	public String getWithholdingSignStr() {
		return this.withholdingSignStr;
	}
	public void setWithholdingSignStr(String withholdingSignStr) {
		this.withholdingSignStr = withholdingSignStr;
	}

}
