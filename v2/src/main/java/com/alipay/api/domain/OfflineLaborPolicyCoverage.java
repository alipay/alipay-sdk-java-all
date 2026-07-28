package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保单保证责任
 *
 * @author auto create
 * @since 1.0, 2026-07-24 14:14:15
 */
public class OfflineLaborPolicyCoverage extends AlipayObject {

	private static final long serialVersionUID = 1211261929332812366L;

	/**
	 * 保障责任名称
	 */
	@ApiField("coverage_name")
	private String coverageName;

	/**
	 * 保障责任编号
	 */
	@ApiField("coverage_no")
	private String coverageNo;

	/**
	 * 该项生效结束时间
	 */
	@ApiField("effect_end_time")
	private Date effectEndTime;

	/**
	 * 该项生效开始时间
	 */
	@ApiField("effect_start_time")
	private Date effectStartTime;

	/**
	 * 是否不计免赔
	 */
	@ApiField("iop")
	private Long iop;

	/**
	 * 不计免赔保费，单位：分
	 */
	@ApiField("iop_premium")
	private Long iopPremium;

	/**
	 * 该项保费，单位：分
	 */
	@ApiField("premium")
	private Long premium;

	/**
	 * 该项保额，单位：分
	 */
	@ApiField("sum_insured")
	private Long sumInsured;

	public String getCoverageName() {
		return this.coverageName;
	}
	public void setCoverageName(String coverageName) {
		this.coverageName = coverageName;
	}

	public String getCoverageNo() {
		return this.coverageNo;
	}
	public void setCoverageNo(String coverageNo) {
		this.coverageNo = coverageNo;
	}

	public Date getEffectEndTime() {
		return this.effectEndTime;
	}
	public void setEffectEndTime(Date effectEndTime) {
		this.effectEndTime = effectEndTime;
	}

	public Date getEffectStartTime() {
		return this.effectStartTime;
	}
	public void setEffectStartTime(Date effectStartTime) {
		this.effectStartTime = effectStartTime;
	}

	public Long getIop() {
		return this.iop;
	}
	public void setIop(Long iop) {
		this.iop = iop;
	}

	public Long getIopPremium() {
		return this.iopPremium;
	}
	public void setIopPremium(Long iopPremium) {
		this.iopPremium = iopPremium;
	}

	public Long getPremium() {
		return this.premium;
	}
	public void setPremium(Long premium) {
		this.premium = premium;
	}

	public Long getSumInsured() {
		return this.sumInsured;
	}
	public void setSumInsured(Long sumInsured) {
		this.sumInsured = sumInsured;
	}

}
