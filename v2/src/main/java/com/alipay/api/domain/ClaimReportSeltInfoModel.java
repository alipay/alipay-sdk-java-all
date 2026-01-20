package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结算信息
 *
 * @author auto create
 * @since 1.0, 2025-10-28 14:27:28
 */
public class ClaimReportSeltInfoModel extends AlipayObject {

	private static final long serialVersionUID = 6178871452973151754L;

	/**
	 * 医保个账支付金额
单位：元，留俩位小数
	 */
	@ApiField("acct_pay_amount")
	private String acctPayAmount;

	/**
	 * 入院日期
	 */
	@ApiField("admission_date")
	private Date admissionDate;

	/**
	 * 自费支付金额
单位：元，留俩位小数
	 */
	@ApiField("cash_pay_amount")
	private String cashPayAmount;

	/**
	 * 出院日期
	 */
	@ApiField("discharge_ate")
	private Date dischargeAte;

	/**
	 * 医保统筹支付金额
单位：元，留俩位小数
	 */
	@ApiField("hifp_pay_amout")
	private String hifpPayAmout;

	/**
	 * 就诊ID
	 */
	@ApiField("inquery_id")
	private String inqueryId;

	/**
	 * 医疗类别
	 */
	@ApiField("med_type")
	private String medType;

	/**
	 * 支付总金额
单位：元，留俩位小数
	 */
	@ApiField("medfee_sumamt")
	private String medfeeSumamt;

	/**
	 * 就诊医院ID
	 */
	@ApiField("medical_org_id")
	private String medicalOrgId;

	/**
	 * 医院名称
	 */
	@ApiField("medical_org_name")
	private String medicalOrgName;

	/**
	 * 机构类型
	 */
	@ApiField("medins_type_name")
	private String medinsTypeName;

	/**
	 * 其他基金支付金额
单位：元，留俩位小数
	 */
	@ApiField("othfund_pay_amount")
	private String othfundPayAmount;

	/**
	 * 个人自付金额
单位：元，留俩位小数
	 */
	@ApiField("self_pay_amount")
	private String selfPayAmount;

	/**
	 * 结算时间
	 */
	@ApiField("selt_time")
	private Date seltTime;

	/**
	 * 医保结算单号
	 */
	@ApiField("setl_id")
	private String setlId;

	public String getAcctPayAmount() {
		return this.acctPayAmount;
	}
	public void setAcctPayAmount(String acctPayAmount) {
		this.acctPayAmount = acctPayAmount;
	}

	public Date getAdmissionDate() {
		return this.admissionDate;
	}
	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public String getCashPayAmount() {
		return this.cashPayAmount;
	}
	public void setCashPayAmount(String cashPayAmount) {
		this.cashPayAmount = cashPayAmount;
	}

	public Date getDischargeAte() {
		return this.dischargeAte;
	}
	public void setDischargeAte(Date dischargeAte) {
		this.dischargeAte = dischargeAte;
	}

	public String getHifpPayAmout() {
		return this.hifpPayAmout;
	}
	public void setHifpPayAmout(String hifpPayAmout) {
		this.hifpPayAmout = hifpPayAmout;
	}

	public String getInqueryId() {
		return this.inqueryId;
	}
	public void setInqueryId(String inqueryId) {
		this.inqueryId = inqueryId;
	}

	public String getMedType() {
		return this.medType;
	}
	public void setMedType(String medType) {
		this.medType = medType;
	}

	public String getMedfeeSumamt() {
		return this.medfeeSumamt;
	}
	public void setMedfeeSumamt(String medfeeSumamt) {
		this.medfeeSumamt = medfeeSumamt;
	}

	public String getMedicalOrgId() {
		return this.medicalOrgId;
	}
	public void setMedicalOrgId(String medicalOrgId) {
		this.medicalOrgId = medicalOrgId;
	}

	public String getMedicalOrgName() {
		return this.medicalOrgName;
	}
	public void setMedicalOrgName(String medicalOrgName) {
		this.medicalOrgName = medicalOrgName;
	}

	public String getMedinsTypeName() {
		return this.medinsTypeName;
	}
	public void setMedinsTypeName(String medinsTypeName) {
		this.medinsTypeName = medinsTypeName;
	}

	public String getOthfundPayAmount() {
		return this.othfundPayAmount;
	}
	public void setOthfundPayAmount(String othfundPayAmount) {
		this.othfundPayAmount = othfundPayAmount;
	}

	public String getSelfPayAmount() {
		return this.selfPayAmount;
	}
	public void setSelfPayAmount(String selfPayAmount) {
		this.selfPayAmount = selfPayAmount;
	}

	public Date getSeltTime() {
		return this.seltTime;
	}
	public void setSeltTime(Date seltTime) {
		this.seltTime = seltTime;
	}

	public String getSetlId() {
		return this.setlId;
	}
	public void setSetlId(String setlId) {
		this.setlId = setlId;
	}

}
