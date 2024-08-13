package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 开票资料
 *
 * @author auto create
 * @since 1.0, 2020-01-08 14:10:17
 */
public class ApUserInvoiceInfoOpenApiResponse extends AlipayObject {

	private static final long serialVersionUID = 8396954451392781932L;

	/**
	 * (AR开票使用)是否接受电子票 true:是，false:否
	 */
	@ApiField("accept_electronic")
	private String acceptElectronic;

	/**
	 * 公司注册地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * (AR开票使用)是否自动申请开票 true:是，false:否
	 */
	@ApiField("auto")
	private String auto;

	/**
	 * 银行账户
	 */
	@ApiField("bank_account")
	private String bankAccount;

	/**
	 * 开户行
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 营业执照地址
	 */
	@ApiField("business_licence_url")
	private String businessLicenceUrl;

	/**
	 * 资料创建人
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * (AR开票使用)是否暂停开票
 true:暂停开票，false:可开票
	 */
	@ApiField("hold")
	private String hold;

	/**
	 * 开票资料ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 商户PID,
 type=01时表示OU用户,填充的是InstId机构代码,例如Z50,
 type=02时表示商户MID,
 type=03时表示商户PID
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 商户MID,兼容老版本VO
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 最后修改人
	 */
	@ApiField("last_modifier")
	private String lastModifier;

	/**
	 * 银行开户许可证地址
	 */
	@ApiField("open_account_permit_url")
	private String openAccountPermitUrl;

	/**
	 * 其它资质证明地址
	 */
	@ApiField("other_qualification_url")
	private String otherQualificationUrl;

	/**
	 * 资料状态，01：待审，02：已审(有效)， 03：已作废
	 */
	@ApiField("status")
	private String status;

	/**
	 * 上一次任务执行时间(针对自动开票场景),格式:yyyyMMdd
	 */
	@ApiField("task_date")
	private String taskDate;

	/**
	 * 纳税人识别号（购方税号）
	 */
	@ApiField("tax_no")
	private String taxNo;

	/**
	 * 纳税人开票资格种类
 01：一般纳税人，02：小规模纳税人
	 */
	@ApiField("tax_payer_qualification")
	private String taxPayerQualification;

	/**
	 * 一般纳税人资格证书地址
	 */
	@ApiField("tax_qualification_url")
	private String taxQualificationUrl;

	/**
	 * 税务登记证地址
	 */
	@ApiField("tax_reg_cert_url")
	private String taxRegCertUrl;

	/**
	 * 纳税人资格开始时间 （时间戳）
	 */
	@ApiField("taxpayer_quali_valid")
	private Date taxpayerQualiValid;

	/**
	 * 公司注册电话
	 */
	@ApiField("telephone")
	private String telephone;

	/**
	 * 发票抬头
	 */
	@ApiField("title")
	private String title;

	/**
	 * 租户ID
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 开票资料用户类型 
 01：OU，02：商户，03：C用户
	 */
	@ApiField("type")
	private String type;

	/**
	 * 收件人地址列表
	 */
	@ApiListField("user_mail_info_list")
	@ApiField("ap_user_mail_info_open_api_response")
	private List<ApUserMailInfoOpenApiResponse> userMailInfoList;

	public String getAcceptElectronic() {
		return this.acceptElectronic;
	}
	public void setAcceptElectronic(String acceptElectronic) {
		this.acceptElectronic = acceptElectronic;
	}

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAuto() {
		return this.auto;
	}
	public void setAuto(String auto) {
		this.auto = auto;
	}

	public String getBankAccount() {
		return this.bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBusinessLicenceUrl() {
		return this.businessLicenceUrl;
	}
	public void setBusinessLicenceUrl(String businessLicenceUrl) {
		this.businessLicenceUrl = businessLicenceUrl;
	}

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
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

	public String getHold() {
		return this.hold;
	}
	public void setHold(String hold) {
		this.hold = hold;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getIpId() {
		return this.ipId;
	}
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getLastModifier() {
		return this.lastModifier;
	}
	public void setLastModifier(String lastModifier) {
		this.lastModifier = lastModifier;
	}

	public String getOpenAccountPermitUrl() {
		return this.openAccountPermitUrl;
	}
	public void setOpenAccountPermitUrl(String openAccountPermitUrl) {
		this.openAccountPermitUrl = openAccountPermitUrl;
	}

	public String getOtherQualificationUrl() {
		return this.otherQualificationUrl;
	}
	public void setOtherQualificationUrl(String otherQualificationUrl) {
		this.otherQualificationUrl = otherQualificationUrl;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTaskDate() {
		return this.taskDate;
	}
	public void setTaskDate(String taskDate) {
		this.taskDate = taskDate;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public String getTaxPayerQualification() {
		return this.taxPayerQualification;
	}
	public void setTaxPayerQualification(String taxPayerQualification) {
		this.taxPayerQualification = taxPayerQualification;
	}

	public String getTaxQualificationUrl() {
		return this.taxQualificationUrl;
	}
	public void setTaxQualificationUrl(String taxQualificationUrl) {
		this.taxQualificationUrl = taxQualificationUrl;
	}

	public String getTaxRegCertUrl() {
		return this.taxRegCertUrl;
	}
	public void setTaxRegCertUrl(String taxRegCertUrl) {
		this.taxRegCertUrl = taxRegCertUrl;
	}

	public Date getTaxpayerQualiValid() {
		return this.taxpayerQualiValid;
	}
	public void setTaxpayerQualiValid(Date taxpayerQualiValid) {
		this.taxpayerQualiValid = taxpayerQualiValid;
	}

	public String getTelephone() {
		return this.telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public List<ApUserMailInfoOpenApiResponse> getUserMailInfoList() {
		return this.userMailInfoList;
	}
	public void setUserMailInfoList(List<ApUserMailInfoOpenApiResponse> userMailInfoList) {
		this.userMailInfoList = userMailInfoList;
	}

}
