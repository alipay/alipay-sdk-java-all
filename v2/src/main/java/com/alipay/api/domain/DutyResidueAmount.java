package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商保支付-查询用户保单信息-责任剩余保额
 *
 * @author auto create
 * @since 1.0, 2026-01-05 13:53:07
 */
public class DutyResidueAmount extends AlipayObject {

	private static final long serialVersionUID = 6762351955828957639L;

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

	public String getWaitingPeriod() {
		return this.waitingPeriod;
	}
	public void setWaitingPeriod(String waitingPeriod) {
		this.waitingPeriod = waitingPeriod;
	}

}
