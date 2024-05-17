package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CustScpBillAmtVO;
import com.alipay.api.domain.CustScpInstallmentBudgetVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.trade.billrepaybudget.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-14 21:00:32
 */
public class MybankCreditSupplychainTradeBillrepaybudgetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7195367124365746811L;

	/** 
	 * 账单金额明细
	 */
	@ApiField("bill_amt_detail")
	private CustScpBillAmtVO billAmtDetail;

	/** 
	 * 是否可以还款
	 */
	@ApiField("can_repay")
	private Boolean canRepay;

	/** 
	 * exempt_amt:减免金额
	 */
	@ApiField("exempt_amt")
	private String exemptAmt;

	/** 
	 * 分期明细
	 */
	@ApiListField("install_budget_detail_list")
	@ApiField("cust_scp_installment_budget_v_o")
	private List<CustScpInstallmentBudgetVO> installBudgetDetailList;

	/** 
	 * 外部账款编号
	 */
	@ApiField("out_order")
	private String outOrder;

	/** 
	 * 账单状态：WAIT_RECEIPT:待供应商收款,RECEIPTED:供应商已收款,CLEAR:已结清,OVERDUE:逾期 ,INVALID:失效 ,CANCEL:取消
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 账单总金额
	 */
	@ApiField("total_amt")
	private String totalAmt;

	public void setBillAmtDetail(CustScpBillAmtVO billAmtDetail) {
		this.billAmtDetail = billAmtDetail;
	}
	public CustScpBillAmtVO getBillAmtDetail( ) {
		return this.billAmtDetail;
	}

	public void setCanRepay(Boolean canRepay) {
		this.canRepay = canRepay;
	}
	public Boolean getCanRepay( ) {
		return this.canRepay;
	}

	public void setExemptAmt(String exemptAmt) {
		this.exemptAmt = exemptAmt;
	}
	public String getExemptAmt( ) {
		return this.exemptAmt;
	}

	public void setInstallBudgetDetailList(List<CustScpInstallmentBudgetVO> installBudgetDetailList) {
		this.installBudgetDetailList = installBudgetDetailList;
	}
	public List<CustScpInstallmentBudgetVO> getInstallBudgetDetailList( ) {
		return this.installBudgetDetailList;
	}

	public void setOutOrder(String outOrder) {
		this.outOrder = outOrder;
	}
	public String getOutOrder( ) {
		return this.outOrder;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTotalAmt(String totalAmt) {
		this.totalAmt = totalAmt;
	}
	public String getTotalAmt( ) {
		return this.totalAmt;
	}

}
