package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单还款预算接口
 *
 * @author auto create
 * @since 1.0, 2020-07-01 11:28:39
 */
public class MybankCreditLoantradeBillBudgetQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4593938516374952544L;

	/**
	 * 申请金额
	 */
	@ApiField("apply_amount")
	private MultiCurrencyMoney applyAmount;

	/**
	 * 账单编号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 外部统一编码，类似2018041701025002005 027088555
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 预算类型(本金试算PRIN_BUDGET或总额试算TOTAL_BUDGET)
	 */
	@ApiField("repay_budget_type")
	private String repayBudgetType;

	/**
	 * 用户的基本信息，包括支付宝id，site,steUserId等
	 */
	@ApiField("user")
	private UserVo user;

	public MultiCurrencyMoney getApplyAmount() {
		return this.applyAmount;
	}
	public void setApplyAmount(MultiCurrencyMoney applyAmount) {
		this.applyAmount = applyAmount;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRepayBudgetType() {
		return this.repayBudgetType;
	}
	public void setRepayBudgetType(String repayBudgetType) {
		this.repayBudgetType = repayBudgetType;
	}

	public UserVo getUser() {
		return this.user;
	}
	public void setUser(UserVo user) {
		this.user = user;
	}

}
