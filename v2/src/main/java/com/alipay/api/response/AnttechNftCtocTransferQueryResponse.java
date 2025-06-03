package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.ctoc.transfer.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-17 17:37:28
 */
public class AnttechNftCtocTransferQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4839445965825199347L;

	/** 
	 * 交易状态, 枚举如下
卖家确认中-TRANSFER_CONFIRMING
卖家已经确认-TRANSFER_CONFIRMED
卖家拒绝此次交易流转-TRANSFER_REJECTED
卖家已经确认，流转中-TRANSFERRING
买家未接收，交易超时取消关单-TRANSFER_OVERDUE
流转卖家已经确认，但买家拒绝此次交易流转-RECEIVER_REJECT
流转卖家已经确认，买家完成接收-RECEIVER_ACCEPT
资产流转异常，交易取消-TRANSFER_FAILED
	 */
	@ApiField("transfer_status")
	private String transferStatus;

	public void setTransferStatus(String transferStatus) {
		this.transferStatus = transferStatus;
	}
	public String getTransferStatus( ) {
		return this.transferStatus;
	}

}
