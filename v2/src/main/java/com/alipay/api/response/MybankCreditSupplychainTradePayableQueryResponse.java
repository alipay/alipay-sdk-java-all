package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.trade.payable.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:54
 */
public class MybankCreditSupplychainTradePayableQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4112284156833235813L;

	/** 
	 * 待付金额，电票预付票据未到期=应付总金额-已付金额，票据到期兑付后=0
	 */
	@ApiField("debt_amt")
	private String debtAmt;

	/** 
	 * 应付到期日
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/** 
	 * 是否足额扣款（是则待付100必须一次性还清100）
本次电票预付该值为false
	 */
	@ApiField("if_enough")
	private Boolean ifEnough;

	/** 
	 * 是否需要还款试算
如果付款的时候需要根据付款金额试算利息,费用的话,则该值会为true，本次电票预付该值为false
	 */
	@ApiField("if_need_budget")
	private Boolean ifNeedBudget;

	/** 
	 * 逾期金额，电票预付到期兑付后若发生垫款，则该值=垫款（代偿）金额
	 */
	@ApiField("overdue_amt")
	private String overdueAmt;

	/** 
	 * 已付金额，电票预付对应已追加保证金金额
	 */
	@ApiField("paid_amt")
	private String paidAmt;

	/** 
	 * 应付总金额，电票预付对应订单金额
	 */
	@ApiField("total_amt")
	private String totalAmt;

	public void setDebtAmt(String debtAmt) {
		this.debtAmt = debtAmt;
	}
	public String getDebtAmt( ) {
		return this.debtAmt;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public Date getExpireDate( ) {
		return this.expireDate;
	}

	public void setIfEnough(Boolean ifEnough) {
		this.ifEnough = ifEnough;
	}
	public Boolean getIfEnough( ) {
		return this.ifEnough;
	}

	public void setIfNeedBudget(Boolean ifNeedBudget) {
		this.ifNeedBudget = ifNeedBudget;
	}
	public Boolean getIfNeedBudget( ) {
		return this.ifNeedBudget;
	}

	public void setOverdueAmt(String overdueAmt) {
		this.overdueAmt = overdueAmt;
	}
	public String getOverdueAmt( ) {
		return this.overdueAmt;
	}

	public void setPaidAmt(String paidAmt) {
		this.paidAmt = paidAmt;
	}
	public String getPaidAmt( ) {
		return this.paidAmt;
	}

	public void setTotalAmt(String totalAmt) {
		this.totalAmt = totalAmt;
	}
	public String getTotalAmt( ) {
		return this.totalAmt;
	}

}
