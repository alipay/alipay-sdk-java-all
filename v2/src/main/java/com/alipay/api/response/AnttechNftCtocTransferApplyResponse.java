package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.ctoc.transfer.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-17 17:07:27
 */
public class AnttechNftCtocTransferApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2875346997197479687L;

	/** 
	 * 业务单号
	 */
	@ApiField("biz_id")
	private String bizId;

	/** 
	 * 交易状态
失败:TRANSFER_FAILED
转赠发起确认中:TRANSFER_CONFIRMING
已转赠成功:TRANSFER_ACCEPT
	 */
	@ApiField("transfer_status")
	private String transferStatus;

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public String getBizId( ) {
		return this.bizId;
	}

	public void setTransferStatus(String transferStatus) {
		this.transferStatus = transferStatus;
	}
	public String getTransferStatus( ) {
		return this.transferStatus;
	}

}
