package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退款查询明细
 *
 * @author auto create
 * @since 1.0, 2026-07-21 17:02:51
 */
public class RefundQueryResult extends AlipayObject {

	private static final long serialVersionUID = 4531675545953854945L;

	/**
	 * 请求流水号
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 转支付退款结果
	 */
	@ApiField("transfer_refund_results")
	private String transferRefundResults;

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTransferRefundResults() {
		return this.transferRefundResults;
	}
	public void setTransferRefundResults(String transferRefundResults) {
		this.transferRefundResults = transferRefundResults;
	}

}
