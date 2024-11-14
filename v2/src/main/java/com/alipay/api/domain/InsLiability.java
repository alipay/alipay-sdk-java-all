package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 险种责任
 *
 * @author auto create
 * @since 1.0, 2019-12-09 15:22:25
 */
public class InsLiability extends AlipayObject {

	private static final long serialVersionUID = 3696624893215254411L;

	/**
	 * 保额
	 */
	@ApiField("coverage")
	private String coverage;

	/**
	 * 是否可以编辑,0-可选; 1-不可选,不支持; 2-必选,目前不打开
	 */
	@ApiField("disabled")
	private String disabled;

	/**
	 * 不计免赔 0，1，2
	 */
	@ApiField("iop")
	private String iop;

	/**
	 * 不计免赔保费
	 */
	@ApiField("iop_premium")
	private String iopPremium;

	/**
	 * 责任描述
	 */
	@ApiField("liability_desc")
	private String liabilityDesc;

	/**
	 * 责任名称
	 */
	@ApiField("liability_name")
	private String liabilityName;

	/**
	 * 责任编码
	 */
	@ApiField("liability_no")
	private String liabilityNo;

	/**
	 * 责任保费
	 */
	@ApiField("liability_premium")
	private String liabilityPremium;

	/**
	 * 责任险种比率
	 */
	@ApiField("liability_rates")
	private String liabilityRates;

	/**
	 * options
	 */
	@ApiListField("options")
	@ApiField("ins_option")
	private List<InsOption> options;

	/**
	 * 责任保费
	 */
	@ApiField("premium")
	private String premium;

	/**
	 * 保额
	 */
	@ApiField("sum_insured")
	private InsSumInsured sumInsured;

	public String getCoverage() {
		return this.coverage;
	}
	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}

	public String getDisabled() {
		return this.disabled;
	}
	public void setDisabled(String disabled) {
		this.disabled = disabled;
	}

	public String getIop() {
		return this.iop;
	}
	public void setIop(String iop) {
		this.iop = iop;
	}

	public String getIopPremium() {
		return this.iopPremium;
	}
	public void setIopPremium(String iopPremium) {
		this.iopPremium = iopPremium;
	}

	public String getLiabilityDesc() {
		return this.liabilityDesc;
	}
	public void setLiabilityDesc(String liabilityDesc) {
		this.liabilityDesc = liabilityDesc;
	}

	public String getLiabilityName() {
		return this.liabilityName;
	}
	public void setLiabilityName(String liabilityName) {
		this.liabilityName = liabilityName;
	}

	public String getLiabilityNo() {
		return this.liabilityNo;
	}
	public void setLiabilityNo(String liabilityNo) {
		this.liabilityNo = liabilityNo;
	}

	public String getLiabilityPremium() {
		return this.liabilityPremium;
	}
	public void setLiabilityPremium(String liabilityPremium) {
		this.liabilityPremium = liabilityPremium;
	}

	public String getLiabilityRates() {
		return this.liabilityRates;
	}
	public void setLiabilityRates(String liabilityRates) {
		this.liabilityRates = liabilityRates;
	}

	public List<InsOption> getOptions() {
		return this.options;
	}
	public void setOptions(List<InsOption> options) {
		this.options = options;
	}

	public String getPremium() {
		return this.premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}

	public InsSumInsured getSumInsured() {
		return this.sumInsured;
	}
	public void setSumInsured(InsSumInsured sumInsured) {
		this.sumInsured = sumInsured;
	}

}
