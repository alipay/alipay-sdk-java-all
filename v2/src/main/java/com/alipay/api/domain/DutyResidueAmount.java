package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商保支付-查询用户保单信息-责任剩余保额
 *
 * @author auto create
 * @since 1.0, 2026-04-21 14:02:43
 */
public class DutyResidueAmount extends AlipayObject {

	private static final long serialVersionUID = 1172419289176772661L;

	/**
	 * 保障详情
	 */
	@ApiField("benefit_detail")
	private String benefitDetail;

	/**
	 * 剩余理赔次数
	 */
	@ApiField("claim_count")
	private Long claimCount;

	/**
	 * 理赔责任编码
	 */
	@ApiField("claim_duty_code")
	private String claimDutyCode;

	/**
	 * 理赔责任名称
	 */
	@ApiField("claim_duty_name")
	private String claimDutyName;

	/**
	 * 100%赔付次数
	 */
	@ApiField("claim_times_100_percent")
	private String claimTimes100Percent;

	/**
	 * 单位：元 保留俩位小数
	 */
	@ApiField("duty_deductible_excess")
	private String dutyDeductibleExcess;

	/**
	 * 示例：100.00
单位：元
保留俩位小数
	 */
	@ApiField("duty_init_amount")
	private String dutyInitAmount;

	/**
	 * 责任剩余保额，单位：元，保留俩位小数
	 */
	@ApiField("duty_residue_amount")
	private String dutyResidueAmount;

	/**
	 * 拓展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 单项年度免赔额剩余
	 */
	@ApiField("item_self_annual_payment_remain")
	private String itemSelfAnnualPaymentRemain;

	/**
	 * 父责任节点
	 */
	@ApiField("parent_claim_duty_code")
	private String parentClaimDutyCode;

	/**
	 * 备注中文
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 备注英文
	 */
	@ApiField("remark_en")
	private String remarkEn;

	/**
	 * 自付比例
	 */
	@ApiField("self_ratio")
	private String selfRatio;

	/**
	 * 单次自付额
	 */
	@ApiField("single_deductible")
	private String singleDeductible;

	/**
	 * 次限额
	 */
	@ApiField("sub_quota")
	private String subQuota;

	/**
	 * 单位
	 */
	@ApiField("unit")
	private String unit;

	/**
	 * 已使用次数
	 */
	@ApiField("used_times")
	private String usedTimes;

	/**
	 * 等待期,单位：天。
	 */
	@ApiField("waiting_period")
	private String waitingPeriod;

	public String getBenefitDetail() {
		return this.benefitDetail;
	}
	public void setBenefitDetail(String benefitDetail) {
		this.benefitDetail = benefitDetail;
	}

	public Long getClaimCount() {
		return this.claimCount;
	}
	public void setClaimCount(Long claimCount) {
		this.claimCount = claimCount;
	}

	public String getClaimDutyCode() {
		return this.claimDutyCode;
	}
	public void setClaimDutyCode(String claimDutyCode) {
		this.claimDutyCode = claimDutyCode;
	}

	public String getClaimDutyName() {
		return this.claimDutyName;
	}
	public void setClaimDutyName(String claimDutyName) {
		this.claimDutyName = claimDutyName;
	}

	public String getClaimTimes100Percent() {
		return this.claimTimes100Percent;
	}
	public void setClaimTimes100Percent(String claimTimes100Percent) {
		this.claimTimes100Percent = claimTimes100Percent;
	}

	public String getDutyDeductibleExcess() {
		return this.dutyDeductibleExcess;
	}
	public void setDutyDeductibleExcess(String dutyDeductibleExcess) {
		this.dutyDeductibleExcess = dutyDeductibleExcess;
	}

	public String getDutyInitAmount() {
		return this.dutyInitAmount;
	}
	public void setDutyInitAmount(String dutyInitAmount) {
		this.dutyInitAmount = dutyInitAmount;
	}

	public String getDutyResidueAmount() {
		return this.dutyResidueAmount;
	}
	public void setDutyResidueAmount(String dutyResidueAmount) {
		this.dutyResidueAmount = dutyResidueAmount;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getItemSelfAnnualPaymentRemain() {
		return this.itemSelfAnnualPaymentRemain;
	}
	public void setItemSelfAnnualPaymentRemain(String itemSelfAnnualPaymentRemain) {
		this.itemSelfAnnualPaymentRemain = itemSelfAnnualPaymentRemain;
	}

	public String getParentClaimDutyCode() {
		return this.parentClaimDutyCode;
	}
	public void setParentClaimDutyCode(String parentClaimDutyCode) {
		this.parentClaimDutyCode = parentClaimDutyCode;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemarkEn() {
		return this.remarkEn;
	}
	public void setRemarkEn(String remarkEn) {
		this.remarkEn = remarkEn;
	}

	public String getSelfRatio() {
		return this.selfRatio;
	}
	public void setSelfRatio(String selfRatio) {
		this.selfRatio = selfRatio;
	}

	public String getSingleDeductible() {
		return this.singleDeductible;
	}
	public void setSingleDeductible(String singleDeductible) {
		this.singleDeductible = singleDeductible;
	}

	public String getSubQuota() {
		return this.subQuota;
	}
	public void setSubQuota(String subQuota) {
		this.subQuota = subQuota;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getUsedTimes() {
		return this.usedTimes;
	}
	public void setUsedTimes(String usedTimes) {
		this.usedTimes = usedTimes;
	}

	public String getWaitingPeriod() {
		return this.waitingPeriod;
	}
	public void setWaitingPeriod(String waitingPeriod) {
		this.waitingPeriod = waitingPeriod;
	}

}
