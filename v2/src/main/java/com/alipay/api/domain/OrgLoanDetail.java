package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构贷款详情
 *
 * @author auto create
 * @since 1.0, 2024-08-08 21:02:51
 */
public class OrgLoanDetail extends AlipayObject {

	private static final long serialVersionUID = 3381695632113282776L;

	/**
	 * 客户授信金额（审批金额），单位分
	 */
	@ApiField("credit_amt")
	private Long creditAmt;

	/**
	 * 是否为主产品：Y/N
	 */
	@ApiField("is_main_product")
	private String isMainProduct;

	/**
	 * 客户放款金额，单位分
	 */
	@ApiField("loan_amt")
	private Long loanAmt;

	/**
	 * 客户放款成功日期，yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("loan_date")
	private String loanDate;

	/**
	 * 客户贷款利率，类型为小数，代表百分比，比如 0.18 就是18%
	 */
	@ApiField("loan_rate")
	private String loanRate;

	/**
	 * 客户贷款期次，类型为数字，单位支持Y、M等，单位字段从loan_term_unit获取
	 */
	@ApiField("loan_term")
	private Long loanTerm;

	/**
	 * 客户贷款期次类型
Y、M分别代表年月，当前支持M
	 */
	@ApiField("loan_term_unit")
	private String loanTermUnit;

	/**
	 * 机构侧支用号
	 */
	@ApiField("org_drawdown_no")
	private String orgDrawdownNo;

	/**
	 * 还款方式 1：等额本金；2：等额本息；3：先息后本；4：一次性结清本息
	 */
	@ApiField("repay_type")
	private String repayType;

	public Long getCreditAmt() {
		return this.creditAmt;
	}
	public void setCreditAmt(Long creditAmt) {
		this.creditAmt = creditAmt;
	}

	public String getIsMainProduct() {
		return this.isMainProduct;
	}
	public void setIsMainProduct(String isMainProduct) {
		this.isMainProduct = isMainProduct;
	}

	public Long getLoanAmt() {
		return this.loanAmt;
	}
	public void setLoanAmt(Long loanAmt) {
		this.loanAmt = loanAmt;
	}

	public String getLoanDate() {
		return this.loanDate;
	}
	public void setLoanDate(String loanDate) {
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

}
