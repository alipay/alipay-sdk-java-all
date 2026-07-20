package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 放款信息
 *
 * @author auto create
 * @since 1.0, 2026-07-17 13:52:53
 */
public class AucLoanInfo extends AlipayObject {

	private static final long serialVersionUID = 7812533957351957762L;

	/**
	 * 资金利率
	 */
	@ApiField("fund_rate")
	private String fundRate;

	/**
	 * 客户放款金额，单位分
	 */
	@ApiField("loan_amt")
	private Long loanAmt;

	/**
	 * 放款成功时间
	 */
	@ApiField("loan_date")
	private Date loanDate;

	/**
	 * 客户贷款利率(部分机构称“综合利率”)
	 */
	@ApiField("loan_rate")
	private String loanRate;

	/**
	 * 客户贷款期次
	 */
	@ApiField("loan_term")
	private Long loanTerm;

	/**
	 * 客户贷款期次类型
Y、M、D分别代表年月日
	 */
	@ApiField("loan_term_unit")
	private String loanTermUnit;

	/**
	 * 机构侧支用号
	 */
	@ApiField("org_drawdown_no")
	private String orgDrawdownNo;

	/**
	 * 还款方式
	 */
	@ApiField("repay_type")
	private String repayType;

	/**
	 * 服务费率（融担费率、保险费率等）
注：如果不存在担保费率，则该字段不要传任何值（null）
	 */
	@ApiField("service_fee_rate")
	private String serviceFeeRate;

	public String getFundRate() {
		return this.fundRate;
	}
	public void setFundRate(String fundRate) {
		this.fundRate = fundRate;
	}

	public Long getLoanAmt() {
		return this.loanAmt;
	}
	public void setLoanAmt(Long loanAmt) {
		this.loanAmt = loanAmt;
	}

	public Date getLoanDate() {
		return this.loanDate;
	}
	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}

	public String getLoanRate() {
		return this.loanRate;
	}
	public void setLoanRate(String loanRate) {
		this.loanRate = loanRate;
	}

	public Long getLoanTerm() {
		return this.loanTerm;
	}
	public void setLoanTerm(Long loanTerm) {
		this.loanTerm = loanTerm;
	}

	public String getLoanTermUnit() {
		return this.loanTermUnit;
	}
	public void setLoanTermUnit(String loanTermUnit) {
		this.loanTermUnit = loanTermUnit;
	}

	public String getOrgDrawdownNo() {
		return this.orgDrawdownNo;
	}
	public void setOrgDrawdownNo(String orgDrawdownNo) {
		this.orgDrawdownNo = orgDrawdownNo;
	}

	public String getRepayType() {
		return this.repayType;
	}
	public void setRepayType(String repayType) {
		this.repayType = repayType;
	}

	public String getServiceFeeRate() {
		return this.serviceFeeRate;
	}
	public void setServiceFeeRate(String serviceFeeRate) {
		this.serviceFeeRate = serviceFeeRate;
	}

}
