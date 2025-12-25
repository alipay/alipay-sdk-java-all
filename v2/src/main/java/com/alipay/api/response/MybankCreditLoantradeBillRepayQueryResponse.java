package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RefuseVo;
import com.alipay.api.domain.BillRepayResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.bill.repay.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 00:01:45
 */
public class MybankCreditLoantradeBillRepayQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5359316211516148593L;

	/** 
	 * 调用失败报错信息
	 */
	@ApiField("refuse_msg")
	private RefuseVo refuseMsg;

	/** 
	 * 账单还款结果
	 */
	@ApiField("repay_result")
	private BillRepayResult repayResult;

	/** 
	 * 是否调用成功
	 */
	@ApiField("succ")
	private Boolean succ;

	public void setRefuseMsg(RefuseVo refuseMsg) {
		this.refuseMsg = refuseMsg;
	}
	public RefuseVo getRefuseMsg( ) {
		return this.refuseMsg;
	}

	public void setRepayResult(BillRepayResult repayResult) {
		this.repayResult = repayResult;
	}
	public BillRepayResult getRepayResult( ) {
		return this.repayResult;
	}

	public void setSucc(Boolean succ) {
		this.succ = succ;
	}
	public Boolean getSucc( ) {
		return this.succ;
	}

}
