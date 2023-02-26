package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.jobworth.quickhire.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 20:16:40
 */
public class ZhimaCustomerJobworthQuickhireSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5332356843965853328L;

	/** 
	 * 同步结果，true代表同步成功，false代表同步失败，如果为false，商户需要重试
	 */
	@ApiField("sync_result")
	private Boolean syncResult;

	public void setSyncResult(Boolean syncResult) {
		this.syncResult = syncResult;
	}
	public Boolean getSyncResult( ) {
		return this.syncResult;
	}

}
