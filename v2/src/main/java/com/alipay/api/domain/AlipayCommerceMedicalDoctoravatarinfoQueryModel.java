package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人像克隆信息查询
 *
 * @author auto create
 * @since 1.0, 2026-02-26 15:17:44
 */
public class AlipayCommerceMedicalDoctoravatarinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8783392255289876562L;

	/**
	 * 医生头像同步任务id
	 */
	@ApiField("pic_sync_task_id")
	private String picSyncTaskId;

	public String getPicSyncTaskId() {
		return this.picSyncTaskId;
	}
	public void setPicSyncTaskId(String picSyncTaskId) {
		this.picSyncTaskId = picSyncTaskId;
	}

}
