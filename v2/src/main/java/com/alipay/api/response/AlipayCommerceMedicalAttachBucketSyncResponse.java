package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.attach.bucket.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-14 13:57:53
 */
public class AlipayCommerceMedicalAttachBucketSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5217374568364317678L;

	/** 
	 * 同步标识
	 */
	@ApiField("sync_flag")
	private Boolean syncFlag;

	public void setSyncFlag(Boolean syncFlag) {
		this.syncFlag = syncFlag;
	}
	public Boolean getSyncFlag( ) {
		return this.syncFlag;
	}

}
