package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 责任列表
 *
 * @author auto create
 * @since 1.0, 2025-06-05 11:14:56
 */
public class CoverageLiability extends AlipayObject {

	private static final long serialVersionUID = 5327194467815858446L;

	/**
	 * 赔付次数
	 */
	@ApiField("compensation_times")
	private Long compensationTimes;

	/**
	 * 免赔额
单位：币种标准单位，如：人民币-元（保留2位小数）
	 */
	@ApiField("deductible")
	private String deductible;

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
	 * 责任的唯一标识
	 */
	@ApiField("liability_no")
	private String liabilityNo;

	/**
	 * 责任保额
单位：币种标准单位，如：人民币-元（保留2位小数）
	 */
	@ApiField("sum_insured")
	private String sumInsured;

	/**
	 * 等待期结束时间
YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("wait_period_end")
	private Date waitPeriodEnd;

	public Long getCompensationTimes() {
		return this.compensationTimes;
	}
	public void setCompensationTimes(Long compensationTimes) {
		this.compensationTimes = compensationTimes;
	}

	public String getDeductible() {
		return this.deductible;
	}
	public void setDeductible(String deductible) {
		this.deductible = deductible;
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

	public String getSumInsured() {
		return this.sumInsured;
	}
	public void setSumInsured(String sumInsured) {
		this.sumInsured = sumInsured;
	}

	public Date getWaitPeriodEnd() {
		return this.waitPeriodEnd;
	}
	public void setWaitPeriodEnd(Date waitPeriodEnd) {
		this.waitPeriodEnd = waitPeriodEnd;
	}

}
