package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AmountWf;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.wf.repaymentamt.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 00:44:55
 */
public class MybankCreditSupplychainWfRepaymentamtQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7674191544745463889L;

	/** 
	 * 总余额，单位分
出账前：只有本金，不包含利息
出账后及逾期后：包含本金+利息+罚息
（原因：只有出账后才会对账单进行结息）
	 */
	@ApiField("totalbalance")
	private AmountWf totalbalance;

	public void setTotalbalance(AmountWf totalbalance) {
		this.totalbalance = totalbalance;
	}
	public AmountWf getTotalbalance( ) {
		return this.totalbalance;
	}

}
