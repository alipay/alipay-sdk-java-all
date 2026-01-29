package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 劳务税金计税明细
 *
 * @author auto create
 * @since 1.0, 2026-01-21 10:12:15
 */
public class IitBizDetailBillDetailOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 6794849722242428439L;

	/**
	 * 实发金额
	 */
	@ApiField("actual_amount")
	private MultiCurrencyMoneyOpenApi actualAmount;

	/**
	 * 账单金额
	 */
	@ApiField("bill_amt")
	private MultiCurrencyMoneyOpenApi billAmt;

	/**
	 * 出生日期
	 */
	@ApiField("birthday")
	private String birthday;

	/**
	 * 券模版ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务场景码
	 */
	@ApiField("biz_scene_code")
	private String bizSceneCode;

	/**
	 * 城建税
	 */
	@ApiField("city_main_const_tax_amount")
	private MultiCurrencyMoneyOpenApi cityMainConstTaxAmount;

	/**
	 * 联系方式
	 */
	@ApiField("contact")
	private String contact;

	/**
	 * 国籍
	 */
	@ApiField("country")
	private String country;

	/**
	 * 残疾证号码
	 */
	@ApiField("disability_cert_no")
	private String disabilityCertNo;

	/**
	 * 教育附加
	 */
	@ApiField("edu_surcharge_amount")
	private MultiCurrencyMoneyOpenApi eduSurchargeAmount;

	/**
	 * 性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 计税明细唯一标识
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 上游的唯一标识
	 */
	@ApiField("idempotent_id")
	private String idempotentId;

	/**
	 * 个人所得税
	 */
	@ApiField("iit_amount")
	private MultiCurrencyMoneyOpenApi iitAmount;

	/**
	 * 个税项目
	 */
	@ApiField("iit_project")
	private String iitProject;

	/**
	 * 机构ID
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 地方教育附加
	 */
	@ApiField("local_edu_surcharge_amount")
	private MultiCurrencyMoneyOpenApi localEduSurchargeAmount;

	/**
	 * 期间，月份
	 */
	@ApiField("period")
	private String period;

	/**
	 * 税金承担方式
	 */
	@ApiField("tax_base_type")
	private String taxBaseType;

	/**
	 * 证件号码
	 */
	@ApiField("taxpayer_cert_no")
	private String taxpayerCertNo;

	/**
	 * 纳税人证件类型
	 */
	@ApiField("taxpayer_cert_type")
	private String taxpayerCertType;

	/**
	 * 纳税人名称
	 */
	@ApiField("taxpayer_name")
	private String taxpayerName;

	/**
	 * 税金合计，个税+增值税+附加
	 */
	@ApiField("total_tax_amount")
	private MultiCurrencyMoneyOpenApi totalTaxAmount;

	/**
	 * 是否残疾
	 */
	@ApiField("user_is_disability")
	private String userIsDisability;

	/**
	 * 增值税
	 */
	@ApiField("vat_amount")
	private MultiCurrencyMoneyOpenApi vatAmount;

	public MultiCurrencyMoneyOpenApi getActualAmount() {
		return this.actualAmount;
	}
	public void setActualAmount(MultiCurrencyMoneyOpenApi actualAmount) {
		this.actualAmount = actualAmount;
	}

	public MultiCurrencyMoneyOpenApi getBillAmt() {
		return this.billAmt;
	}
	public void setBillAmt(MultiCurrencyMoneyOpenApi billAmt) {
		this.billAmt = billAmt;
	}

	public String getBirthday() {
		return this.birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizSceneCode() {
		return this.bizSceneCode;
	}
	public void setBizSceneCode(String bizSceneCode) {
		this.bizSceneCode = bizSceneCode;
	}

	public MultiCurrencyMoneyOpenApi getCityMainConstTaxAmount() {
		return this.cityMainConstTaxAmount;
	}
	public void setCityMainConstTaxAmount(MultiCurrencyMoneyOpenApi cityMainConstTaxAmount) {
		this.cityMainConstTaxAmount = cityMainConstTaxAmount;
	}

	public String getContact() {
		return this.contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getDisabilityCertNo() {
		return this.disabilityCertNo;
	}
	public void setDisabilityCertNo(String disabilityCertNo) {
		this.disabilityCertNo = disabilityCertNo;
	}

	public MultiCurrencyMoneyOpenApi getEduSurchargeAmount() {
		return this.eduSurchargeAmount;
	}
	public void setEduSurchargeAmount(MultiCurrencyMoneyOpenApi eduSurchargeAmount) {
		this.eduSurchargeAmount = eduSurchargeAmount;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getIdempotentId() {
		return this.idempotentId;
	}
	public void setIdempotentId(String idempotentId) {
		this.idempotentId = idempotentId;
	}

	public MultiCurrencyMoneyOpenApi getIitAmount() {
		return this.iitAmount;
	}
	public void setIitAmount(MultiCurrencyMoneyOpenApi iitAmount) {
		this.iitAmount = iitAmount;
	}

	public String getIitProject() {
		return this.iitProject;
	}
	public void setIitProject(String iitProject) {
		this.iitProject = iitProject;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public MultiCurrencyMoneyOpenApi getLocalEduSurchargeAmount() {
		return this.localEduSurchargeAmount;
	}
	public void setLocalEduSurchargeAmount(MultiCurrencyMoneyOpenApi localEduSurchargeAmount) {
		this.localEduSurchargeAmount = localEduSurchargeAmount;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public String getTaxBaseType() {
		return this.taxBaseType;
	}
	public void setTaxBaseType(String taxBaseType) {
		this.taxBaseType = taxBaseType;
	}

	public String getTaxpayerCertNo() {
		return this.taxpayerCertNo;
	}
	public void setTaxpayerCertNo(String taxpayerCertNo) {
		this.taxpayerCertNo = taxpayerCertNo;
	}

	public String getTaxpayerCertType() {
		return this.taxpayerCertType;
	}
	public void setTaxpayerCertType(String taxpayerCertType) {
		this.taxpayerCertType = taxpayerCertType;
	}

	public String getTaxpayerName() {
		return this.taxpayerName;
	}
	public void setTaxpayerName(String taxpayerName) {
		this.taxpayerName = taxpayerName;
	}

	public MultiCurrencyMoneyOpenApi getTotalTaxAmount() {
		return this.totalTaxAmount;
	}
	public void setTotalTaxAmount(MultiCurrencyMoneyOpenApi totalTaxAmount) {
		this.totalTaxAmount = totalTaxAmount;
	}

	public String getUserIsDisability() {
		return this.userIsDisability;
	}
	public void setUserIsDisability(String userIsDisability) {
		this.userIsDisability = userIsDisability;
	}

	public MultiCurrencyMoneyOpenApi getVatAmount() {
		return this.vatAmount;
	}
	public void setVatAmount(MultiCurrencyMoneyOpenApi vatAmount) {
		this.vatAmount = vatAmount;
	}

}
