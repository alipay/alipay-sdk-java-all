package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.retailvoice.config.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-18 18:57:50
 */
public class AlipayCommerceRetailvoiceConfigSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4772819644989678142L;

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
