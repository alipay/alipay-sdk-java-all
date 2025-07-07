package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.ecny.entwallet.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-22 18:33:55
 */
public class MybankEcnyEntwalletCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4219829148154214159L;

	/** 
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 受理流水号，受理成功时必填
	 */
	@ApiField("process_no")
	private String processNo;

	/** 
	 * 钱包开立状态：PROCESSING-处理中；SUCCESS-成功；FAIL-失败
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
