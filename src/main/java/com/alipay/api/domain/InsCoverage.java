package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 险种
 *
 * @author auto create
 * @since 1.0, 2017-07-18 15:36:58
 */
public class InsCoverage extends AlipayObject {

	private static final long serialVersionUID = 4582542993613639827L;

	/**
	 * 险种名称
	 */
	@ApiField("coverage_name")
	private String coverageName;

	/**
	 * 险种编号
	 */
	@ApiField("coverage_no")
	private String coverageNo;

	/**
	 * 险种失效时间
	 */
	@ApiField("effect_end_time")
	private String effectEndTime;

	/**
	 * 险种生效时间
	 */
	@ApiField("effect_start_time")
	private String effectStartTime;

	/**
	 * 不计免赔;0：默认不投保;
1：默认投保。
	 */
	@ApiField("iop")
	private Long iop;

	/**
	 * 不计免赔的保费
	 */
	@ApiField("iop_premium")
	private Long iopPremium;

	/**
	 * 保费;单位分
	 */
	@ApiField("premium")
	private Long premium;

	/**
	 * 保额;单位分
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

	public String getEffectEndTime() {
		return this.effectEndTime;
	}
	public void setEffectEndTime(String effectEndTime) {
		this.effectEndTime = effectEndTime;
	}

	public String getEffectStartTime() {
		return this.effectStartTime;
	}
	public void setEffectStartTime(String effectStartTime) {
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
