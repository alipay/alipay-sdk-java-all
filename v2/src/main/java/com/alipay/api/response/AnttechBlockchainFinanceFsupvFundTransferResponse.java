package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.fsupv.fund.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-28 10:32:03
 */
public class AnttechBlockchainFinanceFsupvFundTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 6223761851378135226L;

	/** 
	 * 受理单号
	 */
	@ApiField("accepted_no")
	private String acceptedNo;

	/** 
	 * 描述请求结果非已受理时的原因
	 */
	@ApiField("mark")
	private String mark;

	/** 
	 * 资金划拨单状态；描述该次资金管控任务执行结果。由于合约化的资金管控划拨是异步执行，该字段只返回受理情况，资金到账情况可通过入账通知消息获取
	 */
	@ApiField("status")
	private String status;

	public void setAcceptedNo(String acceptedNo) {
		this.acceptedNo = acceptedNo;
	}
	public String getAcceptedNo( ) {
		return this.acceptedNo;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getMark( ) {
		return this.mark;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
