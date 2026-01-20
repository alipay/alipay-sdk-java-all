package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.rent.sign.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 16:01:21
 */
public class AlipayEbppIndustryRentSignSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2764913844674217945L;

	/** 
	 * 签约状态同步成功
	 */
	@ApiField("sync_status")
	private Boolean syncStatus;

	public void setSyncStatus(Boolean syncStatus) {
		this.syncStatus = syncStatus;
	}
	public Boolean getSyncStatus( ) {
		return this.syncStatus;
	}

}
