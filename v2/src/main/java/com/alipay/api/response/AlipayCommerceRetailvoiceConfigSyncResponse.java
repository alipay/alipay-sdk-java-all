package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.retailvoice.config.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-20 10:07:53
 */
public class AlipayCommerceRetailvoiceConfigSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5787639763348765983L;

	/** 
	 * 同步任务id
	 */
	@ApiField("sync_task_id")
	private String syncTaskId;

	public void setSyncTaskId(String syncTaskId) {
		this.syncTaskId = syncTaskId;
	}
	public String getSyncTaskId( ) {
		return this.syncTaskId;
	}

}
