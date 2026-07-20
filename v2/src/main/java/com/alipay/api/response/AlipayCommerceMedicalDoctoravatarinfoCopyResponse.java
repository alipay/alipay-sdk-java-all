package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.doctoravatarinfo.copy response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-26 15:17:44
 */
public class AlipayCommerceMedicalDoctoravatarinfoCopyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2837121317668734675L;

	/** 
	 * 医生头像同步任务id
	 */
	@ApiField("pic_sync_task_id")
	private String picSyncTaskId;

	public void setPicSyncTaskId(String picSyncTaskId) {
		this.picSyncTaskId = picSyncTaskId;
	}
	public String getPicSyncTaskId( ) {
		return this.picSyncTaskId;
	}

}
