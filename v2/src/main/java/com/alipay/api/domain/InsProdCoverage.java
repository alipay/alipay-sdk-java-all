package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保险产品对应的险种;
 *
 * @author auto create
 * @since 1.0, 2019-12-09 15:22:25
 */
public class InsProdCoverage extends AlipayObject {

	private static final long serialVersionUID = 6467491522348919498L;

	/**
	 * 险种描述
	 */
	@ApiField("coverage_desc")
	private String coverageDesc;

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
	 * 是否定期险种
	 */
	@ApiField("is_fixed_period")
	private Boolean isFixedPeriod;

	/**
	 * 险种责任列表
	 */
	@ApiListField("liabilities")
	@ApiField("ins_liability")
	private List<InsLiability> liabilities;

	/**
	 * 可用的保障期限列表;约定“1D”代表一天，“1M”代表一个月,"1Y"代表一年
	 */
	@ApiListField("periods")
	@ApiField("string")
	private List<String> periods;

	/**
	 * 保额
	 */
	@ApiField("sum_insured")
	private InsSumInsured sumInsured;

	public String getCoverageDesc() {
		return this.coverageDesc;
	}
	public void setCoverageDesc(String coverageDesc) {
		this.coverageDesc = coverageDesc;
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

	public Boolean getIsFixedPeriod() {
		return this.isFixedPeriod;
	}
	public void setIsFixedPeriod(Boolean isFixedPeriod) {
		this.isFixedPeriod = isFixedPeriod;
	}

	public List<InsLiability> getLiabilities() {
		return this.liabilities;
	}
	public void setLiabilities(List<InsLiability> liabilities) {
		this.liabilities = liabilities;
	}

	public List<String> getPeriods() {
		return this.periods;
	}
	public void setPeriods(List<String> periods) {
		this.periods = periods;
	}

	public InsSumInsured getSumInsured() {
		return this.sumInsured;
	}
	public void setSumInsured(InsSumInsured sumInsured) {
		this.sumInsured = sumInsured;
	}

}
