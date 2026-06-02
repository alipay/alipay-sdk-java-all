package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.ecny.fund.batchtransfer.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-14 10:17:45
 */
public class MybankEcnyFundBatchtransferCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2865472535416248986L;

	/** 
	 * 转账页面跳转地址
	 */
	@ApiField("ecny_batch_transfer_url")
	private String ecnyBatchTransferUrl;

	/** 
	 * 网商银行订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 由双方约定分配值
	 */
	@ApiField("out_request_from")
	private String outRequestFrom;

	/** 
	 * 调用方订单号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public void setEcnyBatchTransferUrl(String ecnyBatchTransferUrl) {
		this.ecnyBatchTransferUrl = ecnyBatchTransferUrl;
	}
	public String getEcnyBatchTransferUrl( ) {
		return this.ecnyBatchTransferUrl;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOutRequestFrom(String outRequestFrom) {
		this.outRequestFrom = outRequestFrom;
	}
	public String getOutRequestFrom( ) {
		return this.outRequestFrom;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

}
