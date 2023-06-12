package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.transfer.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 22:44:38
 */
public class AlipayOverseasTransferConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 5197388368315677641L;

	/** 
	 * {}
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	/** 
	 * 汇款id
	 */
	@ApiField("transfer_id")
	private String transferId;

	public void setPassThroughInfo(String passThroughInfo) {
		this.passThroughInfo = passThroughInfo;
	}
	public String getPassThroughInfo( ) {
		return this.passThroughInfo;
	}

	public void setTransferId(String transferId) {
		this.transferId = transferId;
	}
	public String getTransferId( ) {
		return this.transferId;
	}

}
