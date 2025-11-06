package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卖进订单子活动任务状态同步
 *
 * @author auto create
 * @since 1.0, 2025-09-08 10:45:44
 */
public class AlipayOfflineProviderNsalesSubactivitySyncModel extends AlipayObject {

	private static final long serialVersionUID = 6455338581831454896L;

	/**
	 * 卖进订单子活动同步状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 卖进任务子活动id
	 */
	@ApiField("sub_activity_id")
	private String subActivityId;

	/**
	 * 用于标记本次推进的原因，多用于非正常推进时标记具体原因。
	 */
	@ApiField("sync_memo")
	private String syncMemo;

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubActivityId() {
		return this.subActivityId;
	}
	public void setSubActivityId(String subActivityId) {
		this.subActivityId = subActivityId;
	}

	public String getSyncMemo() {
		return this.syncMemo;
	}
	public void setSyncMemo(String syncMemo) {
		this.syncMemo = syncMemo;
	}

}
