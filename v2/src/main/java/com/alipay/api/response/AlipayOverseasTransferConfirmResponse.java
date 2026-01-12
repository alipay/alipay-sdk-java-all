package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.transfer.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-30 14:42:43
 */
public class AlipayOverseasTransferConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 2237881215291828133L;

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
