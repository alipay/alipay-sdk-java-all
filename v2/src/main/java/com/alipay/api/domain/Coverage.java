package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 险别内容
 *
 * @author auto create
 * @since 1.0, 2025-06-05 11:14:56
 */
public class Coverage extends AlipayObject {

	private static final long serialVersionUID = 7852978824875496641L;

	/**
	 * 责任列表
	 */
	@ApiListField("coverage_liability_list")
	@ApiField("coverage_liability")
	private List<CoverageLiability> coverageLiabilityList;

	/**
	 * 险种名称
	 */
	@ApiField("coverage_name")
	private String coverageName;

	/**
	 * 险种编号，险种的唯一标识
	 */
	@ApiField("coverage_no")
	private String coverageNo;

	/**
	 * 险种终止时间 
YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("effect_end_time")
	private Date effectEndTime;

	/**
	 * 险种生效时间 
YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("effect_start_time")
	private Date effectStartTime;

	/**
	 * 是否主险，枚举值
	 */
	@ApiField("main_coverage")
	private String mainCoverage;

	/**
	 * 险种保费
单位：币种标准单位，如：人民币-元（保留2位小数）
	 */
	@ApiField("premium")
	private String premium;

	/**
	 * 险种状态，枚举值
	 */
	@ApiField("status")
	private String status;

	/**
	 * 险种保额
单位：币种标准单位，如：人民币-元（保留2位小数）
	 */
	@ApiField("sum_insured")
	private String sumInsured;

	public List<CoverageLiability> getCoverageLiabilityList() {
		return this.coverageLiabilityList;
	}
	public void setCoverageLiabilityList(List<CoverageLiability> coverageLiabilityList) {
		this.coverageLiabilityList = coverageLiabilityList;
	}

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

	public String getMainCoverage() {
		return this.mainCoverage;
	}
	public void setMainCoverage(String mainCoverage) {
		this.mainCoverage = mainCoverage;
	}

	public String getPremium() {
		return this.premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSumInsured() {
		return this.sumInsured;
	}
	public void setSumInsured(String sumInsured) {
		this.sumInsured = sumInsured;
	}

}
