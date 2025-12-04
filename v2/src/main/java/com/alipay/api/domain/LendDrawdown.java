package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支用放款信息
 *
 * @author auto create
 * @since 1.0, 2025-09-18 16:03:33
 */
public class LendDrawdown extends AlipayObject {

	private static final long serialVersionUID = 5717634892586778283L;

	/**
	 * 机构侧支用号
	 */
	@ApiField("fin_drawdown_no")
	private String finDrawdownNo;

	/**
	 * 资方机构名称（全称）
	 */
	@ApiField("fin_org")
	private String finOrg;

	/**
	 * 资金利率，小数形式
	 */
	@ApiField("fund_rate")
	private String fundRate;

	/**
	 * 客户放款金额，单位分
	 */
	@ApiField("loan_amt")
	private Long loanAmt;

	/**
	 * 客户放款成功日期
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
	 */
	@ApiField("loan_term_unit")
	private String loanTermUnit;

	/**
	 * 贷款类型
	 */
	@ApiField("loan_type")
	private String loanType;

	/**
	 * 抵押率，小数形式
	 */
	@ApiField("mortgage_rate")
	private String mortgageRate;

	/**
	 * 机构侧支用号
	 */
	@ApiField("org_drawdown_no")
	private String orgDrawdownNo;

	/**
	 * 产品编码
一般固定为VMP，如需使用其他编码请详细咨询沟通
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 还款方式
	 */
	@ApiField("repay_type")
	private String repayType;

	/**
	 * 服务费率（融担费率、保险费率等），小数形式
	 */
	@ApiField("service_fee_rate")
	private String serviceFeeRate;

	/**
	 * 车辆估值，单位分
	 */
	@ApiField("valuate_price")
	private Long valuatePrice;

	public String getFinDrawdownNo() {
		return this.finDrawdownNo;
	}
	public void setFinDrawdownNo(String finDrawdownNo) {
		this.finDrawdownNo = finDrawdownNo;
	}

	public String getFinOrg() {
		return this.finOrg;
	}
	public void setFinOrg(String finOrg) {
		this.finOrg = finOrg;
	}

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

	public String getLoanType() {
		return this.loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getMortgageRate() {
		return this.mortgageRate;
	}
	public void setMortgageRate(String mortgageRate) {
		this.mortgageRate = mortgageRate;
	}

	public String getOrgDrawdownNo() {
		return this.orgDrawdownNo;
	}
	public void setOrgDrawdownNo(String orgDrawdownNo) {
		this.orgDrawdownNo = orgDrawdownNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
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

	public Long getValuatePrice() {
		return this.valuatePrice;
	}
	public void setValuatePrice(Long valuatePrice) {
		this.valuatePrice = valuatePrice;
	}

}
