package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BillRepayBudgetVO;
import com.alipay.api.domain.RefuseVo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.bill.budget.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-01 11:30:24
 */
public class MybankCreditLoantradeBillBudgetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6783548869927751147L;

	/** 
	 * 预算明细
	 */
	@ApiField("bill_repay_budget")
	private BillRepayBudgetVO billRepayBudget;

	/** 
	 * 不可见不可用信息
	 */
	@ApiField("refuse_msg")
	private RefuseVo refuseMsg;

	/** 
	 * 标识本次请求是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setBillRepayBudget(BillRepayBudgetVO billRepayBudget) {
		this.billRepayBudget = billRepayBudget;
	}
	public BillRepayBudgetVO getBillRepayBudget( ) {
		return this.billRepayBudget;
	}

	public void setRefuseMsg(RefuseVo refuseMsg) {
		this.refuseMsg = refuseMsg;
	}
	public RefuseVo getRefuseMsg( ) {
		return this.refuseMsg;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
