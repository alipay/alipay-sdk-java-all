package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.queue.push.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-26 15:57:11
 */
public class AlipayCloudCloudpromoQueuePushSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3356986616399169273L;

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
