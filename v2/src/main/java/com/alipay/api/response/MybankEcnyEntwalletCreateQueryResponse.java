package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.ecny.entwallet.create.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 00:31:36
 */
public class MybankEcnyEntwalletCreateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6886824682841894455L;

	/** 
	 * 外部请求号，受理成功时必填
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 受理流水号，受理成功时必填
	 */
	@ApiField("process_no")
	private String processNo;

	/** 
	 * 钱包开立状态：PROCESSING-处理中；WAIT_VERIFY-意愿确认；SUCCESS-成功；FAIL-失败
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 钱包ID，钱包开立成功时必填
	 */
	@ApiField("wallet_id")
	private String walletId;

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setProcessNo(String processNo) {
		this.processNo = processNo;
	}
	public String getProcessNo( ) {
		return this.processNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}
	public String getWalletId( ) {
		return this.walletId;
	}

}
