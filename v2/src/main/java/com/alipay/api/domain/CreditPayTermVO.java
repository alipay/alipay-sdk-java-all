package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用支付期限视图
 *
 * @author auto create
 * @since 1.0, 2022-10-18 20:16:30
 */
public class CreditPayTermVO extends AlipayObject {

	private static final long serialVersionUID = 3833577795252814461L;

	/**
	 * 期限结束日期
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 开始日期
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 期数
	 */
	@ApiField("term")
	private Long term;

	/**
	 * 期限单位
	 */
	@ApiField("term_unit")
	private String termUnit;

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Long getTerm() {
		return this.term;
	}
	public void setTerm(Long term) {
		this.term = term;
	}

	public String getTermUnit() {
		return this.termUnit;
	}
	public void setTermUnit(String termUnit) {
		this.termUnit = termUnit;
	}

}
