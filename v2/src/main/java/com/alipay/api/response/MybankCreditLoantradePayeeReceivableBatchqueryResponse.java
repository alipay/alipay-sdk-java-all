package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CreditPayReceivableVO;
import com.alipay.api.domain.CreditPayMoneyVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.payee.receivable.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:55
 */
public class MybankCreditLoantradePayeeReceivableBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6484528345385175714L;

	/** 
	 * 应收列表
	 */
	@ApiListField("receivable_list")
	@ApiField("credit_pay_receivable_v_o")
	private List<CreditPayReceivableVO> receivableList;

	/** 
	 * 总计应收金额
	 */
	@ApiField("total_rcv_amt")
	private CreditPayMoneyVO totalRcvAmt;

	public void setReceivableList(List<CreditPayReceivableVO> receivableList) {
		this.receivableList = receivableList;
	}
	public List<CreditPayReceivableVO> getReceivableList( ) {
		return this.receivableList;
	}

	public void setTotalRcvAmt(CreditPayMoneyVO totalRcvAmt) {
		this.totalRcvAmt = totalRcvAmt;
	}
	public CreditPayMoneyVO getTotalRcvAmt( ) {
		return this.totalRcvAmt;
	}

}
