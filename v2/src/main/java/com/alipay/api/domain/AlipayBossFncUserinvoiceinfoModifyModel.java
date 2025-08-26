package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改用户开票资料
 *
 * @author auto create
 * @since 1.0, 2022-07-15 14:09:28
 */
public class AlipayBossFncUserinvoiceinfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1564373153513422259L;

	/**
	 * 是否接受电子票 true:是，false:否
	 */
	@ApiField("accept_electronic")
	private Boolean acceptElectronic;

	/**
	 * 公司注册地址，公司营业执照上登记的住址，一般纳税人必须填写，小规模纳税人无需填写
	 */
	@ApiField("address")
	private String address;

	/**
	 * 是否自动申请开票 true:是；false:否
	 */
	@ApiField("auto")
	private Boolean auto;

	/**
	 * 银行账户，公司银行账号
一般纳税人必须填写，小规模纳税人无需填写
	 */
	@ApiField("bank_account")
	private String bankAccount;

	/**
	 * 开户行，办理银行开户手续的营业网点
一般纳税人必须填写，小规模纳税人无需填写
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 营业执照地址，营业执照上传oss上的地址
	 */
	@ApiField("business_licence_url")
	private String businessLicenceUrl;

	/**
	 * 是否暂停开票，商户修改无效，如果要暂停开票，只能去结算中台处理。
	 */
	@ApiField("hold")
	private Boolean hold;

	/**
	 * 开票资料ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 银行开户许可证附件，银行开户许可证上传oss上的地址
	 */
	@ApiField("open_account_permit_url")
	private String openAccountPermitUrl;

	/**
	 * 当前操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 当前操作人类型,01:商户；02:管理员(小二)
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 其它资质证明地址，其他资质证明附件上传oss上的地址
	 */
	@ApiField("other_qualification_url")
	private String otherQualificationUrl;

	/**
	 * 纳税人识别号，税务登记证上的号码。一般纳税人必须填写，小规模纳税人如果是商户也必须填写，个人无需填写
	 */
	@ApiField("tax_no")
	private String taxNo;

	/**
	 * 纳税人资格开始时间 （格式：时间戳）
一般纳税人必须填写，小规模纳税人无需填写
	 */
	@ApiField("tax_payer_quali_valid")
	private Date taxPayerQualiValid;

	/**
	 * 纳税人资格种类，01：一般纳税人；02：小规模纳税人；03：国际商户
	 */
	@ApiField("tax_payer_qualification")
	private String taxPayerQualification;

	/**
	 * 一般纳税人资格证书地址，一般纳税人资格证书上传oss上的地址
	 */
	@ApiField("tax_qualification_url")
	private String taxQualificationUrl;

	/**
	 * 税务登记证地址，税务登记证上传oss上的地址
	 */
	@ApiField("tax_reg_cert_url")
	private String taxRegCertUrl;

	/**
	 * 公司注册电话
一般纳税人必须填写，小规模纳税人无需填写
	 */
	@ApiField("telephone")
	private String telephone;

	/**
	 * 发票抬头，票面信息上的抬头信息
	 */
	@ApiField("title")
	private String title;

	/**
	 * 收件人列表,若不修改此项可以不填
选择非电子票时，邮寄信息必填，且保证邮寄信息的ipRoleId和开票资料的ipRoleId相等
	 */
	@ApiListField("user_mail_info_order_list")
	@ApiField("user_mail_info_order")
	private List<UserMailInfoOrder> userMailInfoOrderList;

	public Boolean getAcceptElectronic() {
		return this.acceptElectronic;
	}
	public void setAcceptElectronic(Boolean acceptElectronic) {
		this.acceptElectronic = acceptElectronic;
	}

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public Boolean getAuto() {
		return this.auto;
	}
	public void setAuto(Boolean auto) {
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

	public Boolean getHold() {
		return this.hold;
	}
	public void setHold(Boolean hold) {
		this.hold = hold;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getOpenAccountPermitUrl() {
		return this.openAccountPermitUrl;
	}
	public void setOpenAccountPermitUrl(String openAccountPermitUrl) {
		this.openAccountPermitUrl = openAccountPermitUrl;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	public String getOtherQualificationUrl() {
		return this.otherQualificationUrl;
	}
	public void setOtherQualificationUrl(String otherQualificationUrl) {
		this.otherQualificationUrl = otherQualificationUrl;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public Date getTaxPayerQualiValid() {
		return this.taxPayerQualiValid;
	}
	public void setTaxPayerQualiValid(Date taxPayerQualiValid) {
		this.taxPayerQualiValid = taxPayerQualiValid;
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

	public List<UserMailInfoOrder> getUserMailInfoOrderList() {
		return this.userMailInfoOrderList;
	}
	public void setUserMailInfoOrderList(List<UserMailInfoOrder> userMailInfoOrderList) {
		this.userMailInfoOrderList = userMailInfoOrderList;
	}

}
