package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 到账播报推送
 *
 * @author auto create
 * @since 1.0, 2023-07-05 14:52:29
 */
public class AlipayCommerceIotVoicemodelSyncvoiceSendModel extends AlipayObject {

	private static final long serialVersionUID = 4356977214519438751L;

	/**
	 * 服务调用上下文
	 */
	@ApiField("context")
	private ServiceModelContext context;

	/**
	 * 到账播报内容模型
	 */
	@ApiField("sync_data")
	private SyncVoiceVO syncData;

	public ServiceModelContext getContext() {
		return this.context;
	}
	public void setContext(ServiceModelContext context) {
		this.context = context;
	}

	public SyncVoiceVO getSyncData() {
		return this.syncData;
	}
	public void setSyncData(SyncVoiceVO syncData) {
		this.syncData = syncData;
	}

}
