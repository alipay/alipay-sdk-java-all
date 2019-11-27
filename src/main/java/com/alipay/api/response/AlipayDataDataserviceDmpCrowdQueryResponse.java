package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.dmp.crowd.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayDataDataserviceDmpCrowdQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4296948223375131683L;

	/** 
	 * 人群同步任务执行状态，目前有三种状态：1:开始，2:成功，3:失败
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
