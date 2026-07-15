package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.aics.devin.clue.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-26 10:49:28
 */
public class DatadigitalAicsDevinClueSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8369641552369687312L;

	/** 
	 * 同步线索业务数据后的返回数据ID
	 */
	@ApiField("data_id")
	private String dataId;

	public void setDataId(String dataId) {
		this.dataId = dataId;
	}
	public String getDataId( ) {
		return this.dataId;
	}

}
