package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碎屏险投保
 *
 * @author auto create
 * @since 1.0, 2021-05-31 16:52:52
 */
public class AlipayInsSceneApplicationMobileApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2629893462787185842L;

	/**
	 * 投保人
	 */
	@ApiField("applicant")
	private InsPerson applicant;

	/**
	 * 设备信息
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 渠道来源
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 保险失效时间
	 */
	@ApiField("effective_end_time")
	private Date effectiveEndTime;

	/**
	 * 保单生效时间
	 */
	@ApiField("effective_start_time")
	private Date effectiveStartTime;

	/**
	 * 被保人信息
	 */
	@ApiField("insured")
	private InsPerson insured;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 保障期限 数字加单位，单位包括Y/M/D/H
	 */
	@ApiField("period")
	private String period;

	/**
	 * 保险保费
	 */
	@ApiField("premium")
	private Long premium;

	/**
	 * 维修类型，官修/非官修
	 */
	@ApiField("repair_type")
	private String repairType;

	/**
	 * 标准产品ID
	 */
	@ApiField("sp_no")
	private String spNo;

	public InsPerson getApplicant() {
		return this.applicant;
	}
	public void setApplicant(InsPerson applicant) {
		this.applicant = applicant;
	}

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Date getEffectiveEndTime() {
		return this.effectiveEndTime;
	}
	public void setEffectiveEndTime(Date effectiveEndTime) {
		this.effectiveEndTime = effectiveEndTime;
	}

	public Date getEffectiveStartTime() {
		return this.effectiveStartTime;
	}
	public void setEffectiveStartTime(Date effectiveStartTime) {
		this.effectiveStartTime = effectiveStartTime;
	}

	public InsPerson getInsured() {
		return this.insured;
	}
	public void setInsured(InsPerson insured) {
		this.insured = insured;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public Long getPremium() {
		return this.premium;
	}
	public void setPremium(Long premium) {
		this.premium = premium;
	}

	public String getRepairType() {
		return this.repairType;
	}
	public void setRepairType(String repairType) {
		this.repairType = repairType;
	}

	public String getSpNo() {
		return this.spNo;
	}
	public void setSpNo(String spNo) {
		this.spNo = spNo;
	}

}
