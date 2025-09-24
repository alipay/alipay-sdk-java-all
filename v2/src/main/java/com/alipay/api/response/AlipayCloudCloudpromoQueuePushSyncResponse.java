package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.queue.push.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-26 10:49:39
 */
public class AlipayCloudCloudpromoQueuePushSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2432137529445412455L;

	/** 
	 * 同步订单
	 */
	@ApiField("queue_sync")
	private String queueSync;

	public void setQueueSync(String queueSync) {
		this.queueSync = queueSync;
	}
	public String getQueueSync( ) {
		return this.queueSync;
	}

}
