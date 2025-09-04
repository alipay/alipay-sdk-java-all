package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.insserviceprod.lightserprogress.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-02 15:37:38
 */
public class AlipayInsSceneInsserviceprodLightserprogressSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4761475272578531338L;

	/** 
	 * 蚂蚁进度明细编号(业务主键)
	 */
	@ApiField("progress_no")
	private String progressNo;

	public void setProgressNo(String progressNo) {
		this.progressNo = progressNo;
	}
	public String getProgressNo( ) {
		return this.progressNo;
	}

}
